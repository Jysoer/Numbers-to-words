
public class NumberTranslator {
    private String translatedNumber = "";
    private StringBuilder wholeNumber = new StringBuilder("");
    private StringBuilder pointCase = new StringBuilder("");
    private String minus = "";


    NumberTranslator(String number) {
        this.translatedNumber = number;
    }

    String getTranslatedNumber() {
        checkMinus();
        numberToWords();
        delimiterHandling();
        return translatedNumber = minus+wholeNumber+pointCase.toString();
    }

    String checkMinus(){
        if (translatedNumber.charAt(0) == '-'){
            minus = "minus ";
            translatedNumber = translatedNumber.substring(1);
        }
        return minus;
    }

    String delimiterHandling() {
        String digit = "";
        char delimiter;
        char target1 = '.';
        char target2 = ',';

        if (translatedNumber.contains(String.valueOf(target1)) || translatedNumber.contains(String.valueOf(target2))) {
            pointCase.append("point");
            int delimiterCounter = 1;

            if (translatedNumber.contains(String.valueOf(target1))) {
                delimiter = target1;
            } else {
                delimiter = target2;
            }

            for (int i = translatedNumber.indexOf(delimiter) + 1; i < translatedNumber.length(); i++) {
                if (translatedNumber.charAt(i) == '0') {
                    digit = "zero";
                }
                if (translatedNumber.charAt(i) == '1') {
                    digit = "one";
                }
                if (translatedNumber.charAt(i) == '2') {
                    digit = "two";
                }
                if (translatedNumber.charAt(i) == '3') {
                    digit = "three";
                }
                if (translatedNumber.charAt(i) == '4') {
                    digit = "four";
                }
                if (translatedNumber.charAt(i) == '5') {
                    digit = "five";
                }
                if (translatedNumber.charAt(i) == '6') {
                    digit = "six";
                }
                if (translatedNumber.charAt(i) == '7') {
                    digit = "seven";
                }
                if (translatedNumber.charAt(i) == '8') {
                    digit = "eight";
                }
                if (translatedNumber.charAt(i) == '9') {
                    digit = "nine";
                }
                pointCase.append(" ").append(digit);
                delimiterCounter++;
            }
            translatedNumber = translatedNumber.substring(0, translatedNumber.length() - delimiterCounter);
        }
        return pointCase.toString();
    }

    String numberToWords() {
        String delimiterForTens = "-";
        String delimiterForBigNumbers = "and ";
        String zero = "zero ";
        String bill = "billion ";
        String mill = "million ";
        String tho = "thousand ";
        String hun = "hundred ";
        String one = "one ";
        String two = "two ";
        String three = "three ";
        String four = "four ";
        String five = "five ";
        String six = "six ";
        String seven = "seven ";
        String eight = "eight ";
        String nine = "nine ";
        String ten = "ten ";
        String eleven = "eleven ";
        String twelve = "twelve ";
        String thirteen = "thirteen ";
        String fourteen = "fourteen ";
        String fifteen = "fifteen ";
        String sixteen = "sixteen ";
        String seventeen = "seventeen ";
        String eighteen = "eighteen ";
        String nineteen = "nineteen ";
        String twenty = "twenty";
        String thirty = "thirty";
        String forty = "forty";
        String fifty = "fifty";
        String sixty = "sixty";
        String seventy = "seventy";
        String eighty = "eighty";
        String ninety = "ninety";

        for (int i = 0; i < translatedNumber.length(); i++) {
            if (translatedNumber.length()-i != 1 && translatedNumber.charAt(i)=='0' && translatedNumber.matches("0{" + i + "}.+")){
                continue;
            }

            if (translatedNumber.charAt(i) == '0' && translatedNumber.length() == 1) {
                wholeNumber.append(zero);
            }

            if ((translatedNumber.length() - i) % 3 == 0) {
                if (translatedNumber.charAt(i) == '0') {
                }
                if (translatedNumber.charAt(i) == '1') {
                    wholeNumber.append(one);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '2') {
                    wholeNumber.append(two);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '3') {
                    wholeNumber.append(three);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '4') {
                    wholeNumber.append(four);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '5') {
                    wholeNumber.append(five);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '6') {
                    wholeNumber.append(six);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '7') {
                    wholeNumber.append(seven);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '8') {
                    wholeNumber.append(eight);
                    wholeNumber.append(hun);
                }
                if (translatedNumber.charAt(i) == '9') {
                    wholeNumber.append(nine);
                    wholeNumber.append(hun);
                }
                i++;
            }


            if ((translatedNumber.length() - i) % 3 == 2) {

                if (translatedNumber.charAt(i) == '0' && translatedNumber.charAt(i) - 1 != '0') {
                    wholeNumber.append(delimiterForBigNumbers);
                }

                else if (translatedNumber.charAt(i) == '1') {
                    if (translatedNumber.length() - i % 3 > 2) {
                        if (translatedNumber.charAt(i) =='0') {
                            wholeNumber.append(ten);
                        }
                        if (translatedNumber.charAt(i) == '1') {
                            wholeNumber.append(eleven);
                        }
                        if (translatedNumber.charAt(i) == '2') {
                            wholeNumber.append(twelve);
                        }
                        if (translatedNumber.charAt(i) == '3') {
                            wholeNumber.append(thirteen);
                        }
                        if (translatedNumber.charAt(i) == '4') {
                            wholeNumber.append(fourteen);
                        }
                        if (translatedNumber.charAt(i) == '5') {
                            wholeNumber.append(fifteen);
                        }
                        if (translatedNumber.charAt(i) == '6') {
                            wholeNumber.append(sixteen);
                        }
                        if (translatedNumber.charAt(i) == '7') {
                            wholeNumber.append(seventeen);
                        }
                        if (translatedNumber.charAt(i) == '8') {
                            wholeNumber.append(eighteen);
                        }
                        if (translatedNumber.charAt(i) == '9') {
                            wholeNumber.append(nineteen);
                        }
                        i++;
                    }
                }
                if (translatedNumber.charAt(i) == '2') {
                    wholeNumber.append(twenty);
                }
                if (translatedNumber.charAt(i) == '3') {
                    wholeNumber.append(thirty);
                }
                if (translatedNumber.charAt(i) == '4') {
                    wholeNumber.append(forty);
                }
                if (translatedNumber.charAt(i) == '5') {
                    wholeNumber.append(fifty);
                }
                if (translatedNumber.charAt(i) == '6') {
                    wholeNumber.append(sixty);
                }
                if (translatedNumber.charAt(i) == '7') {
                    wholeNumber.append(seventy);
                }
                if (translatedNumber.charAt(i) == '8') {
                    wholeNumber.append(eighty);
                }
                if (translatedNumber.charAt(i) == '9') {
                    wholeNumber.append(ninety);
                }


                i++;
            }
//&& translatedNumber.charAt(i)+1 != '0'

            if ((translatedNumber.length() - i) % 3 == 1) {
                if(translatedNumber.charAt(i-1) > '1' && translatedNumber.charAt(i-1) <= '9') {
                    wholeNumber.append(delimiterForTens);
                }

                if (translatedNumber.charAt(i) == '0') {
                }
                if (translatedNumber.charAt(i) == '1') {
                    wholeNumber.append(one);
                }
                if (translatedNumber.charAt(i) == '2') {
                    wholeNumber.append(two);
                }
                if (translatedNumber.charAt(i) == '3') {
                    wholeNumber.append(three);
                }
                if (translatedNumber.charAt(i) == '4') {
                    wholeNumber.append(four);
                }
                if (translatedNumber.charAt(i) == '5') {
                    wholeNumber.append(five);
                }
                if (translatedNumber.charAt(i) == '6') {
                    wholeNumber.append(six);
                }
                if (translatedNumber.charAt(i) == '7') {
                    wholeNumber.append(seven);
                }
                if (translatedNumber.charAt(i) == '8') {
                    wholeNumber.append(eight);
                }
                if (translatedNumber.charAt(i) == '9') {
                    wholeNumber.append(nine);
                }


                if (translatedNumber.length()-i + 2> 9) {
                    wholeNumber.append(bill);
                }
                if (translatedNumber.length() - i + 2 > 7 && translatedNumber.length() - i + 2 < 10) {
                    wholeNumber.append(mill);
                } else if (translatedNumber.length() - i + 2 > 3 && translatedNumber.length() - i + 2 < 7) {
                    wholeNumber.append(tho);
                }
            }
        }
        return wholeNumber.toString();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReader {
    private String number = "";

    public void readNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            number = bufferedReader.readLine();

            if (number.equals("")) {
                System.out.println("Field can't be empty\nWrite your number again");
            }
            else if (number.matches("(-?[0-9]{0,12}|[0]{1})[.,]?[0-9]{0,2}")) {
                break;
            }
            else{
                System.out.println("Something wrong. \nWrite your number in the range ### ### ### ###.##:");
            }
        }
        bufferedReader.close();
    }

    public String getNumber(){
        return number;
    }
}

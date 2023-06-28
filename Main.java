import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.out.println("Write your number in the range ### ### ### ###.##:");
        NumberReader numberReader = new NumberReader();
        numberReader.readNumber();
        NumberTranslator numberTranslator = new NumberTranslator(numberReader.getNumber());
        System.out.println(numberTranslator.getTranslatedNumber());
    }
}
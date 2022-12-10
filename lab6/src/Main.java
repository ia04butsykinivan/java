import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();

        translator.addPair("hello", "привіт");
        translator.addPair("world", "світ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = translator.translate(input);

        System.out.println(output);
    }
}
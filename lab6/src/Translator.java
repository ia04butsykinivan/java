import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    HashMap<String, String> dictionary = new HashMap<>();

    public void addPair(String eu, String ua) {
        dictionary.put(eu, ua);
    }

    public String translate(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            String eu = word.toLowerCase();

            output.append(dictionary.getOrDefault(eu, "unknown"));

            output.append(" ");

        }

        return output.toString();
    }
}

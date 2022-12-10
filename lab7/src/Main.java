import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] data = {
                "German Shepherd", "Bulldog", "Labrador Retriever",
                "Golden Retriever", "Siberian Husky", "French Bulldog",
                "Poodle", "Chihuahua", "Alaskan Malamute",
                "Border Collie", "Airedale Terrier", "Afghan Hound"
        };

        System.out.println("Smaller strings length: ");
        printStringsByCondition(data, "SMALLER");

        System.out.println();

        System.out.println("Bigger strings length: ");
        printStringsByCondition(data, "BIGGER");
    }

    static void printStringsByCondition(String[] data, String condition) {
        int mediumLength = calculateMediumLength(data);

        Arrays.stream(data)
                .filter(s -> condition.equals("SMALLER") ? s.length() <= mediumLength : s.length() >= mediumLength)
                .forEach(System.out::println);
    }

    static int calculateMediumLength(String[] data) {
        int totalLength = Arrays.stream(data).map(String::length).reduce(0, Integer::sum);

        return totalLength / data.length;
    }
}
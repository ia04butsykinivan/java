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

        for (int i = 0; i < data.length; i++) {
            if (data[i].length() <= mediumLength && condition.equals("SMALLER")) {
                System.out.println(data[i]);
            }

            if (data[i].length() >= mediumLength && condition.equals("BIGGER")) {
                System.out.println(data[i]);
            }
        }
    }

    static int calculateMediumLength(String[] data) {
        int totalLength = 0;

        for (int i = 0; i < data.length; i++) {
            totalLength = totalLength + data[i].length();
        }

        return totalLength / data.length;
    }
}
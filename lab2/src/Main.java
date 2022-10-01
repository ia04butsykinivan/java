import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
//        Gson gson = new Gson();
//
//        Person initialPerson = new Person("Ivan", 19);
//        String convertedInitialPerson = gson.toJson(initialPerson);
//        Person receivedPerson = gson.fromJson(convertedInitialPerson, Person.class);
//        System.out.println(initialPerson.equals(receivedPerson));

        // Task 2
        ArrayList<JournalNote> journal = new ArrayList<JournalNote>();

        Scanner in = new Scanner(System.in);

        String FIRST_NAME_REGEX = "[A-Z][a-z]*";
        String LAST_NAME_REGEX = "[A-Z][a-z]*";
        String BIRTHDAY_REGEX = "^\\d{4}-\\d{2}-\\d{2}$";
        String PHONE_REGEX = "^\\d{10}$";

        while (true) {
            String firstName = "";
            while (!firstName.matches(FIRST_NAME_REGEX)) {
                System.out.println("First Name");
                firstName = in.nextLine();
            }

            String lastName = "";
            while (!lastName.matches(LAST_NAME_REGEX)) {
                System.out.println("Last Name");
                lastName = in.nextLine();
            }

            String birthday = "";
            while (!birthday.matches(BIRTHDAY_REGEX)) {
                System.out.println("Birthday (YYYY-MM-DD)");
                birthday = in.nextLine();
            }

            String phone = "";
            while (!phone.matches(PHONE_REGEX)) {
                System.out.println("Phone");
                phone = in.nextLine();
            }

            String address = "";
            while (address.length() == 0) {
                System.out.println("Address");
                address = in.nextLine();
            }

            JournalNote note = new JournalNote(firstName, lastName, birthday, phone, address);
            journal.add(note);

            System.out.println(journal);
        }
    }
}
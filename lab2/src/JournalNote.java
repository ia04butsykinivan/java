public class JournalNote {
    String firstName;
    String lastName;
    String birthday;
    String phone;
    String address;

    public JournalNote(String firstName, String lastName, String birthday, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "JournalNote{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

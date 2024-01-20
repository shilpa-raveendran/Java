package mobilephoneChallenge;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {

        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}

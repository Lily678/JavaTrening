package ru.test.selenium.addressbook;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private byte[] photo;

    public Contact(String firstName, String middleName, String lastName, byte[] photo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte[] getPhoto() {
        return photo;
    }
}


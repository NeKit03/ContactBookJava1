package org.example.ContactBook;

import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {
    private HashMap<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.put(name, contact);
        } else {
            contacts.get(name).addPhoneNumber(phoneNumber);
        }
    }

    public Contact getContact(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        if(contacts.containsKey(name)){
            contacts.remove(name);
        }else{
            Print.errorKey(2);
        }
    }

    public void printContacts() {
        for (String name : contacts.keySet()) {
            Contact contact = contacts.get(name);
            System.out.println("Name: " + contact.getName() + ", Phone Numbers:");
            ArrayList<String> numbers = contact.getPhoneNumber();
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println((i + 1) + ") " + numbers.get(i));
            }
            System.out.println();
        }
    }


}

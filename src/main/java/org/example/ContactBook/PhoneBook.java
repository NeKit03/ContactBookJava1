package org.example.ContactBook;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class PhoneBook {
    private HashMap<String, Contact> contacts;
    private HashMap<Integer, String> contctsSort;
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
        List<Map.Entry<String, Contact>> entryList = new ArrayList<>(contacts.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Contact>>() {
            @Override
            public int compare(Map.Entry<String, Contact> o1, Map.Entry<String, Contact> o2) {
                return o2.getValue().getSize().compareTo(o1.getValue().getSize());
            }
        });
        for (Map.Entry<String, Contact> entry : entryList) {
            Contact contact = entry.getValue();
            System.out.println("Name: " + contact.getName() + ", Phone Numbers:");
            ArrayList<String> numbers = contact.getPhoneNumber();
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println((i + 1) + ") " + numbers.get(i));
            }
            System.out.println();
        }
    }


}

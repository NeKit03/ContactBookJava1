package org.example.ContactBook;
import java.util.ArrayList;
import java.util.HashMap;

public class Contact {
    private String name;
    private ArrayList<String> PhoneNumber;

    public Contact(String name,String PhoneNumber){
        this.name=name;
        this.PhoneNumber= new ArrayList<>();
        this.PhoneNumber.add(PhoneNumber);

    }
    public String getName(){
        return name;
    }
    public ArrayList<String> getPhoneNumber(){
        return PhoneNumber;
    }
    public void addPhoneNumber(String phoneNumber) {
        this.PhoneNumber.add(phoneNumber);
    }

}

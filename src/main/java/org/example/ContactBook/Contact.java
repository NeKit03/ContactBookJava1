package org.example.ContactBook;
import java.util.ArrayList;
import java.util.HashMap;

public class Contact {
    private String name;
    private ArrayList<String> PhoneNumber;
    private Integer size;

    public Contact(String name,String PhoneNumber){
        this.name=name;
        this.PhoneNumber= new ArrayList<>();
        this.PhoneNumber.add(PhoneNumber);
        this.size=1;

    }
    public String getName(){
        return name;
    }
    public ArrayList<String> getPhoneNumber(){
        return PhoneNumber;
    }
    public Integer getSize(){
        return size;
    }
    public void addPhoneNumber(String phoneNumber) {
        this.size+=1;
        this.PhoneNumber.add(phoneNumber);
    }


}

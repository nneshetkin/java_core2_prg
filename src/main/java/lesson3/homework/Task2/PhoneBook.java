package lesson3.homework.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private  final Map<String,List<String>> phoneBook;

    public PhoneBook(){
         this.phoneBook= new HashMap<String, List<String>>();

    }
public void add (String surename,String phoneNumber){
        if (phoneBook.containsKey(surename)) phoneBook.get(surename).add(phoneNumber);
       else phoneBook.put(surename,new ArrayList<>());
        phoneBook.get(surename).add(phoneNumber);
}

public  List<String> get(String surname){
        return phoneBook.get(surname);
}

}

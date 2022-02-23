package lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
  Map<String, ArrayList<String>> phoneMap = new HashMap<>();

  public void add(String lastName, String phoneNumber){
    ArrayList<String> phones = phoneMap.get(lastName);
    if (phones != null) {
      phones.add(phoneNumber);
    } else {
      phones = new ArrayList<>();
      phones.add(phoneNumber);
      phoneMap.put(lastName,phones);
    }

  }

  public List<String> get(String lastName){
        if (phoneMap.containsKey(lastName)){
          return phoneMap.get(lastName);
        }
        return new ArrayList<>();
  }





}

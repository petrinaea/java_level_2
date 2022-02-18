package lesson_3;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Первое задание
    int count = 0;
    String[] array = {"стол", "стол", "дерево", "таблица", "два", "стол", "один", "радуга", "кино", "зонт", "один", "крыло", "сова", "работа"};
    Map<String, Integer> resultMap = new HashMap<>();
    for (String s : array) {
      String temp = s;
      if (!resultMap.containsKey(temp)) {
        resultMap.put(temp, 1);
      } else {
        resultMap.put(temp, resultMap.get(temp) + 1);
      }
    }
    System.out.println(resultMap); // сколько раз встречается каждое слово

    Set<String> set = new HashSet<String>(List.of(array));
    System.out.println(set); // вывод без повторений


    // Второе задание
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.add("Petrov", "123");
    phoneBook.add("Sidorov", "567");
    phoneBook.add("Ivanova", "897");
    phoneBook.add("Ivanova", "566654685");
    phoneBook.add("Sokolova", "324");
    phoneBook.add("Plotnikova", "764");
    phoneBook.add("Putin", "984");

    System.out.println(phoneBook.get("Ivanova"));


  }
}

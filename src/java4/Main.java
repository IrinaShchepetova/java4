package java4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //1. Создаем массив слов
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("banana");
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("pear");
        arrayList.add("avocado");
        arrayList.add("lemon");
        arrayList.add("lime");
        arrayList.add("orange");
        arrayList.add("banana");
        //Выводим
        System.out.println(arrayList);
        //Выводим список уникальных слов
        HashSet<String> hashList = new HashSet<>(arrayList);
        System.out.println(hashList);
        //Считаем сколько раз встречается каждое слово
        Map<String, Long> frequency= arrayList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequency.forEach((k,v) -> System.out.println(k+ ": " +v));


        //2. Создаем телефонную книгу
        PhoneBook phoneBook = new PhoneBook();
        // Добавляем записи
        phoneBook.add("8989", "Petrov");
        phoneBook.add("8988", "Ivanov");
        phoneBook.add("8987", "Petrov");
        phoneBook.add("8986", "Sokolov");
        phoneBook.add("8985", "Kozlov");
        phoneBook.add("8984", "Ivanov");
        phoneBook.add("8983", "Petrov");
        // Ищем номер по фамилии
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}

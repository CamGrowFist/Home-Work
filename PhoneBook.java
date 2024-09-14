import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new HashSet<>()).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иван", "1234567890");
        phoneBook.add("Алеша", "9876543210");
        phoneBook.add("Иван", "5555555555");

        System.out.println("Номера телефонов Ивана: " + phoneBook.get("Иван"));
        System.out.println("Номера телефонов Алеши: " + phoneBook.get("Алеша"));
        System.out.println("Номера телефонов Анны: " + phoneBook.get("Анна"));
    }
}
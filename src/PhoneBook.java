import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Book contact = new Book();
        contact.add("Willis", 2320082);
        contact.add("Alexeev", 7320082);
        contact.add("Chaplin", 2320081);
        contact.add("Simonov", 5555505);
        contact.add("Alexeev", 1234567);
        contact.get("Alexeev");
    }
}
class Book {
    HashMap<String, HashSet<Integer>> contact1;

    Book() {
        this.contact1 = new HashMap<>();
    }
    void add(String name, int num) {
        HashSet<Integer> contact = contact1.getOrDefault(name, new HashSet<>());
        contact.add(num);
        contact1.put(name, contact);
    }

    void get(String name) {
        System.out.printf("%nКонтакт + "+name+": "+ contact1.getOrDefault(name, new HashSet<>()));
    }
}



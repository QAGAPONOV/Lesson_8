import java.util.*;

public class Name {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Николай");
        names.add("Bob");
        names.add("Алексей");
        names.add("Иван");
        names.add("Ваня");
        names.add("Саша");
        names.add("Alex");
        names.add("Nik");
        names.add("Jek");
        names.add("Arnold");
        names.add("Bob");
        names.add("Jon");
        names.add("Алексей");
        names.add("Николай");
        names.add("Иван");
        names.add("Ян");
        names.add("Иван");
        names.add("Николай");
        names.add("Александр");
        names.add("Сергей");
        System.out.printf("Список имён: %n" +names);

        Set<String> stringSet = new LinkedHashSet<>(names);
        System.out.printf("%nУникальные имена:%n " + stringSet);

        HashMap<String, Integer> doubleNames = new HashMap<>();
        Integer doubleName = null;
        for (String i : names) {
            doubleName = doubleNames.get(i);
            doubleNames.put(i, doubleName == null ? 1 : doubleName + 1);
        }
        System.out.printf("%nКоличество имён:%n" + doubleNames);
    }
}

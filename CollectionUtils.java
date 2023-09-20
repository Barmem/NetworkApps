//Задача 4. Напишите метод, который на вход получает коллекцию объектов, а
//возвращает коллекцию уже без дубликатов.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
public class CollectionUtils {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("Jane");
        names.add("Jane");
        names.add("John");

        Collection<String> uniqueNames = removeDuplicates(names);

        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

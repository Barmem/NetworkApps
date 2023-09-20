//Задача 2. Напишите метод, который получает на вход Map<K, V> и возвращает Map,
//где ключи и значения поменяны местами. Для упрощения задачи
//мапа должна быть с ключами типа String и значениями типа Integer.

import java.util.HashMap;
import java.util.Map;

public class MapUtils {
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> map) {
        Map<V, K> switchedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            switchedMap.put(value, key);
        }
        return switchedMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("player", 1);
        originalMap.put("friend", 2);
        originalMap.put("enemy", 3);

        Map<Integer, String> switchedMap = swapKeysAndValues(originalMap);

        for (Map.Entry<Integer, String> entry : switchedMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}
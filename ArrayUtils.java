//Задача 5. Напишите метод fill, который принимает массив объектов, и реализацию
//интерфейса Function. Метод fill должен заполнить массив, получая новое значение по
//индексу с помощью реализации интерфейса Function.

import java.util.function.Function;
public class ArrayUtils {
    public static <T> void fill(T[] array, Function<Integer, T> valueProvider) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valueProvider.apply(i);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        fill(numbers, index -> index * 2);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

//Задача 3. Написать свой итератор по массиву.

import java.util.Iterator;
public class CustomArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int currentIndex;

    public CustomArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T element = array[currentIndex];
        currentIndex++;
        return element;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        CustomArrayIterator<Integer> iterator = new CustomArrayIterator<>(numbers);
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}

//1 задача. Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У класса должен быть метод convert, который делает конвертацию.

public class BaseConverter {
    public static double[] convert(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 9 / 5 + 32;
        return new double[]{kelvin, fahrenheit};
    }


    public static void main(String[] args) {
        double celsius = 36.6;
        double[] results = convert(celsius);
        double kelvin = results[0];
        double fahrenheit = results[1];
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit:" + fahrenheit);
    }
}
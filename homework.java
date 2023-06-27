package homework;

//  Пусть дан произвольный список целых чисел.
//  1) Найти максимальное значение
//  2) Найти минимальное значение
//  3) Найти среднее значение
//  4) Нужно удалить из него чётные числа

import java.util.*;

public class homework {
    public static void main(String[] args) {

        int upperbound = 10;
        int maxVal = 0, sum = 0;

        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < upperbound; i++) {
            numbers.add(rand.nextInt(upperbound));
        }

        System.out.println("Произвольный список целых чисел" + numbers);

        int minVal = numbers.get(0);

        for (int i = 0; i < upperbound; i++) {
            if (numbers.get(i) > maxVal) {
                maxVal = numbers.get(i);
            }
            if (numbers.get(i) < minVal) {
                minVal = numbers.get(i);
            }
            sum += numbers.get(i);
        }

        int avgVal = sum / upperbound;

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Максимальное значение = " + maxVal);
        System.out.println("Минимальное значение = " + minVal);
        System.out.println("Среднее значение = " + avgVal);
        System.out.println("Список нечётных чисел" + numbers);
    }
}

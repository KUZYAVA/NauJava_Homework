package homework_2;

import java.util.ArrayList;
import java.util.Random;

public class Task2_3 {

    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.print("Введите количество элементов: ");
            n = new java.util.Scanner(System.in).nextInt();
        }

        ArrayList<Double> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextDouble() * 100);
        }

        System.out.println("Исходный список:");
        printNumbers(numbers);

        bubbleSort(numbers);

        System.out.println("Отсортированный список:");
        printNumbers(numbers);
    }

    public static void bubbleSort(ArrayList<Double> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    double temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void printNumbers(ArrayList<Double> numbers) {
        for (Double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

package homework_2;

import java.util.Random;
import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100) - 50; // Числа в диапазоне от -50 до 49
        }

        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxAbsValue = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(array[i]) > maxAbsValue) {
                maxAbsValue = Math.abs(array[i]);
            }
        }

        System.out.println("Максимальное значение по модулю: " + maxAbsValue);
    }
}

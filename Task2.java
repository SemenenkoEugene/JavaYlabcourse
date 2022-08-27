package Week1;

import java.util.Arrays;

/**
 * Отсортируйте массив [5,6,3,2,5,1,4,9]
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println("Представленный массив: " + Arrays.toString(array));
        System.out.println("------------------------");

        Arrays.sort(array);
        System.out.println("Отсортированный массив методом \"sort\" " + Arrays.toString(array));
        System.out.println("------------------------");

        for (int i = 0; i < args.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        System.out.println("Отсортированный массив методом \"Сортировка пузырьком\" " + Arrays.toString(array));
    }
}

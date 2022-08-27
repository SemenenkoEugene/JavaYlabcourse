package Week1;


/**
 * заполните массив случайными числами и выведите максимальное, минимальное и среднее значение
 */

public class Task1 {

    public static int a = 41;
    public static int c = 11119;
    public static int m = 11113;
    public static int seed = 1;

    public static int getNextRandom() {
        seed = (a * seed + c) % m;
        return seed;
    }

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        System.out.println("--------------------------");
        System.out.println("Массив случайных чисел");
        for (int i = 0; i < array.length; i++) {
            int[] ints = array[i];
            for (int j = 0; j < ints.length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальное число в массиве " + max);
        System.out.println("--------------------------");

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Минамальное число в массиве " + min);
        System.out.println("--------------------------");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        int avg = sum / (array.length * array[0].length);
        System.out.println("Среднее значение в массиве " + avg);
        System.out.println("--------------------------");
    }
}

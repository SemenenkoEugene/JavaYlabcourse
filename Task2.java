package Week1;

/**
 * Отсортируйте массив [5,6,3,2,5,1,4,9]
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        System.out.println("Представленный массив");
        printArray(array);
        System.out.println("----------------------");

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Отсоритированный массив");
        printArray(array);
        System.out.println("----------------------");
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}

package HomeWork3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i] - 1);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }
        System.out.println(Arrays.toString(array100));
        System.out.println();

        int[] array10 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array10));
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] < 6) {
                array10[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array10));
        System.out.println();

        int[][] square = new int[10][10];
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[square.length - 1 - i][i] = 1;
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[] minMax = new int[100];
        Random random1 = new Random();
        for (int i = 0; i < minMax.length; i++) {
            minMax[i] = random1.nextInt(100);
        }
        System.out.println(Arrays.toString(minMax));
        int max = 0;
        int min = 100;
        for (int element : minMax) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

        System.out.println();

        int[] arr = {1, 1, 1, 2, 1};
        System.out.println(checkSumLeftRight(arr));


        int[] arrA = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arrA));
        doingShiftArray(arrA, -1);
        System.out.println(Arrays.toString(arrA));


    }

    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    private static boolean checkSumLeftRight(int[] array) {
        int sumLeft = 0;
        int sum = 0;

        for (int element :
                array) {
            sum += element;
        }

        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            if (sumLeft == (sum - sumLeft))
                return true;
        }
        return false;
    }

    private static void doingShiftArray(int[] array, int n) {

        int m = n % array.length;
        if (n == 0 || m == 0) {
            return;
        }

        if (m > 0) {

            for (int i = 0; i < m; i++) {

                int temp = array[array.length - 1];

                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }

        } else {
            for (int i = 0; i > m; i--) {

                int temp = array[0];

                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = temp;

            }
        }
    }

}

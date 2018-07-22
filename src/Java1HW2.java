import java.util.Arrays;

/**
 * Java1. Homework2
 *
 * @version dated Jul 15, 2018
 * @authors Irina Poberey
 */
public class Java1HW2 {

    public static void main(String[] args) {

        arr1();
        arr2();
        arr3();
        arr4();
        int[] arr = {5, 9, 1, 0, 8, 4, 7};
        minMax(arr);
        System.out.println(checkBalance());
        System.out.println(Arrays.toString(shiftArray(arr, 3)));

    }

    static void arr1() {

        int[] mas1 = {0, 1, 1, 0, 0, 1, 0};
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 0) {
                mas1[i] = 1;
            } else {
                mas1[i] = 0;
            }
            System.out.println(mas1[i]);
        }
    }

    static void arr2() {

        int[] mas2 = new int[8];

        for (int i = 0, j = 0; i < mas2.length; i++, j = j + 3) {

            mas2[i] = j;

            System.out.println(mas2[i]);
        }
    }

    static void arr3() {

        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < mas3.length; i++) {
            if (mas3[i] < 6) {
                mas3[i] = mas3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(mas3));

    }

    static void arr4() {

        int counter = 1;
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || i + j == 9) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = counter;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    static void minMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min + " Max = " + max);

    }


    static boolean checkBalance() {

        int[] arr = {4, 2, 8, 3, 0, 2, 7, 2};

        int i = 0;
        int j = arr.length - 1;
        int iSum = 0;
        int jSum = 0;

        while (j >= i) {
            if (iSum <= jSum) {
                iSum += arr[i];
                i++;
            } else {
                jSum += arr[j];
                j--;
            }

            System.out.println("iSum = " + iSum + " jSum = " + jSum);
        }

        return iSum == jSum;
    }

    static int[] shiftArray(int[] arr, int n) {

        if (n > 0) {

            for (int i = 0; i < n; i++) {

                int temp = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
            return arr;
        } else {

            for (int i = 0; i > n; i--) {

                int temp = arr[0];

                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
            return arr;
        }
    }
}




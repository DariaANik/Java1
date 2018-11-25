import java.util.Arrays;

/**
 * Java 1 Lesson 2 homework
 *
 * @author Daria Nikolaeva
 * @version dated Nov 25, 2018
 *
 */

public class HomeworkL2 {
    public static void main (String[] args) {

        // Task 1
        int[] arr1 = {1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.print("Новый массив из задания 1: ");
        printArray(changeArrayOneZero(arr1));

        //Task 2
        int[] arr2 = new int[8];
        System.out.print("Массив из задания 2: ");
        printArray(fillArrayEight(arr2));

        //Task 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Новый массив из задания 3: ");printArray(modifyArray(arr3));

        //Task 4
        int n = 10;
        int[][] arr4 = new int[n][n];
        System.out.println("Двумерный массив задание 4");
        print2DArray(fillArrayOne(arr4));

        //Task 5
        int[] arr5 = {50,77,89,105,2,-5,900,0};
        findMinMax(arr5);

        // Task 6
        int[] arr6 = {1,1,1,1,4};
        System.out.println("Суммы левой и правой части равны: " + checkBalance(arr6));
        int[] arr61 = {1,1,1,1,6};
        System.out.println("Суммы левой и правой части равны: " + checkBalance(arr61));
    }

    public static int[] changeArrayOneZero(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        return arr1;
    }

    public static int[] fillArrayEight(int[] arr2) {
        for (int i = 0, j = 0; i < arr2.length; i++, j += 3) {
            arr2[i] = 0 + j;
        }
        return arr2;
    }

    public static int[] modifyArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        return arr3;
    }

    public static int[][] fillArrayOne(int[][] arr4) {
        for (int i = 0, j = 0; i < arr4[0].length; i++, j++) {
            arr4[i][j] = 1;
        }
        for (int i = 0, j = arr4[1].length-1; i <arr4[0].length; i++, j--) {
            arr4[i][j] = 1;
        }
        return arr4;
    }

    public static void findMinMax(int[] arr5) {
        int min = arr5[0];
        int max = arr5[0];
        for (int j = 0; j < arr5.length; j++) {
            if (arr5[j] <= min) {
                min = arr5[j];
            }
            if (arr5[j] >= max) {
                max = arr5[j];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

    public static boolean checkBalance(int[] arr6) {
        int sum = 0;
        for (int i : arr6) {
            sum += i;
        }
        int result = 0;
        if (sum % 2 !=0) {
            result = -1;
        } else {
            int check = sum / 2;
            int sum2 = 0;
            for (int i = 0; i < arr6.length; i++) {
                sum2 = sum2 + arr6[i];
                if (sum2 == check) {
                    result = 1;
                    break;
                } else {
                result = -1;
                }
            }
        }
        return result > 0;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i<arr[0].length; i++) {
            for (int j = 0; j <arr[1].length; j++)
                System.out.print(arr[i][j] + " ");
                System.out.println();
        }
    }
}

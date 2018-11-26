import java.util.Arrays;

/**
 * Java 1 Lesson 2 homework
 *
 * @author Daria Nikolaeva
 * @version dated Nov 26, 2018
 *
 */

public class HomeworkL2 {
    public static void main (String[] args) {

        // Task 1
        int[] arr1 = {1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.print("Новый массив из задания 1: ");
        changeArrayOneZero(arr1);
        printArray(arr1);

        //Task 2
        int[] arr2 = new int[8];
        System.out.print("Массив из задания 2: ");
        fillArrayEight(arr2);
        printArray(arr2);

        //Task 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArray(arr3);
        System.out.print("Новый массив из задания 3: ");
        printArray(arr3);

        //Task 4
        int n = 10;
        int[][] arr4 = new int[n][n];
        fillArrayOne(arr4);
        System.out.println("Двумерный массив задание 4");
        print2DArray(arr4);

        //Task 5
        int[] arr5 = {50,77,89,105,2,-5,900,0};
        System.out.println("min = " + findMin(arr5));
        System.out.println("max = " + findMax(arr5));

        // Task 6
        int[] arr6 = {5, 5, 1, 2, 3, 4};
        System.out.println("Суммы левой и правой части равны: " + checkBalance(arr6));
        int[] arr61 = {10, 1, 2, 5, 6};
        System.out.println("Суммы левой и правой части равны: " + checkBalance(arr61));
    }

    public static void changeArrayOneZero(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
    }

    public static void fillArrayEight(int[] arr2) {
        arr2[0] = 0;
        for (int i = 1, j = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i-1] + 3;
        }
    }

    public static void modifyArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
    }

    public static void fillArrayOne(int[][] arr4) {
        for (int i = 0, j = 0; i < arr4[0].length; i++, j++) {
            arr4[i][j] = 1;
        }
        for (int i = 0, j = arr4[1].length-1; i <arr4[0].length; i++, j--) {
            arr4[i][j] = 1;
        }
    }

    public static int findMin(int[] arr5) {
        int min = arr5[0];
               for (int j = 0; j < arr5.length; j++) {
                   if (arr5[j] <= min) {
                       min = arr5[j];
                   }
               }
        return min;
    }

    public static int findMax(int[] arr5) {
        int max = arr5[0];
        for (int j = 0; j < arr5.length; j++) {
            if (arr5[j] >= max) {
                max = arr5[j];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] arr6) {
        int sum = 0;
        for (int i : arr6) {
            sum += i;               //сумма всех элементов массива
        }
        if (sum % 2 !=0) {          // если сумма элементов массива нечетная, то точно false
            return false;
        } else {
            int check = sum / 2;    // половина суммы массива, этому числу равна сумма элементов слева и справа
            int sumarray = 0;
            int i = 0;
            do {
                sumarray = sumarray + arr6[i];
                i++;
            } while (sumarray < check);
            return sumarray == check;
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void print2DArray(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}

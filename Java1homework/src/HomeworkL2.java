import java.util.Arrays;
import java.util.Random;

/**
 * Java 1 Lesson 2 homework
 *
 * @author Daria Nikolaeva
 * @version dated Nov 24, 2018
 *
 */


public class HomeworkL2 {
    public static void main (String[] args) {
         changeArrayOneZero();
         setArrayEight();
         modifyArray();
         findMinMax();

         // Task 6
         int[] arr6 = {1,1,1,1,4};
         System.out.println(checkBalance(arr6));
         int[] arr61 = {1,1,1,1,5};
         System.out.println(checkBalance(arr61));

         // Task 7
         int[] arr7 = {1, 2, 33, -5, 28, 12, 78, 99, 105, -60, 15, -2, 200};
         int n = 100;
         //System.out.println(Arrays.toString(moveArray(arr7, n)));

    }

    public static int[] changeArrayOneZero(int[] arr1) {
        int[] arr1 = {1, 1, 0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        //
    }

    public static void setArrayEight() {
        int[] arr2 = new int[8];System.out.println(Arrays.toString(arr1));
        for (int i = 0, j = 0; i < arr2.length; i++, j += 3) {
            arr2[i] = 0 + j;
        }
        //System.out.println(Arrays.toString(arr2));
    }

    public static void modifyArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        //System.out.println(Arrays.toString(arr3));
    }

    public static void findMinMax() {
        int[] arr5 = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = ran.nextInt(101);
        }
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
        //System.out.println(Arrays.toString(arr5));
        //System.out.println("min " + min);
        //System.out.println("max " + max);
    }

    public static boolean checkBalance(int[] arr6) {
        int sum = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum = sum + arr6[i];
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

    public static int[] moveArray(int[] arr7, int n) {
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = arr7[i] + n;
        }
        return arr7;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

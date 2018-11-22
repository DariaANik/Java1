/**
 * Java 1 Lesson 1 homework (tasks 3-8)
 *
 * @author Daria Nikolaeva
 * @version dated Nov 21, 2018
 */

public class Java1homeworkpart2 {
    public static void main(String[] args) {
        System.out.println(count(5, 6, 14, 7));
        System.out.println(belongs1020(20, 10));
        printplusorminus(0);
        System.out.println(negative(-6));
        sayhello("Daria");
        System.out.println(leapyear(2018));
    }

    public static int count(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean belongs1020(int n, int n1) {
        return (n<=20 && n>=10 && n1>=10 && n1<=20);
    }

    public static void printplusorminus(int n2) {
        if (n2>=0) {
            System.out.println(n2 + " положительное число");
        } else {
            System.out.println(n2 + " отрицательное число");
        }
    }

    public static boolean negative(int n3) {
        return n3<0;
    }

    public static void sayhello(String name) {
        System.out.println("Привет, " + name);
    }

    public static String leapyear(int year1) {
        if ((year1 % 4 == 0 && year1 % 100 !=0) || year1 % 400 == 0 ) {
                return "Високосный";
            } else {
                return "Невисокосный";
            }
    }
}

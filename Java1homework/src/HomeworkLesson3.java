import java.util.Random;
import java.util.Scanner;

/**
 * Java 1 Lesson 3 homework
 *
 * @author Daria Nikolaeva
 * @version dated Nov 29, 2018
 *
 */

public class HomeworkLesson3 {

    public static void main(String[] args) {
        do {
            playGame();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (playAgain());
        System.out.println("До свидания!");
        }

    public static void playGame() {
        System.out.println("Я загадал число от 0 до 9. Угадайте это число. У Вас три попытки.");
        int r = generateRandom();
        int i = 1;
        while (i < 4) {
            System.out.println("Попытка " + i + ". Ваш вариант: ");
            Scanner read = new Scanner(System.in);
            int a = read.nextInt();
            switch(checkNumber(a, r)) {
                case 0:
                   System.out.println("Победа!");
                   return;
                case 1:
                    System.out.println("Загаданное число меньше, чем Ваш вариант. Осталось попыток " + (3-i));
                    i++;
                    break;
                case -1:
                    System.out.println("Загаданное число больше, чем Ваш вариант. Осталось попыток " + (3-i));
                    i++;
                    break;
            }
        }
        System.out.println("Game over. Кстати, я загадал " + r);
    }

    public static int generateRandom() {
        Random random = new Random();
        int nr = random.nextInt(10);
        return nr;

    }

    public static int checkNumber(int a, int r) {
        if (a == r) {
            return 0;
        }
        if (a<r) {
            return -1;
        } else {
            return 1;
        }
    }

    public static boolean playAgain() {
        Scanner read = new Scanner(System.in);
        int answ = read.nextInt();
        switch (answ) {
            case 1:
                return true;
            case 0:
                return false;
            default:
                System.out.println("Некорректный ответ");
        }
        return false;

    }

}

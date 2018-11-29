import java.util.Random;
import java.util.Scanner;

/**
 * Java 1 Lesson 3 homework (task 2)
 *
 * @author Daria Nikolaeva
 * @version dated Nov 29, 2018
 *
 */

public class HomeworkLesson3part2 {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Я загадал слово. Отгадайте!");
        String word = generateWord(words);
        playGame(word);
    }

    public static String generateWord(String[] words) {
        Random random = new Random();
        int nr = random.nextInt(words.length);
        return words[nr];
    }

    public static void playGame(String word) {
        boolean a;
        do {
            Scanner read = new Scanner(System.in);
            String guess = read.next();
            char k;
            int min;
            min = (guess.length()>= word.length()) ? word.length() : guess.length();
            if (guess.equals(word)) {
                System.out.println("Победа!");
                return;
            } else {
                a = true;
                for (int i = 0; i < min; i++) {
                    k = (guess.charAt(i) == word.charAt(i)) ? word.charAt(i) : '#';
                    System.out.print(k);
                }
                for (int j = 0; j < (15 - min); j++) {
                    System.out.print("#");
                }
                System.out.println();
                System.out.println("Попробуйте еще раз.");
            }
        } while (a);
    }
}

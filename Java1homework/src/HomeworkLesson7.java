import java.util.Scanner;
import java.util.Random;

/**
 * Java 1 Lesson 7 homework
 *
 * @author Daria Nikolaeva
 * @version dated Dec 13, 2018
 */

public class HomeworkLesson7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add, appetite, answer, fullcount;
        Cat1[] cats = new Cat1[4];
        Random random = new Random();
        for (int i = 0; i < cats.length; i++) {
            String name = "Kittie";
            appetite = random.nextInt(15) + 10;
            cats[i] = new Cat1(name + (i+1), appetite, false); // сделать имя из имени класса
        }
        System.out.println("I have " + cats.length + " cats and they are HUNGRY!!!");
        System.out.println("Feed the kitties!");
        Plate plate = new Plate(0);
        do {
            System.out.println("Add some food to their plate (enter food amount)");
            add = sc.nextInt();
            plate.fillThePlate(add);
            System.out.println(plate);
            plate.feedTheCat(cats);
            fullcount = 0;
            for (Cat1 cat : cats) {
                if (cat.full) {
                    System.out.println(cat.name + " (eats " + cat.appetite + " food) is full and happy.");
                    fullcount++;
                } else {
                    System.out.println(cat.name + " (eats " + cat.appetite + " food) is hungry.");
                }

            }
            System.out.println(plate);
            if (fullcount == cats.length) {
                System.out.println("Thanks. All the cats are full.");
                break;
            }
            System.out.println("Do you want to feed them again? (yes - 1, no - 0)");
            answer =sc.nextInt();
        } while (answer == 1);
    }
}

class Cat1 {
    protected String name;
    int appetite;
    boolean full;

    public Cat1(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    void fillThePlate(int add) {
        food = food + add;
    }

    void feedTheCat(Cat1[] cats) {
        for (Cat1 cat: cats) {
            if (!cat.full && food >= cat.appetite) {
                food = food - cat.appetite;
                cat.full = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Food in the plate: " + food;
     }
}


/**
 * Java 1 Lesson 6 homework
 *
 * @author Daria Nikolaeva
 * @version dated Dec 10, 2018
 */

public class HomeworkLesson6 {
    public static void main(String[] args) {
        int tryrun = 300;
        double tryjump = 1.5;
        int tryswim = 10;
        Animal[] animals = {new Cat("Kittie",200, 2, 0),
                new Dog("Doggie",500, 0.5, 10)};
        for (Animal animal : animals) {
            System.out.println(animal.name + " can run " + tryrun + ": " + animal.run(tryrun));
            System.out.println(animal.name + " can jump " + tryjump + ": " + animal.jump(tryjump));
            System.out.println(animal.name + " can swim " + tryswim + ": " + animal.swim(tryswim));
        }
    }
}

interface IAnimal {
    boolean run(int r);
    boolean jump(double j);
    boolean swim(int s);
}

class Cat extends Animal {
    Cat(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
    }
    public boolean run(int r) {
        return r<=run;
    }

    public boolean jump(double j) {
        return j <= jump;
    }

    public boolean swim(int s) {
        return false;
    }
}

class Dog extends Animal {
    Dog(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
    }
    public boolean run(int r) {
        return r<=run;
    }

    public boolean jump(double j) {
        return j <= jump;
    }

    public boolean swim(int s) {
        return s <= swim;
    }
}

abstract class Animal implements IAnimal {
    String name;
    int run;
    double jump;
    int swim;

    public Animal(String name, int run, double jump, int swim) {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
}
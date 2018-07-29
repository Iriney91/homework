/**
 * Java1. Homework6
 *
 * @authors Irina Poberey
 * @version dated Jul 29, 2018
 * @link https://github.com/Iriney91
 */

public class Java1HW6 {
    public static void main(String[] args) {
        Cat c1 = new Cat();

        c1.run(10000);
        c1.run(10);

        c1.swim(3);

        Dog d1 = new Dog(500, 10, 0.5);
        d1.jump(1);
        d1.run(600);

        Dog d2 = new Dog(2000, 10, 0.8);
        d2.run(600);
    }
}

abstract class Animal {
    abstract public void run(double l);

    abstract public void swim(double l);

    abstract public void jump(double h);
}

class Cat extends Animal {
    private static final double maxRunDistance = 200;
    private static final double maxJumpHeight = 2;

    @Override
    public void run(double l) {
        if (l > 0 && l <= Cat.maxRunDistance) {
            System.out.println("run: true");
            return;
        }

        System.out.println("run: false");
    }

    @Override
    public void swim(double l) {
        System.out.println("can't swim");
    }

    @Override
    public void jump(double h) {
        if (h > 0 && h <= Cat.maxJumpHeight) {
            System.out.println("jump: true");
            return;
        }

        System.out.println("jump: false");
    }
}

class Dog extends Animal {
    private double maxRunDistance;
    private double maxSwimDistance;
    private double maxJumpHeight;

    Dog(double rd, double sd, double h) {
        this.maxRunDistance = rd;
        this.maxSwimDistance = sd;
        this.maxJumpHeight = h;
    }

    @Override
    public void swim(double l) {
        if (l > 0 && l <= this.maxSwimDistance) {
            System.out.println("swim: true");
            return;
        }

        System.out.println("swim: false");
    }

    @Override
    public void run(double l) {
        if (l > 0 && l <= this.maxRunDistance) {
            System.out.println("run: true");
            return;
        }

        System.out.println("run: false");
    }

    @Override
    public void jump(double h) {
        if (h > 0 && h <= this.maxJumpHeight) {
            System.out.println("jump: true");
            return;
        }

        System.out.println("jump: false");
    }
}
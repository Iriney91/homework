/**
 * Java1. Homework1
 *
 * @version dated Jul 10, 2018
 * @authors Irina Poberey
 */
public class Java1HW1 {

    byte a1 = 3;
    short a2 = 5;
    int a3 = 59;
    long a4 = 10578L;
    float a5 = 37.2f;
    double a6 = 235.8;
    boolean a7 = true;
    char a8 = 'С';
    String a9 = "Hello";

    public static void main(String[] args) {

        System.out.println(exe1(1, 2, 8, 4));
        System.out.println(exe2(5, 7));
        exe3(5);
        System.out.println(exe4(-3));
        exe5("Ира");
        exe6(100);

    }

    static int exe1(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }


    static boolean exe2(int f, int k) {


        if (10 <= f + k && f + k <= 20) {

            return true;
        } else {
            return false;
        }

    }

    static void exe3(int x) {

        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    static boolean exe4(int s) {

        if (s < 0) {
            return true;
        } else {
            return false;
        }

    }

    static void exe5(String v) {

        System.out.println("Привет, " + v);
    }

    static void exe6(int z) {
        int l = z % 4;
        int k = z % 100;
        int m = z % 400;

        boolean year = ((l == 0 && k != 0) || m == 0);
        String j = year ? "Високосный" : "Не високосный";

        System.out.println(j);

    }
}






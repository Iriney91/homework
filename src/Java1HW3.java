import java . util . Scanner ;
import java . util . Random ;
/**
 * Java1. Homework2
 * @authors Irina Poberey
 * @version dated Jul 19, 2018
 */
public class Java1HW3 {


    public static void main(String[] args) {

        game1();
        game2();
    }

    static void game1() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int attempts = 3;
            int a = rand.nextInt(9);


            while (attempts > 0) {

                System.out.println("Загадайте число от 0 до 9");
                int b = sc.nextInt();

                if (a == b) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (a < b) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                attempts--;
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int c = sc.nextInt();
            if (c == 0) {
                break;
            }
        }
    }


    static void game2() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int x = rand.nextInt(words.length);
        System.out.println("Угадайте загаданный фрукт или овощ");

        while (true) {
            String y = sc.nextLine();
            char [] wordsArray = words[x].toCharArray();
            char [] yArray = y.toCharArray();


            if (words[x].equals(y)) {
                System.out.println("Вы угадали!");
                break;
            } else {
                for(int i = 0, j = 0; i < wordsArray.length && j < yArray.length; i++, j++) {
                    char z = words[x].charAt(i);
                    char v = y.charAt(j);
                    if (z == v) {
                        System.out.print(z);
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("###########");
            }
        }
    }
}


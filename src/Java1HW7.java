/**
 * Java1. Homework7
 *
 * @authors Irina Poberey
 * @version dated Aug 3, 2018
 * @link https://github.com/Iriney91
 */
public class Java1HW7 {
    public static void main(String[] args) {


        Cat1 [] cat1 = new Cat1 [3];
        cat1 [0] = new Cat1("Murzic", 30,false);
        cat1 [1] = new Cat1("Bursic", 40,false);
        cat1 [2] = new Cat1("Timka", 50,false);
        Plate plate = new Plate ( 100 );
        plate . info ();
        cat1 [0] . eat ( plate );
        cat1 [1] . eat ( plate );
        cat1 [2] . eat ( plate );
        plate . info ();
        plate.addFood(100);
        plate . info ();

    }
}

class Cat1 {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat1(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {

        if(plate.dicreaseFood(appetite)) {
            this.fullness = true;
        }
        System.out.println(fullness);
    }

}

class Plate {
    private int food;

    Plate(int food) {

        this.food = food;
    }

    public boolean dicreaseFood(int food) {

        if(food <= this.food) {
            this.food -= food;
            return true;
        }else{
            System.out.println("В миске недостаточно корма, чтобы насытить кота");
            return false;
        }
    }

    public void info () {
        System . out . println ( "plate: " + food );
    }

    public void addFood(int food){

        this.food += food;
    }

}
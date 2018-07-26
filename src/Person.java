/**
 * Java1. Homework4
 *
 * @authors Irina Poberey
 * @version dated Jul 26, 2018
 */

public class Person {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public static void main(String[] args){

        Person[] persArray = new Person [5];
        persArray[0] = new Person("Kochetkov Sergey", "engineer", "koch@mail.ru", "89609574836", 100000, 35);
        persArray[1] = new Person("Markov Dmitriy", "engineer", "md834@mail.ru", "89618456839", 100000, 32);
        persArray[2] = new Person("Ykovchuk Andrey", "analyst", "ykovchuk@gmail.ru", "89608760493", 90000, 37);
        persArray[3] = new Person("Katikina Irina", "accountant", "kat_91@mail.ru", "89164768590", 80000, 29);
        persArray[4] = new Person("Ivanov Dmitriy", "Head of sector", "ivanov555@mail.ru", "89608954736", 190000, 42);

        for (int i = 0; i < persArray.length ; i++) {
            if(persArray[i].age > 40){
                persArray[i].print();
            }
        }

    }
    public void print(){
        System.out.println("name: " + this.name + " position: " + this.position + " email: " + this.email + " phoneNumber: " + this.phoneNumber + " salary: " + this.salary + " age: " + this.age);
    }

    public Person(String _name, String _position, String _email, String _phoneNumber, int _salary, int _age ){

        name = _name;
        position = _position;
        email = _email;
        phoneNumber = _phoneNumber;
        salary = _salary;
        age = _age;
    }
}

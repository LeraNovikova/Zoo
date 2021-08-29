import Animal.*;
import Food.*;
//import Worker;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Lion lion1 = new Lion("Alex - lion", 30, "AGrrrrr", 3);
        Elephant el1 = new Elephant("Susan - elephant", 1000, "UUUU", 5);

        Worker worker1 = new Worker("Jim - worker");


        Apple apple1 = new Apple();
        Beef beef1 = new Beef();
        //Chicken chicken1 = new Chicken();

        worker1.feed(el1, apple1);
        worker1.feed(el1, beef1);

       // Animal.getName(lion1);
    }
}

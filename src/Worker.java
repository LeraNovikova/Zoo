import Animal.Animal;
import Animal.Voice;
import Food.Food;

public class Worker {
    private static String workname;

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getWorkname() {
        return workname;
    }
    public Worker(String workname){
        this.workname = workname;
    }

    public static void feed(Animal animal, Food food){
        System.out.println(workname);
        animal.eat(food);

    }

}

package Animal;
import Food.Food;

public class Wolf extends MeatEating implements Run,Sleep,Voice{

    public Wolf(String name, int weight, String voice, int years){
        super(name, weight, voice, years);
    }
    @Override
    public void eat(Food food){
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("The" + getName() + "start running");

    }

    @Override
    public void sleep() {
        System.out.println("The" + getName() + "fell asleep");

    }

    @Override
    public void voice() {
        System.out.println("The" + getName() + "said" + getVoice());

    }

}

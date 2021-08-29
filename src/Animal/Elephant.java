package Animal;

import Food.Food;

public class Elephant extends PlantEating implements Run,Sleep,Voice{
    public Elephant(String name, int weight, String voice, int years){
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

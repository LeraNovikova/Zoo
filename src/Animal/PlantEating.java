package Animal;

import Food.Food;
import Food.Plant;

public abstract class PlantEating extends Animal{
    PlantEating(String name, int weight, String voice, int years){

        super(name, weight, voice, years);
    }

    @Override
    public void eat(Food food){
        if(food instanceof Plant){
            setSatiety(getSatiety()+ food.getSaturation());
            System.out.println("The " + getName() + " ate " + food.getSaturation() + " " + food.getFood());
        }
        else{
            System.out.println("The " + getName() + " do not eat " + food.getFood());
        }
    }
}

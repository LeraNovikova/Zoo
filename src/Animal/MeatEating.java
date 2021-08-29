package Animal;

import Food.Food;
import Food.Meat;

public abstract class MeatEating extends Animal{
    MeatEating(String name, int weight, String voice, int years){
        super(name, weight, voice, years);
    }

    @Override
    public void eat(Food food){
        if(food instanceof Meat){
            setSatiety(getSatiety()+ food.getSaturation());
            System.out.println("The " + getName() + " ate " + food.getSaturation() + food.getFood());
        }
        else{
            System.out.println("The " + getName() + " do not eat " + food.getFood());
        }
    }

}

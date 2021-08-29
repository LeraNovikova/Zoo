package Animal;

import Food.Food;

public abstract class Animal{

    private String name, voice;
    private int weight, years, satiety = 0;

    public abstract void eat(Food food);

    public void setSatiety(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    Animal(String name, int weight, String voice, int years){
        this.name = name;
        this.weight = weight;
        this.voice = voice;
        this.years = years;

    }

    Animal(String name, int weight){
        this.name = name;
        this.weight = weight;

    }

}

package Food;

public abstract class Food {
    private String food;
    private int saturation;

    public void setFoodName(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getSaturation() {
        return saturation;
    }


}



package Java.zoo.food.grass;

import Java.zoo.food.Food;

public class Grass extends Food {
    private int degreeOfDryness;
    public Grass(String name, int satiety) {
        super(name, satiety);
    }
    public Grass(String name, int satiety, int degreeOfDryness){
        super(name, satiety);
        this.degreeOfDryness = degreeOfDryness;
    }
    public void setDegreeOfDryness(int degreeOfDryness){
        this.degreeOfDryness = degreeOfDryness;
    }
    public int getDegreeOfDryness(){
        return  degreeOfDryness;
    }

}

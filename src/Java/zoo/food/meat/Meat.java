package Java.zoo.food.meat;
import Java.zoo.food.Food;

public class Meat extends Food {
    private int degreeOfFreshness;
    public Meat(String name, int satiety) {
        super(name, satiety);
    }
    public Meat(String name, int satiety, int degreeOfFreshness) {
        super(name, satiety);
        this.degreeOfFreshness = degreeOfFreshness;
    }

    public int getDegreeOfFreshness() {
        return degreeOfFreshness;
    }

    public void setDegreeOfFreshness(int degreeOfFreshness) {
        this.degreeOfFreshness = degreeOfFreshness;
    }

}

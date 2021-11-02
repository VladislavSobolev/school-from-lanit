package Java.zoo.animals.carnivorousAnimals;

import Java.zoo.animals.Animal;
import Java.zoo.food.grass.Grass;
import Java.zoo.food.Food;

import java.io.PrintStream;


public abstract class Carnivorous extends Animal {
    private String health;
    private String aggressiveness;
    private int age;


    public Carnivorous(String health, String aggressiveness, int age){
        this.health = health;
        this.aggressiveness = aggressiveness;
        this.age = age;
    }


    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(String aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public PrintStream eat(Food foodName) {
        if (foodName instanceof Grass) {
            return System.out.printf("I don't eat %s. I need meat! \n", foodName.getName());
        } else {
            return System.out.printf("Now i eat %s \n", foodName.getName());
        }
    }

}



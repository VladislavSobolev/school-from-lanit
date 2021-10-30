package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.animals.Animal;
import Java.zoo.food.Food;
import Java.zoo.food.meat.Meat;

import java.io.PrintStream;


public abstract class Herbivores extends Animal {

    private String health;
    private int age;

    public Herbivores(String health, int age) {
        this.health = health;
        this.age = age;
    }




    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public PrintStream eat(Food foodName) {
        if (foodName instanceof Meat) {
            return System.out.printf("I don't eat %s. I need grass! \n", foodName.getName());
        } else  {
            return System.out.printf("Now i eat %s \n", foodName.getName());
        }
    }
}

package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.SizeOfAviary;
import Java.zoo.animals.Animal;
import Java.zoo.food.Food;
import Java.zoo.food.WrongFoodException;
import Java.zoo.food.grass.Grass;
import Java.zoo.food.meat.Meat;

import java.io.PrintStream;


public abstract class Herbivores extends Animal  {


    private String health;
    private int age;
    private SizeOfAviary size;

    public Herbivores(String health, int age, SizeOfAviary size) {
        this.health = health;
        this.age = age;
        this.size = size;
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
    public PrintStream eat(Food foodName) throws WrongFoodException {
        if (foodName instanceof Meat) {
            throw new WrongFoodException("Wrong food");
        } else  {
            return System.out.printf("Now i eat %s \n", foodName.getName());
        }

    }

    public SizeOfAviary getSize() {
        return size;
    }

    public void setSize(SizeOfAviary size) {
        this.size = size;
    }
}

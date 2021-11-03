package Java.zoo.animals;

import Java.zoo.SizeOfAviary;
import Java.zoo.food.Food;
import Java.zoo.food.WrongFoodException;

import java.io.PrintStream;

public abstract class Animal  {
    private String name;


    public abstract PrintStream eat(Food foodName) throws WrongFoodException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

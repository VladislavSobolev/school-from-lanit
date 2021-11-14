package Java.zoo.animals;

import Java.zoo.Size;
import Java.zoo.animals.carnivorousAnimals.BlackPanther;
import Java.zoo.food.Food;
import Java.zoo.food.WrongFoodException;

import java.io.PrintStream;

public abstract class Animal  {
    private String name;
    private Size size;


    public abstract PrintStream eat(Food foodName) throws WrongFoodException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this)  {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Animal animal = (Animal) obj;
        return ((name != null) && ((animal.getName() != null) && (name.equalsIgnoreCase(animal.name))));
    }
    @Override
    public int hashCode(){
        return name == null ? 0 : name.hashCode();
    }
}

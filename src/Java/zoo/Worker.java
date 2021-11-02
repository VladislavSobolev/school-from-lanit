package Java.zoo;

import Java.zoo.animals.Animal;
import Java.zoo.animals.Voice;;
import Java.zoo.food.Food;;

public class Worker implements Voice {
    private String health;
    private int salary;
    private String voice;
    public  Worker(String health, int salary){
        this.health = health;
        this.salary = salary;
    }


    public void feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice animal) {
        animal.voice();
    }


    @Override
    public String voice() {
        return voice;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}

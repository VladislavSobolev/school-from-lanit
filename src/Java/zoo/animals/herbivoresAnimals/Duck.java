package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.Size;
import Java.zoo.animals.Fly;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;
import Java.zoo.animals.Voice;



public class Duck extends Herbivores implements Fly, Sleep, Swim, Voice {
    private String color;
    private String voice;
    private String name;
    public Duck( String health, int age) {
        super( health, age);
    }
    public Duck( String health, String color, int age,  String voice, String name, Size size) {
        super( health, age);
        super.setSize(size);
        this.color = color;
        this.voice = voice;
        this.name = name;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setVoice(String voice){ this.voice = voice;}

    @Override
    public void fly() {
        System.out.println("flew!");

    }

    @Override
    public void sleep() {
        System.out.println("sleeeeeeeeeeeee.................p");

    }

    @Override
    public void swim() {
        System.out.println("yeeeeea water");

    }

    @Override
    public String voice() {
        return this.voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}


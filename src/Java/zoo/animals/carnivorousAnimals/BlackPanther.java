package Java.zoo.animals.carnivorousAnimals;

import Java.zoo.Size;
import Java.zoo.animals.*;


public class BlackPanther extends Carnivorous implements Run, Sleep, Swim, Voice {
    private boolean molt;
    private  String voice;
    private String name;



    public BlackPanther(String health, String aggressiveness, int age) {
        super(health, aggressiveness,age);

    }
    public BlackPanther( String health, String aggressiveness,int age,  String voice, String name, Size size){
        super(health, aggressiveness, age);
        super.setSize(size);
        this.voice = voice;
        this.name = name;

    }



    public boolean getMolt() {
        return molt;
    }

    public void setMolt(boolean molt) {
        this.molt = molt;
    }



    @Override
    public void run() {
        System.out.println("Сatch up!");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep zzzzzz...");
    }

    @Override
    public void swim() {
        System.out.println("Mmmmmmmmm water");

    }

    @Override
    public  String voice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }





}
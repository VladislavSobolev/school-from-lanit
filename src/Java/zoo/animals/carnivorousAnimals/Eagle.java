package Java.zoo.animals.carnivorousAnimals;

import Java.zoo.Size;
import Java.zoo.animals.Fly;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Voice;




public class Eagle extends Carnivorous implements Fly, Sleep, Voice {
    private boolean offspring;
    private String voice;
    private String name;


    public Eagle(String health, String aggressiveness, int age) {
        super( health,aggressiveness, age);
    }
    public Eagle(String health, String aggressiveness, int age , String voice, String name, Size size){
        super(health,aggressiveness,age);
        super.setSize(size);
        this.voice = voice;
        this.name = name;
    }


    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean getOffspring() {
        return offspring;
    }

    public void setOffspring(boolean offspring) {
        this.offspring = offspring;
    }





    public String info(boolean offspring){
        if (offspring){
            return "eagles have offspring!";
        } else return "eagles have no offspring";
    }

    @Override
    public void sleep() {
        System.out.println("tsssss i sleep");

    }

    @Override
    public String voice() {
        return this.voice;
    }

    @Override
    public void fly() {
        System.out.println("I love to fly");
    }


    @Override
    public String getName() {
        return name;
    }
}



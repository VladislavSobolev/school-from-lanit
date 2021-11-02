package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.animals.Run;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;
import Java.zoo.animals.Voice;

public class Zebra extends Herbivores implements Run, Sleep, Swim, Voice {
    private String voice;

    public Zebra( String health, int age) {
        super( health, age);
    }
    public Zebra(String health, int age, String voice){
        super(health, age);
        this.voice = voice;
    }



    @Override
    public void run() {
        System.out.println("run run run run");


    }

    @Override
    public void sleep() {
        System.out.println("sleep sleeeeep sleeeeeeeeeee....");

    }

    @Override
    public void swim() {
        System.out.println("Yeeeeeeeaaaaah water");

    }


    @Override
    public String voice() {
        return voice;
    }
    public void setVoice(String voice){ this.voice = voice;}
}

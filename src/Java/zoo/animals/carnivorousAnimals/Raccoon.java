package Java.zoo.animals.carnivorousAnimals;


import Java.zoo.animals.Run;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;
import Java.zoo.animals.Voice;

public class Raccoon extends Carnivorous implements Run, Sleep, Swim, Voice {
    private boolean molt;
    private String voice;
    public Raccoon(String health, String aggressiveness, int age) {
        super( health,aggressiveness,age);
    }
    public Raccoon( String health, String aggressiveness,int age, boolean molt, String voice ){
        super(health, aggressiveness, age);
        this.molt = molt;
        this.voice = voice;
    }

    public void  setVoice(String voice){
        this.voice = voice;
    }


    public boolean isMolt() {
        return molt;
    }

    public void setMolt(boolean molt) {
        this.molt = molt;
    }

    @Override
    public void run() {
        System.out.println("RUUUUUUUUUUUN");
    }
    @Override
    public String voice() {
        return voice;
    }

        @Override
    public void sleep() {
        System.out.println("now i wanna sleep");

    }

    @Override
    public void swim() {
        System.out.println("pluh pluh pluh");

    }


}

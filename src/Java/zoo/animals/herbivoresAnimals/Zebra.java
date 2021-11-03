package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.SizeOfAviary;
import Java.zoo.animals.Run;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;
import Java.zoo.animals.Voice;

public class Zebra extends Herbivores implements Run, Sleep, Swim, Voice {
    private String voice;
    private String name;


    public Zebra( String health, int age, SizeOfAviary size) {
        super( health, age, size);
    }
    public Zebra(String health, int age, SizeOfAviary size ,String voice, String name){
        super(health, age, size);
        this.voice = voice;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode(){
        return name == null ? 0 : name.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this)  {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Zebra animal = (Zebra) obj;
        return ((name != null) && (animal.name != null) && (name.equalsIgnoreCase(animal.name)));
    }

}

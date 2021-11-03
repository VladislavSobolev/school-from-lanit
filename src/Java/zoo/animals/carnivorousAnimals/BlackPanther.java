package Java.zoo.animals.carnivorousAnimals;

import Java.zoo.SizeOfAviary;
import Java.zoo.animals.*;


public class BlackPanther extends Carnivorous implements Run, Sleep, Swim, Voice {
    private boolean molt;
    private  String voice;
    private String name;

    public BlackPanther(String health, String aggressiveness, int age, SizeOfAviary size) {
        super(health, aggressiveness,age,size);
    }
    public BlackPanther( String health, String aggressiveness,int age, SizeOfAviary size, String voice, String name){
        super(health, aggressiveness, age,size);
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
    @Override
    public boolean equals(Object obj){
        if(obj == this)  {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        BlackPanther blackPan = (BlackPanther) obj;
        return ((name != null) && (blackPan.name != null) && (name.equalsIgnoreCase(blackPan.name)));
    }
    @Override
    public int hashCode(){
        return name == null ? 0 : name.hashCode();
    }


}
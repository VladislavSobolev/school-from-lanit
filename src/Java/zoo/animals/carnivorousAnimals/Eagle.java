package Java.zoo.animals.carnivorousAnimals;

import Java.zoo.SizeOfAviary;
import Java.zoo.animals.Fly;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Voice;




public class Eagle extends Carnivorous implements Fly, Sleep, Voice {
    private boolean offspring;
    private String voice;
    private String name;


    public Eagle(String health, String aggressiveness, int age, SizeOfAviary size) {
        super( health,aggressiveness, age, size);
    }
    public Eagle(String health, String aggressiveness, int age , SizeOfAviary size, String voice, String name){
        super(health,aggressiveness,age, size);
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
        Eagle animal = (Eagle) obj;
        return ((name != null) && (animal.name != null) && (name.equalsIgnoreCase(animal.name)));
    }

}



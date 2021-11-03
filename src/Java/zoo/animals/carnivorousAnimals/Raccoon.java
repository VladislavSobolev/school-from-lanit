package Java.zoo.animals.carnivorousAnimals;


import Java.zoo.SizeOfAviary;
import Java.zoo.animals.Run;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;
import Java.zoo.animals.Voice;

public class Raccoon extends Carnivorous implements Run, Sleep, Swim, Voice {
    private boolean molt;
    private String voice;
    private String name;


    public Raccoon(String health, String aggressiveness, int age, SizeOfAviary size) {
        super( health,aggressiveness,age, size);
    }
    public Raccoon( String health, String aggressiveness,int age, SizeOfAviary size,  String voice, String name ){
        super(health, aggressiveness, age, size);
        this.voice = voice;
        this.name = name;
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
        Raccoon animal = (Raccoon) obj;
        return ((name != null) && (animal.name != null) && (name.equalsIgnoreCase(animal.name)));
    }

}

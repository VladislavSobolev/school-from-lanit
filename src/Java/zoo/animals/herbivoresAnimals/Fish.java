package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.SizeOfAviary;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;


public class Fish extends Herbivores implements Swim, Sleep {

    private String name;

    public Fish( String health, int age,SizeOfAviary size, String name ) {
        super( health, age, size);
        this.name = name;
    }


    public void splash(){
        int count = (int) Math.random() * 5 + 1;
        for (int i = 0; i <= count; i++){
            System.out.print("BOOLE ");
        }
    }

    @Override
    public void sleep() {
        System.out.println("I'm so slow");

    }

    @Override
    public void swim() {
        System.out.println("swaaaaaaam");

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
        Fish animal = (Fish) obj;
        return ((name != null) && (animal.name != null) && (name.equalsIgnoreCase(animal.name)));
    }

}


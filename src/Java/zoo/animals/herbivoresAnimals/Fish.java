package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.Size;
import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;


public class Fish extends Herbivores implements Swim, Sleep {

    private String name;

    public Fish( String health, int age, String name, Size size ) {
        super(health, age);
        super.setSize(size);
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


}


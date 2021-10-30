package Java.zoo.animals.herbivoresAnimals;

import Java.zoo.animals.Sleep;
import Java.zoo.animals.Swim;


public class Fish extends Herbivores implements Swim, Sleep {


    public Fish( String health, int age) {
        super( health, age);
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


}


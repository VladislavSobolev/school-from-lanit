package Java.zoo;

import Java.zoo.animals.Animal;
import Java.zoo.animals.Swim;
import Java.zoo.animals.carnivorousAnimals.BlackPanther;
import Java.zoo.animals.carnivorousAnimals.Eagle;
import Java.zoo.animals.carnivorousAnimals.Raccoon;
import Java.zoo.food.grass.Clover;
import Java.zoo.food.grass.Dandelion;
import Java.zoo.food.grass.Parsley;
import Java.zoo.food.meat.Beef;
import Java.zoo.food.meat.Chicken;
import Java.zoo.food.meat.Pork;
import Java.zoo.animals.herbivoresAnimals.Duck;
import Java.zoo.animals.herbivoresAnimals.Fish;
import Java.zoo.animals.herbivoresAnimals.Zebra;

public class Zoo {
    public static void main(String[] args) {
        BlackPanther blackPanther = new BlackPanther("normal", "aggressive", 4,false, "RRRRRRRR");
        Eagle eagle = new Eagle("Very good","aggressive", 7,"scream");
        Raccoon raccoon = new Raccoon("bad", "not agressive",3,true,"HAHAHAHAHAHA");
        Duck duck = new Duck("normal", "black", 3,"Quack quack quack");
        Fish fish = new Fish("very good", 5);
        Zebra zebra = new Zebra("good",10,"yogogo");
        Clover clover = new Clover("Clover", 5,100);
        Dandelion dandelion = new Dandelion("dandelion", 4,70);
        Parsley parsley = new Parsley("parsley", 6,0);
        Beef beef = new Beef("beef",70,100);
        Chicken chicken = new Chicken("chicken",40,75);
        Pork pork = new Pork("pork", 60,90);
        Worker worker = new Worker("Normal", 2500);
        worker.feed(blackPanther, beef);
        worker.feed(eagle, clover);
        worker.feed(zebra, pork);
        worker.feed(zebra, parsley);
        worker.getVoice(duck);
        worker.getVoice(blackPanther);
        Animal[] poolOfAnimals =  {blackPanther, raccoon, duck, fish,zebra };
        for(int i = 0; i < poolOfAnimals.length; i++){
            if (poolOfAnimals[i] instanceof Swim){
                ((Swim)poolOfAnimals[i]).swim();
            }
        }
    }
}

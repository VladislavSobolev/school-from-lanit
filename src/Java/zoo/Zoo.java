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
        BlackPanther blackPanther = new BlackPanther("normal", "aggressive", 4, SizeOfAviary.LARGE, "RRRRRRRR","Nick");
        Eagle eagle = new Eagle("Very good","aggressive", 7,SizeOfAviary.MEDIUM,"scream","John");
        Raccoon raccoon = new Raccoon("bad", "not agressive",3,SizeOfAviary.MEDIUM,"HAHAHAHAHAHA", "Nate" );
        Duck duck = new Duck("normal", "black", 3,SizeOfAviary.MEDIUM,"Quack quack quack","Conor");
        Fish fish = new Fish("very good", 5,SizeOfAviary.MEDIUM,"Petr");
        Zebra zebra = new Zebra("good",10,SizeOfAviary.MEDIUM,"yogogo","Tony");
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
        blackPanther.run();
        blackPanther.sleep();
        blackPanther.voice();
        eagle.fly();
        eagle.sleep();

        Animal[] poolOfAnimals =  {blackPanther, raccoon, duck, fish,zebra };

        for(Animal animal : poolOfAnimals){
            ((Swim)animal).swim();

        }

        Aviary aviary = new Aviary(SizeOfAviary.MEDIUM);
        aviary.addAnimal(eagle);
        aviary.addAnimal(raccoon);
        aviary.addAnimal(zebra);
        aviary.addAnimal(duck);
        aviary.addAnimal(blackPanther);
        System.out.println(aviary.getLink(raccoon.getName()));
        aviary.removeAnimal(raccoon.getName());


    }
}

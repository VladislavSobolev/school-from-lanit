package Java.zoo;

import Java.zoo.animals.Animal;
import Java.zoo.animals.Swim;
import Java.zoo.animals.carnivorousAnimals.BlackPanther;
import Java.zoo.animals.carnivorousAnimals.Carnivorous;
import Java.zoo.animals.carnivorousAnimals.Eagle;
import Java.zoo.animals.carnivorousAnimals.Raccoon;
import Java.zoo.animals.herbivoresAnimals.Herbivores;
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
        BlackPanther blackPanther =  new BlackPanther("normal", "aggressive", 4,  "RRRRRRRR","Nick", Size.MEDIUM);
        Eagle eagle = new Eagle("Very good","aggressive", 7,"scream","John",Size.MEDIUM);
        Raccoon raccoon = new Raccoon("bad", "not agressive",3,"HAHAHAHAHAHA", "Nate",Size.SMALL);
        Duck duck = new Duck("normal", "black", 3,"Quack quack quack","Conor",Size.SMALL);
        Fish fish = new Fish("very good", 5,"Petr", Size.SMALL);
        Zebra zebra = new Zebra("good",10,"yogogo","Tony",Size.MEDIUM);
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

        Swim[] poolOfAnimals =  {blackPanther, raccoon, duck, fish,zebra };

        for(Swim s : poolOfAnimals){
            s.swim();
        }
        System.out.println();

        Aviary<Carnivorous> aviary = new Aviary<>();
        Aviary<Herbivores> aviary1 = new Aviary<>();
        aviary.setSizeOfAviary(Size.MEDIUM);
        aviary1.setSizeOfAviary(Size.SMALL);
        aviary.addAnimal(blackPanther);
        aviary.addAnimal(eagle);
        aviary.addAnimal(raccoon);
        aviary1.addAnimal(duck);
        aviary1.addAnimal(zebra);



        System.out.println(aviary.getLink(blackPanther.getName()));
        aviary.allKeys();
        aviary.removeAnimal(blackPanther.getName());
        System.out.println();
        aviary.allKeys();
        System.out.println();
        aviary1.allKeys();
    }
}

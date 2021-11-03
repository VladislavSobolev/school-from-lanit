package Java.zoo;

import Java.zoo.animals.Animal;
import Java.zoo.animals.carnivorousAnimals.Carnivorous;
import Java.zoo.animals.herbivoresAnimals.Herbivores;

import java.util.HashMap;

public class Aviary <A extends Animal>{
    private SizeOfAviary sizeOfAviary;
    private  HashMap< String, Animal> aviaryOfAnimal = new HashMap<>();
    private Animal firstAnimal;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }
    public Aviary(SizeOfAviary size){
        sizeOfAviary = size;

    }

    public void setSizeOfAviary(SizeOfAviary sizeOfAviary) {
        this.sizeOfAviary = sizeOfAviary;
    }


    public void addAnimal(A animal){
        if(aviaryOfAnimal.size() == 0){
            aviaryOfAnimal.put(animal.getName(), animal);
            if(animal instanceof Carnivorous){
                 firstAnimal = (Carnivorous) animal;
            } else if(animal instanceof Herbivores){
                firstAnimal = (Herbivores) animal;
            }
        }
        if(aviaryOfAnimal.size() > 0 && (firstAnimal instanceof Carnivorous) && (animal instanceof Carnivorous) &&
                sizeOfAviary == ((Carnivorous) animal).getSize()){
            aviaryOfAnimal.put(animal.getName(), animal);
        }
        if(aviaryOfAnimal.size() > 0 && (firstAnimal instanceof Herbivores) && (animal instanceof Herbivores) &&
            sizeOfAviary == ((Herbivores) animal).getSize()){
            aviaryOfAnimal.put(animal.getName(), animal);
        }

    }

    public Animal getLink(String name){
        return aviaryOfAnimal.get(name);
    }
    public void removeAnimal(String name){
        aviaryOfAnimal.remove(name);
    }



}

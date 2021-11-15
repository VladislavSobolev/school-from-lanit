package Java.zoo;

import Java.zoo.animals.Animal;
import Java.zoo.animals.carnivorousAnimals.Carnivorous;
import Java.zoo.animals.herbivoresAnimals.Herbivores;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size sizeOfAviary;
    private HashMap<String, T> aviary = new HashMap<>();


    public Size getSizeOfAviary() {
        return sizeOfAviary;
    }


    public void setSizeOfAviary(Size sizeOfAviary) {
        this.sizeOfAviary = sizeOfAviary;
    }


    public void addAnimal(T animal){
        if(sizeOfAviary == animal.getSize() ){
            aviary.put(animal.getName(), animal);
        }
    }

    public T getLink(String name){
        return (T) aviary.get(name);
    }
    public void removeAnimal(String name){
        aviary.remove(name);
    }

    public void allKeys(){
        for(var name : aviary.keySet()){
            System.out.println(name);
        }
    }
}

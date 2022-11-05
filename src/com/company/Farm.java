package com.company;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animals> animals = new ArrayList<>();

    public Farm(){

        animals.add(new Cow());
        animals.add(new Dog());
        animals.add(new Duck());

    }
    public List<Animals> getAnimals(){
        return animals;
    }

    public List<AnimalType> getAnimalsThatMakeSound(){
        List<AnimalType> animalsThatMakeSound = new ArrayList<>();

        for (Animals animal:animals) {
            if (animal instanceof CanMakeSound){
                animalsThatMakeSound.add(animal.getType());

            }

        }
        return animalsThatMakeSound;

    }

    // get animals that fly
    public List<AnimalType> getAnimalsThatFly(){
        List<AnimalType> animalsThatFly = new ArrayList<>();

        for (Animals animal:animals) {
            if (animal instanceof CanFly){
                animalsThatFly.add(animal.getType());

            }

        }
        return animalsThatFly;

    }

    //both

    public List<AnimalType> getAnimalsThatFlyAndMakeSound(){
        List<AnimalType> animalsThatFlyAndMakeSound = new ArrayList<>();

        for (Animals animal:animals) {
            if (animal instanceof CanFly && animal instanceof CanMakeSound){
                animalsThatFlyAndMakeSound.add(animal.getType());

            }

        }
        return animalsThatFlyAndMakeSound;

    }
}

package com.company;

public class Cow extends Animals implements CanMakeSound{

    @Override
    public AnimalType getType(){
        return AnimalType.cow;
    }

    @Override
    public int getLegs(){
        return 4;
    }

    @Override
    public void makeSound(){
        System.out.println("Mooooooooo");

    }

}

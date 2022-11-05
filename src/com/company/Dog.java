package com.company;

public class Dog extends Animals implements CanMakeSound{

    @Override
    public AnimalType getType(){
        return AnimalType.dog;
    }

    @Override
    public void makeSound(){
        System.out.println("woof woof");

    }
}

package com.company;

public class Duck extends Animals implements CanMakeSound, CanFly{

    @Override
    public AnimalType getType(){
        return AnimalType.duck;
    }

    @Override
    public void makeSound(){
        System.out.println("quack, quack");

    }

    @Override
    public void canFly(){
        System.out.println("water landing");

    }
}

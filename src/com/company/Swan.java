package com.company;

public class Swan extends Animals implements CanFly{

    @Override
    public AnimalType getType(){
        return AnimalType.swan;
    }


    @Override
    public void canFly(){
        System.out.println("wings flapping");

    }
}

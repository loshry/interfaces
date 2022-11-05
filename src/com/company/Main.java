package com.company;

public class Main {

    public static void main(String[] args) {

	Duck duck = new Duck();
	duck.canFly();

	Dog dog = new Dog();

	// instanceOf
        if (duck instanceof Animals) {
            System.out.println("Is an Animal");
        }


    // because implementing an interface creates an IS A relationship
    // we can use instanceOf to see if duck uses canFly

        if (duck instanceof CanFly){
            System.out.println("Implements CanFly");
        }

        Cow myCow = new Cow();
        System.out.println(myCow.getLegs());

        Farm myFarm = new Farm();
        System.out.println(myFarm.getAnimalsThatMakeSound());
        System.out.println(myFarm.getAnimalsThatFly());
        System.out.println(myFarm.getAnimalsThatFlyAndMakeSound());

    }
}

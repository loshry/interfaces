package com.company;

public interface CanMakeSound {
    // here I'm saying that any class that implements my CanMakeSound
    // interface must have a method called makeSound... but what that
    // method does is up to the class that implements it

    void makeSound();
}

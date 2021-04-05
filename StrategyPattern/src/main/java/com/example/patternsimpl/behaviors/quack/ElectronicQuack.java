package com.example.patternsimpl.behaviors.quack;

public class ElectronicQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack with a lot of auto tune");
    }
}

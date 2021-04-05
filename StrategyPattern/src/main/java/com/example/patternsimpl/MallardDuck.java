package com.example.patternsimpl;

import com.example.patternsimpl.behaviors.fly.FlyWithWings;
import com.example.patternsimpl.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}

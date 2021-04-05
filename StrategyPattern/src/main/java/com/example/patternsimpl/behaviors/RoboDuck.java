package com.example.patternsimpl.behaviors;

import com.example.patternsimpl.Duck;
import com.example.patternsimpl.behaviors.fly.FlyNoWay;
import com.example.patternsimpl.behaviors.quack.ElectronicQuack;

public class RoboDuck extends Duck {

    public RoboDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new ElectronicQuack());
    }

    @Override
    public void display() {
        System.out.println("like cyborg, but with a duck shape");
    }
}

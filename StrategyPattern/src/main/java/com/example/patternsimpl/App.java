package com.example.patternsimpl;

import com.example.patternsimpl.behaviors.RoboDuck;
import com.example.patternsimpl.behaviors.fly.FlyRocketPowered;

public class App {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck robot = new RoboDuck();
        robot.performQuack();
        robot.performFly();
        robot.setFlyBehavior(new FlyRocketPowered());
        robot.performFly();
    }
}

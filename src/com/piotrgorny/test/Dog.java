package com.piotrgorny.test;

public class Dog extends AnimalBase {
    public Dog(String name, int leg_count) {
        super(name, leg_count);
    }

    @Override
    public void make_sound() {
        System.out.println("Whof Whof");
    }
}

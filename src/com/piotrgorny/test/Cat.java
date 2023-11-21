package com.piotrgorny.test;

import static java.lang.System.*;

public class Cat extends AnimalBase {
    public Cat(String name, int leg_count) {
        super(name, leg_count);
    }

    @Override
    public void make_sound() {
        out.println("Meow Meow");
    }


}

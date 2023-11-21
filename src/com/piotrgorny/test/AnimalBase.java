package com.piotrgorny.test;

public class AnimalBase implements Animal{
    AnimalBase(String name, int leg_count){
        this.name = name;
        this.leg_count = leg_count;
    }
    @Override
    public void make_sound() {
        System.out.println("Generic sound");
    }

    @Override
    public int how_many_legs() {
        return leg_count;
    }
    protected int leg_count;
    @Override
    public String get_name() {
        return name;
    }

    protected String name;

}

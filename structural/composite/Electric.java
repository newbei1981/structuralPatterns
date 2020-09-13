package com.newbie.structural.composite;

public class Electric implements SpecialtyBuilders{

    @Override
    public void buildSome() {
        System.out.println("Electric: I am responsible for the electrician at the construction site !");
    }
}

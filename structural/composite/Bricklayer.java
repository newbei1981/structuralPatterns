package com.newbie.structural.composite;

public class Bricklayer implements SpecialtyBuilders{
    @Override
    public void buildSome() {
        System.out.println("Bricklayer: I bricking layer's !");
    }
}

package com.newbie.structural.composite;

public class FoundationBuilder implements SpecialtyBuilders{
    @Override
    public void buildSome() {
        System.out.println("FoundationBuilder: I fill the foundation !");
    }
}

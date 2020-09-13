package com.newbie.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class StarTapDemo {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("php"));
        developers.add(factory.getDeveloperBySpecialty("php"));
        developers.add(factory.getDeveloperBySpecialty("php"));

        for (Developer developer:developers){
            developer.writeCode();
        }
    }
}

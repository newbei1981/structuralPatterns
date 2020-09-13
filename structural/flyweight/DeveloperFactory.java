package com.newbie.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);
        if (developer == null){
            switch (specialty){
                case "java":
                    System.out.println("Java developer you had a job !");
                    developer = new JavaDeveloper();
                    break;
                case "php":
                    System.out.println("Php developer you had a job !");
                    developer = new PhpDeveloper();
                    break;
            }
            developers.put(specialty,developer);
        }
        return developer;
    }
}

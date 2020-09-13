package com.newbie.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ConstructionTeam {
    private List<SpecialtyBuilders> specialtyBuilders = new ArrayList<>();

    public void addBuilders(SpecialtyBuilders specialtyBuilder){
        specialtyBuilders.add(specialtyBuilder);
    }

    public void deleteBuilders(SpecialtyBuilders specialtyBuilder){
        specialtyBuilders.remove(specialtyBuilder);
    }

    public void createConstructionSite(){
        for (SpecialtyBuilders sb:specialtyBuilders){
            sb.buildSome();
        }
    }
}

package com.newbie.structural.composite;

public class ConstructionSite {

    public static void main(String[] args) {
        ConstructionTeam team = new ConstructionTeam();

        SpecialtyBuilders foundation1 = new FoundationBuilder();
        SpecialtyBuilders foundation2 = new FoundationBuilder();
        SpecialtyBuilders foundation3 = new FoundationBuilder();
        SpecialtyBuilders bricklayer1 = new Bricklayer();
        SpecialtyBuilders bricklayer2 = new Bricklayer();
        SpecialtyBuilders electric = new Electric();

        team.addBuilders(foundation1);
        team.addBuilders(foundation2);
        team.addBuilders(foundation3);
        team.addBuilders(bricklayer1);
        team.addBuilders(bricklayer2);
        team.addBuilders(electric);

        team.createConstructionSite();

    }
}

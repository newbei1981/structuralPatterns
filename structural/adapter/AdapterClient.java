package com.newbie.structural.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        AdapterJsonFromXMLParser adapter = new AdapterJsonFromXMLParser();
        adapter.readJson();
        System.out.println("! Do it some work with JSON data !");
        adapter.writeJson();
    }
}

package com.newbie.structural.adapter;

public class AdapterJsonFromXMLParser extends XMLParser implements JsonParser{

    @Override
    public void readJson() {
        readXMLFile();
        System.out.println("Some operations with XML data and transform to Json ...");
    }

    @Override
    public void writeJson() {
        System.out.println("Transform from JSON to XML and write to file ...");
        writeXMLFile();
    }
}

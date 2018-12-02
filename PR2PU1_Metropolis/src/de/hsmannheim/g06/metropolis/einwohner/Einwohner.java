package de.hsmannheim.g06.metropolis.einwohner;

public class Einwohner {
    String name;
    
    public Einwohner() {
        name = "";
    }
    
    public Einwohner(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

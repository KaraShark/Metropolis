package de.hsmannheim.g22.metropolis.einwohner.menschen;

import de.hsmannheim.g22.metropolis.einwohner.Einwohner;

class Mensch extends Einwohner{
    private int alter;
    
    public Mensch(){}
    
    public Mensch(String name, int alter){
        super(name);
        this.alter = alter;
    }
    
    public int getAlter(){
        return this.alter;
    }
}

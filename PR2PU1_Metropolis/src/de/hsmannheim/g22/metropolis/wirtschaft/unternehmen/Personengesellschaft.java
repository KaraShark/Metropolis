package de.hsmannheim.g22.metropolis.wirtschaft.unternehmen;

import de.hsmannheim.g22.metropolis.einwohner.menschen.Buerger;

public class Personengesellschaft extends Unternehmen {
    private Buerger inhaber;
    
    public Personengesellschaft(){}
    
    public Personengesellschaft(String name, int gewinn, Buerger inhaber){
        super(name,gewinn);
        this.inhaber = inhaber;
    }
    
    public Buerger getInhaber(){
        return this.inhaber;
    }
}

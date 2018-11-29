package de.hsmannheim.g22.metropolis.einwohner.mutanten;

import de.hsmannheim.g22.metropolis.einwohner.Einwohner;

class Mutant extends Einwohner{
    private String superkraft;
    public Mutant(){ }
    
    public Mutant(String name, String superkraft){
        super(name);
        this.superkraft = superkraft;
    }
    
    public void kaempfe(Mutant mutant){
        
    }
}

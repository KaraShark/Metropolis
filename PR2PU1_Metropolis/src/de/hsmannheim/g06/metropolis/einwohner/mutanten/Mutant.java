package de.hsmannheim.g06.metropolis.einwohner.mutanten;

import de.hsmannheim.g06.metropolis.einwohner.Einwohner;

class Mutant extends Einwohner{
    private String superkraft;
    
    public Mutant(){ }
    
    public Mutant(String name, String superkraft){
        super(name);
        this.superkraft = superkraft;
    }
    
    public void kaempfe(Mutant mutant){
        
    }
    
    public String getSuperkraft() {
		return superkraft;
	}
}

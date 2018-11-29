package de.hsmannheim.g22.metropolis.einwohner.mutanten;

public class Schurke extends Mutant{
    private int einkommen;
    private String superkraft;
    
    public Schurke(){}
    
    public Schurke(String name, String superkraft, int einkommen){
        //name
        this.superkraft = superkraft;
        this.einkommen = einkommen;
        
    }
    
    public String getSuperkraft(){
        return this.superkraft;
    }
}

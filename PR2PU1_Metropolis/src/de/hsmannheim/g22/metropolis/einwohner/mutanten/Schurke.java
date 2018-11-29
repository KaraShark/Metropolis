package de.hsmannheim.g22.metropolis.einwohner.mutanten;

public class Schurke extends Mutant{
    private int einkommen;
    private String schwaeche;
    
    public Schurke(){}
    
    public Schurke(String name, String schwaeche, int einkommen){
        //name
        this.schwaeche = schwaeche;
        this.einkommen = einkommen;
        
    }
    
    public String getSchwaeche(){
        return this.schwaeche;
    }
}

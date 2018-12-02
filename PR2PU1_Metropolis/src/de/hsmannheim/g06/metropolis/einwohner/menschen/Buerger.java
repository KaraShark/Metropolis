package de.hsmannheim.g06.metropolis.einwohner.menschen;

public class Buerger extends Mensch{
    private int einkommen;
    //private Unternehmen arbeit;
    
    //Konstruktoren
    public Buerger(){}
    
    public Buerger(String name, int alter, int einkommen){
        super(name,alter);
        this.einkommen = einkommen;
    }

    public int getEinkommen(){
        return this.einkommen;
    }
}

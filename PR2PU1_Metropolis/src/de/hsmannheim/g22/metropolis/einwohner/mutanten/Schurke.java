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
    
    public boolean kaempfe(Superheld superheld){
        boolean gewonnen = false;
        
        for(int i=0;i<superheld.getSuperkraefte().length;i++){
            if(schwaeche.equals(superheld.getSuperkraefte())){
                gewonnen = false;
            }
            else{
                gewonnen = true;
            }
            
        }
        return gewonnen;
    }
    
    public String getSchwaeche(){
        return this.schwaeche;
    }
    
}

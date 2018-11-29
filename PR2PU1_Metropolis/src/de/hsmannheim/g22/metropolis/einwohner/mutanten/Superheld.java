package de.hsmannheim.g22.metropolis.einwohner.mutanten;

public class Superheld extends Mutant{
    private String[] superkraefte;
    
    public Superheld(){}
    public Superheld(String name, String[] superkraefte){
        //name
        this.superkraefte = superkraefte;    
    }
    public void kaempfe(Schurke schurke){
        
    }
    
    public String[] getSuperkraefte(){
        for(int i=0;i<superkraefte.length;i++){
           System.out.print(superkraefte[i]);
        }
        return superkraefte;
    }
}

package de.hsmannheim.g06.metropolis.einwohner.menschen;

import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;

public class Richter extends Mensch {
    private boolean istKorrupt = false;
    
    public Richter(){ }
    
    public Richter(String name, int alter, boolean istKorrupt){
        super(name,alter);
        this.istKorrupt = istKorrupt;
    }

    public boolean verurteile(Schurke schurke){
        if(istKorrupt == true){
           System.out.println(schurke.getName() + " wurde nicht verurteilt!");
            return false; 
        }
        System.out.println(schurke.getName() + " wurde verurteilt!");
        return true;
    }
    
    public boolean getIstKorrupt(){
        if(istKorrupt == true){
            return true;
        }
        return false;
    }
    
    /*
    public static void main(String[] args){
        Richter richter1 = new Richter("Peter",50,true);
        Schurke schurke1 = new Schurke("Schurkii","Feuer",1000);
        
        System.out.println(richter1.getIstKorrupt());
        System.out.println(richter1.verurteile(schurke1));
        
    }*/
}

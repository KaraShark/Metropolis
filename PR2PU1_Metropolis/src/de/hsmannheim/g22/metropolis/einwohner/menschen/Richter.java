package de.hsmannheim.g22.metropolis.einwohner.menschen;

import de.hsmannheim.g22.metropolis.einwohner.mutanten.Schurke;

public class Richter extends Mensch {
    private boolean istKorrupt = false;
    
    public Richter(){ }
    
    public Richter(String name, int alter, boolean istKorrupt){
        super(name,alter);
        this.istKorrupt = istKorrupt;
    }

    public boolean verurteile(Schurke schurke){
        if(istKorrupt == true){
           return false; 
        }
        return true;
    }
    
    public boolean getIstKorrupt(){
        if(istKorrupt == true){
            return true;
        }
        return false;
    }
}

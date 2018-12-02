package de.hsmannheim.g06.metropolis.wirtschaft.unternehmen;

import de.hsmannheim.g06.metropolis.einwohner.menschen.Buerger;

public class Kapitalgesellschaft extends Unternehmen {
    private Buerger[] gesellschaftler;
    
    public Kapitalgesellschaft(){ }
    
    public Kapitalgesellschaft(String name, int gewinn, Buerger[] gesellschaftler){
       super(name,gewinn);
       this.gesellschaftler = gesellschaftler;
    }
 
    public int getGesellschaftler(){
        return gesellschaftler.length + 1;
    }
}

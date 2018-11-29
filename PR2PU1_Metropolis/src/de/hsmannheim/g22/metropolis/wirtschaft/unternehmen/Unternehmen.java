package de.hsmannheim.g22.metropolis.wirtschaft.unternehmen;

class Unternehmen {
    private String name;
    private int gewinn;
    
    public Unternehmen(){ }
    
    public Unternehmen(String name,int gewinn){
        this.name = name;
        this.gewinn = gewinn;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getGewinn(){
        return this.gewinn;
    }
}

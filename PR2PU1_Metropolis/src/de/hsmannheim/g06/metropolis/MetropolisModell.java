package de.hsmannheim.g06.metropolis;

import de.hsmannheim.g06.metropolis.einwohner.menschen.Buerger;
import de.hsmannheim.g06.metropolis.einwohner.menschen.Richter;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Superheld;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Kapitalgesellschaft;

public class MetropolisModell {
    
    //Bürger erstellen
    Buerger buerger1 = new Buerger("Werner Mueller",50,30000);
    Buerger buerger2 = new Buerger("Peter Kreuz",56,50000);
    Buerger buerger3 = new Buerger("Jens Meier",28,40000);
    Buerger buerger4 = new Buerger("Michael Jung",19,10000);
    Buerger buerger5 = new Buerger("Kevin Aulik",15,0);
    
    //Richter erstellen
    Richter richter1 = new Richter("Jacob Altmeier",50,false);
    Richter richter2 = new Richter("Anna Meier",35,false);
    Richter richter3 = new Richter("Andreas Scheuer",48,true);
    Richter richter4 = new Richter("Patrick Neumann",41,true);
    
    //Superhelden
    String[] superkraefte1 = {"Feuer","schlau"};
    Superheld superheld1 = new Superheld("Feuermann",superkraefte1);
    
    String[] superkraefte2 = {"Eis","langsam"};
    Superheld superheld2 = new Superheld("Eismann",superkraefte2);
    
    
    //Schurken
    Schurke schurke1 = new Schurke("Schurki","Feuer",20000);
    Schurke schurke2 = new Schurke("Schurkos","langsam",100000);
    Schurke schurke3 = new Schurke("Schurklady","dumm",50000);
    
    //Unternehmen
    //Kapitalgesellschaft kg1 = new Kapitalgesellschaft("Daimler",2500000,);
    
    
}

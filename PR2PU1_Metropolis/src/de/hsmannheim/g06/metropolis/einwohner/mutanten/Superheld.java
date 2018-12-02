package de.hsmannheim.g06.metropolis.einwohner.mutanten;

public class Superheld extends Mutant {
    private String[] superkraefte;

    public Superheld() {
    }

    public Superheld(String name, String[] superkraefte) {
        // name
        this.superkraefte = superkraefte;
    }

    public boolean kaempfe(Schurke schurke) {
        boolean gewonnen = false;

        for (int i = 0; i < superkraefte.length; i++) {
            if (superkraefte[i].equals(schurke.getSchwaeche())) {
                gewonnen = true;
            }
        }
        return gewonnen;

    }

    // nicht ganz sicher
    public String[] getSuperkraefte() {
        // for(int i=0;i<superkraefte.length;i++){
        // System.out.print(superkraefte[i]);
        // }
        return superkraefte;
    }
}
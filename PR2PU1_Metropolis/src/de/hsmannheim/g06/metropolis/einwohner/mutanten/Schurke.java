package de.hsmannheim.g06.metropolis.einwohner.mutanten;

public class Schurke extends Mutant {
    private int einkommen;
    private String schwaeche;

    public Schurke() {
    }

    public Schurke(String name, String schwaeche, int einkommen) {
        // name
        this.schwaeche = schwaeche;
        this.einkommen = einkommen;

    }

    public boolean kaempfe(Superheld superheld) {
        boolean gewonnen = true;

        for (int i = 0; i < superheld.getSuperkraefte().length && gewonnen; i++) {
            if (schwaeche.equals(superheld.getSuperkraefte()[i])) {
                gewonnen = false;
            }

        }
        return gewonnen;
    }

    public String getSchwaeche() {
        return this.schwaeche;
    }

    public int getEinkommen() {
        return einkommen;
    }

}

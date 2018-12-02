package de.hsmannheim.g06.metropolis.einwohner.mutanten;

import de.hsmannheim.g06.metropolis.einwohner.Einwohner;

class Mutant extends Einwohner {
    private String superkraft;

    public Mutant() {
    }

    public Mutant(String name) {
        super(name);
    }

    public void kaempfe(Mutant mutant) {

    }

    public String getSuperkraft() {
        return superkraft;
    }
}

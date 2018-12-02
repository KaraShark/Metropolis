package de.hsmannheim.g06.metropolis;

import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;

public class Syndikat {
    private Schurke[] mitglieder;
    private String name;

    public Syndikat(String name, Schurke... mitglieder) {
        this.name = name;
        this.mitglieder = mitglieder;
    }

    public Schurke[] getMitglieder() {
        return mitglieder;
    }

    public String getName() {
        return name;
    }
}

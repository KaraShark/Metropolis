package de.hsmannheim.g22.metropolis.wirtschaft.steuern;

// Klasse für die Gewerbesteuer die die Methode der Steuerberechnung Implementiert.
//
// Steuerbeschreiung:
// Eine lineare Steuer von 10% auf den Gewinn aller Unternehmen, unabhaengig von der Rechtsform
public class Gewerbesteuer implements Steuer {
    private final float GWST_SATZ = 0.1f;
    
    @Override // Berechne Zu Zahlenden Betrag fuer eine bestimmte Menge Metro Dollar
    public int berechne(int betrag) {
        if(betrag > 0) {
            return (int) (betrag * GWST_SATZ);
        }
        else {
            return 0;
        }
    }
    
    public float getGWST_SATZ() {
        return GWST_SATZ;
    }
    
}

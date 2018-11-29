package de.hsmannheim.g22.metropolis.wirtschaft.steuern;

// Klasse für die Gewerbesteuer die die Methode der Steuerberechnung Implementiert.
//
// Steuerbeschreiung:
// Eine Lineare Steuer in Hoehe von 25%.
public class Koerperschaftsteuer implements Steuer {
    private final float KST_SATZ = 0.25f;
    
    @Override // Berechne Zu Zahlenden Betrag fuer eine bestimmte Menge Metro Dollar
    public int berechne(int betrag) {
        if(betrag > 0) {
            return (int) (betrag * KST_SATZ);
        }
        else {
            return 0;
        }
    }
    
    public float getKST_SATZ() {
        return KST_SATZ;
    }
    
}

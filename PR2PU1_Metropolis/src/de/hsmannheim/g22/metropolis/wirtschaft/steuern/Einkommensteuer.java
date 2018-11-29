package de.hsmannheim.g22.metropolis.wirtschaft.steuern;

import java.util.Arrays;

// Klasse für die Einkommenssteuer die die Methode der Steuerberechnung Implementiert.
// 
// Steuerbeschreiung:
// Eine progressive Steuer auf das Einkommen von Burgern, Personengesellschaften und Schurken. 
public class Einkommensteuer implements Steuer { 
    
    // Array mit allen Stufensaetzen der Einkommensteuer
    // die ersten    20 kMD - 10 Prozent - EKS_STUFENSATZ[0]
    // die naechsten 40 kMD - 25 Prozent - EKS_STUFENSATZ[1]
    // die naechsten 60 kMD - 34 Prozent - EKS_STUFENSATZ[2]
    // alle weiteren MD     - 50 Prozent - EKS_STUFENSATZ[3]
    private final float[] EKS_STUFENSATZ = { 0.1f, 0.25f, 0.35f, 0.5f };
    
    @Override // Berechne Zu Zahlenden Betrag fuer eine bestimmte Menge Metro Dollar
    public int berechne(int betrag) {
        if(betrag <= 0) {
            return 0;
        }
        else if(betrag <= 20000) {
            return (int) (betrag * EKS_STUFENSATZ[0]);
        }
        else if(betrag <= 60000) {
            return (int) (((betrag - 20000) * EKS_STUFENSATZ[1]) + 2000);
        }
        else if(betrag <= 110000) {
            return (int) (((betrag - 60000) * EKS_STUFENSATZ[2]) + 12000);
        }
        else {
            return (int) (((betrag - 120000) * EKS_STUFENSATZ[3]) + 24000);
        }
    }
    
    public float[] getEKSStufensatz() {
        return Arrays.copyOf(EKS_STUFENSATZ, EKS_STUFENSATZ.length);
    }
    
    // Getter fuer eine bestimmte Steuersatz Stufe
    // Wirft ArrayIndexOutOfBoundsException sollte gefragte Stufe auserhalb des Arrays sein
    public float getEKSStufe(int stufe) throws ArrayIndexOutOfBoundsException {
        if(stufe >= 0 && stufe < EKS_STUFENSATZ.length) {
            return EKS_STUFENSATZ[stufe];
        }
        else {
            throw new ArrayIndexOutOfBoundsException("EKS Stufe Existiert nicht");
        }
    }
    
}

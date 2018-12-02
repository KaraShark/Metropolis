package de.hsmannheim.g06.metropolis;

import de.hsmannheim.g06.metropolis.einwohner.menschen.Buerger;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;
import de.hsmannheim.g06.metropolis.wirtschaft.steuern.Einkommensteuer;
import de.hsmannheim.g06.metropolis.wirtschaft.steuern.Gewerbesteuer;
import de.hsmannheim.g06.metropolis.wirtschaft.steuern.Koerperschaftsteuer;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Personengesellschaft;

public class Finanzamt {
	private Buerger[] buerger;
	private Schurke[] schurken;
	private Syndikat[] syndikate;
	private Kapitalgesellschaft[] kapGes;
	private Personengesellschaft[] persGes;
	
	private Koerperschaftsteuer kst = new Koerperschaftsteuer();
	private Gewerbesteuer gwst = new Gewerbesteuer();
	private Einkommensteuer eks = new Einkommensteuer();
	
	public Finanzamt(Buerger[] buerger, Schurke[] schurken, Syndikat[] syndikate, Kapitalgesellschaft[] kapGes, Personengesellschaft[] persGes) {
		this.buerger   = buerger;
		this.syndikate = syndikate;
		this.kapGes    = kapGes;
		this.persGes   = persGes;
		this.schurken  = schurken;
	}
	
	public long berechneSteuereinnahmen() {
		System.out.println("Berechne Steuereinnahmen von Metropolis...");
		long summe = 0;
		
		summe += berechneKoerperschaftsteuer() + berechneGewerbesteuer() + berechneEinkommensteuer();
		
		System.out.println("Steuereinnahmen von Metropolis: "+ summe);
		return summe;
	}
	
	// Berechnung der Einkommensteuer:
	// Eine progressive Steuer auf das Einkommen von Burgern, Personengesellschaften und Schurken. 
	// Die Superhelden und Richter sind von der Einkommensteuer befreit, weil sie soviel gutes fur Metropolis tun.
	private long berechneEinkommensteuer() {
		System.out.println("Berechne Einkommensteuer...");
		long summe = 0;
		
		// Berechne Einkommensteuer fuer Buerger
		if(isConsistent(buerger)) {
			for (Buerger burgr : buerger) {
				summe += eks.berechne(burgr.getEinkommen());
			}
		}
		
		// Berechne Einkommensteuer fuer Personengesellschaften
		if(isConsistent(persGes)) {
			for (Personengesellschaft ges : persGes) {
				summe += eks.berechne(ges.getGewinn());
			}
		}
		
		// Berechne Einkommensteuer fuer Schurken
		if(isConsistent(schurken)) {
			for (Schurke schurke : schurken) {
				summe += eks.berechne(schurke.getEinkommen());
			}
		}
		
		System.out.println("Einkommensteuer: " + summe + " MD");
		return summe;
	}

	// Berechnung der Gewerbesteuer:
	// Eine lineare Steuer von 10 Prozent auf den Gewinn aller Unternehmen, unabhaengig von der Rechtsform. 
	// Naturliche Personen, d. h. Schurken und Buerger muessen diese Steuer nicht abfuhren.
	// Personengesellschaften haben noch eine Steuerermaessigung von 1000 Metro-Dollar auf den
	// Betrag der Steuer (nicht die Bemessungsgrundlage). Die Steuer kann hierbei niemals negativ werden.
	private long berechneGewerbesteuer() {
		System.out.println("Berechne Gewerbesteuer...");
		long summe = 0;
		long buffer = 0;
		
		// Berechne fuer Personengesellschaften
		if(isConsistent(persGes)) {
			for (Personengesellschaft ges : persGes) {
				buffer = gwst.berechne(ges.getGewinn()) - 1000;
				
				if(buffer > 0) {
					summe += buffer;
				}
			}
		}
		
		
		// Berechne fuer Kapitalgesellschaften
		if(isConsistent(kapGes)) {
			for (Kapitalgesellschaft ges : kapGes) {
				summe += gwst.berechne(ges.getGewinn());
			}
		}
		
		System.out.println("Gewerbesteuer: " + summe + " MD");
		return summe;
	}

	// Berechnung der Koerperschaftsteuer:
	// Sie muss nur von Kapitalgesellschaften und Schurken-Syndikaten abgefuhrt werden.
	// Bei den Kapitalgesellschaften bemisst sie sich nach dem Gewinn,
	// bei den Syndikaten nach der Summe der Einkommen aller in dem Syndikat organisierten Schurken.
	// Da Schurken auch noch Einkommensteuer bezahlen mussen, werden Sie doppelt belastet
	// was aber wegen ihres schlechten Charakters alle anderen Burger von Metropolis voll kommen OK finden. 
	// Die einzelnen Steuern koennen nicht gegeneinander verrechnet werden sondern werden einfach aufsummiert.
	private long berechneKoerperschaftsteuer() {
		System.out.println("Berechne Koerperschaftsteuer...");
		long summe = 0;
		
		// Berechne Koerperschaftsteuer fuer Kapitalgesellschaften
		if(isConsistent(kapGes)) {
			for(Kapitalgesellschaft ges : kapGes) {
				summe += kst.berechne(ges.getGewinn());
			}
		}
		
		// Berechne Koerperschaftsteuer fuer Syndikate
		if(isConsistent(syndikate)) {
			for(Syndikat syndikat : syndikate) {
				
				// Hole dass Einkommen aller Schurken im syndikat
				int memberIncome = 0;
				
				for(Schurke mitglied : syndikat.getMitglieder()){
					memberIncome += mitglied.getEinkommen();
				}
				
				summe += kst.berechne(memberIncome);
			}
		}
		
		System.out.println("Koerperschaftsteuer: " + summe + " MD");
		return summe;
	}
	
	// Teste ob Array initialisiert und mindestens 1 Eintrag lang ist
	private boolean isConsistent(Object[] objects) {
		if(objects != null && objects.length > 0) {
			return true;
		}
		return false;
	}
	
}

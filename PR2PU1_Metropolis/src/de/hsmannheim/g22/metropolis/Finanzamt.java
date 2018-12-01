package de.hsmannheim.g22.metropolis;

import de.hsmannheim.g22.metropolis.einwohner.menschen.Buerger;
import de.hsmannheim.g22.metropolis.wirtschaft.steuern.Einkommensteuer;
import de.hsmannheim.g22.metropolis.wirtschaft.steuern.Gewerbesteuer;
import de.hsmannheim.g22.metropolis.wirtschaft.steuern.Koerperschaftsteuer;
import de.hsmannheim.g22.metropolis.wirtschaft.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.g22.metropolis.wirtschaft.unternehmen.Personengesellschaft;

public class Finanzamt {
	private Buerger[] buerger;
	private Syndikat[] syndikate;
	private Kapitalgesellschaft[] kapGes;
	private Personengesellschaft[] persGes;
	
	private Koerperschaftsteuer kst;
	private Gewerbesteuer gwst;
	private Einkommensteuer eks;
	
	public Finanzamt(Buerger[] buerger, Syndikat[] syndikate, Kapitalgesellschaft[] kapGes, Personengesellschaft[] persGes) {
		this.buerger   = buerger;
		this.syndikate = syndikate;
		this.kapGes    = kapGes;
		this.persGes   = persGes;
	}
	
	public long berechneSteuereinnahmen() {
		System.out.println("Berechne Steuereinnahmen von Metropolis...");
		long summe = 0;
		
		summe += berechneKoerperschaftsteuer() 
				+ berechneGewerbesteuer() 
				+ berechneEinkommensteuer();
		
		System.out.println("Steuereinnahmen von Metropolis: "+ summe);
		return summe;
	}
	
	// Berechnung der Einkommensteuer:
	// Eine progressive Steuer auf das Einkommen von Burgern, Personengesellschaften und Schurken. 
	// Die Superhelden und Richter sind von der Einkommensteuer befreit, weil sie soviel gutes fur Metropolis tun.
	private int berechneEinkommensteuer() {
		System.out.println("Berechne Einkommensteuer...");
		int summe = 0;
		
		
		
		System.out.println("Einkommensteuer: " + summe + " MD");
		return 0;
	}

	// Berechnung der Gewerbesteuer:
	// Eine lineare Steuer von 10 Prozent auf den Gewinn aller Unternehmen, unabhaengig von der Rechtsform. 
	// Naturliche Personen, d. h. Schurken und Buerger muessen diese Steuer nicht abfuhren.
	// Personengesellschaften haben noch eine Steuerermaessigung von 1000 Metro-Dollar auf den
	// Betrag der Steuer (nicht die Bemessungsgrundlage). Die Steuer kann hierbei niemals negativ werden.
	private int berechneGewerbesteuer() {
		System.out.println("Berechne Gewerbesteuer...");
		int summe = 0;
		
		
		
		System.out.println("Gewerbesteuer: " + summe + " MD");
		return 0;
	}

	// Berechnung der Koerperschaftsteuer:
	// Sie muss nur von Kapitalgesellschaften und Schurken-Syndikaten abgefuhrt werden.
	// Bei den Kapitalgesellschaften bemisst sie sich nach dem Gewinn,
	// bei den Syndikaten nach der Summe der Einkommen aller in dem Syndikat organisierten Schurken.
	// Da Schurken auch noch Einkommensteuer bezahlen mussen, werden Sie doppelt belastet
	// was aber wegen ihres schlechten Charakters alle anderen Burger von Metropolis voll kommen OK finden. 
	// Die einzelnen Steuern koennen nicht gegeneinander verrechnet werden sondern werden einfach aufsummiert.
	private int berechneKoerperschaftsteuer() {
		System.out.println("Berechne Koerperschaftsteuer...");
		int summe = 0;
		
		
		
		System.out.println("Koerperschaftsteuer: " + summe + " MD");
		return 0;
	}
	
	private boolean isConsistent(Object[] objects) {
		if(objects != null && objects.length > 0) {
			return true;
		}
		return false;
	}
	
}

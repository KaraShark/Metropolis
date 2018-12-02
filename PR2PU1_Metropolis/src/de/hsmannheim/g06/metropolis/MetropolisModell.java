package de.hsmannheim.g06.metropolis;

import java.util.Random;

import de.hsmannheim.g06.metropolis.einwohner.menschen.Buerger;
import de.hsmannheim.g06.metropolis.einwohner.menschen.Richter;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Superheld;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Personengesellschaft;

public class MetropolisModell {
	private Buerger[] buerger;
	private Richter[] richter;
	private Schurke[] schurken;
	private Superheld[] superhelden;
	private Personengesellschaft[] persGesellschaften;
	private Kapitalgesellschaft[] kapGesellschaften;
	private Syndikat[] syndikate;
	
	private Finanzamt finanzamt;
	
	public MetropolisModell(Buerger[] buerger, Richter[] richter, Schurke[] schurken, Superheld[] superhelden, Personengesellschaft[] persoenengesellschaften, Kapitalgesellschaft[] kapitalgesellschaften) {
		this.buerger = buerger;
		this.richter = richter;
		this.schurken = schurken;
		this.superhelden = superhelden;
		this.persGesellschaften = persoenengesellschaften;
		this.kapGesellschaften = kapitalgesellschaften;
		
		finanzamt = new Finanzamt(this.buerger, this.schurken, this.syndikate, this.kapGesellschaften, this.persGesellschaften);
		finanzamt.berechneSteuereinnahmen();
	}
	
	public void kampfhandlung(Superheld superheld, Schurke schurke) {
		boolean hatSchurkenBesiegt = false;
		
		System.out.println(superheld.getName() + " versucht " + schurke.getName() + "aufzuhalten...");
		hatSchurkenBesiegt = superheld.kaempfe(schurke);
		
		if(hatSchurkenBesiegt) {
			System.out.println(schurke.getName() + " wurde besiegt und wird dem Richter vorgefuehrt");
			richter[new Random().nextInt(richter.length)].verurteile(schurke);
		}
		else {
			System.out.println(schurke.getName() + " konnte entkommen!");
		}
		
	}
	
}

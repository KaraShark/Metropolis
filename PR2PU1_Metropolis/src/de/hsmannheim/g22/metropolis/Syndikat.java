package de.hsmannheim.g22.metropolis;

import java.util.Arrays;

import de.hsmannheim.g22.metropolis.einwohner.mutanten.Schurke;

public class Syndikat {
	private Schurke[] mitglieder;
	
	public Schurke[] getMitglieder() {
		return Arrays.copyOf(mitglieder, mitglieder.length);
	}
}

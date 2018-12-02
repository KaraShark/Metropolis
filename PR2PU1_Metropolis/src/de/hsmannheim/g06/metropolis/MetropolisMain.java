package de.hsmannheim.g06.metropolis;

import de.hsmannheim.g06.metropolis.einwohner.menschen.Buerger;
import de.hsmannheim.g06.metropolis.einwohner.menschen.Richter;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Schurke;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.Superheld;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Kapitalgesellschaft;
import de.hsmannheim.g06.metropolis.wirtschaft.unternehmen.Personengesellschaft;

public class MetropolisMain {

	public static void main(String[] args) {
		/**
		 *  Ausgeglichenes Metropolis
             Metropolis geht es gut, es gibt genug Superhelden um die kleine Mehrzahl von Schurken in schach zu halten und wenige korrupte Richter
             Normale Anzahl an Buergern
             Schurken/Helden ratio 2/3
             Normale Anzahl an Unternehmen
		 */
	    Buerger[] normaleBuerger = {   
	        new Buerger("Peter Mueller", 50, 30000),
            new Buerger("Kurt Berger", 31, 25000),
            new Buerger("Manuel Meier", 26, 20000),
            new Buerger("Steffen Burg", 19, 0),
            new Buerger("Jens Peterson", 49, 40000),
            new Buerger("Lorenz Thomson", 41, 35000),
            new Buerger("James Mueller", 67, 100000),
            new Buerger("Stefanie Mai", 33, 45000),
            new Buerger("Helene Kurt", 64, 15000),
            new Buerger("Olga Novic ", 81, 0)
	    };
	    Richter[] normaleRichter = { 
	        new Richter("Werner Wahnsinn", 54, false),
	        new Richter("Melanie Neuberg", 39, false),
	        new Richter("Andreas Scheuer",43, true)
	    };
	    Superheld[] normaleSuperhelden = { 
	        new Superheld("Feuermann", "Feuer","langsam"),
	        new Superheld("Eismagier", "Eis")
	    };
	    Schurke[] normaleSchurke = { 
	        new Schurke("Schurki","Eis",20000),
	        new Schurke("Schurkos", "schnell", 35000),
	        new Schurke("Schurklady", "schlau", 15000)
	    };
	    Syndikat[] normalesSyndikat = {
	        new Syndikat("Die Dreisten Drei", normaleSchurke)
	    };
	    Kapitalgesellschaft[] normaleKapitalgesellschaft = {
	        new Kapitalgesellschaft("Daimler AG", 5000000, normaleBuerger[1], normaleBuerger[2], normaleBuerger[5], normaleBuerger[8])
	    };
	    Personengesellschaft[] normalePersonengesellschaft = {
	        new Personengesellschaft("Meier KG", 750000, normaleBuerger[3]),
            new Personengesellschaft("Maler OHG", 450000, normaleBuerger[4])
        };
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Normales Metropolis<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		MetropolisModell normalMetropolis = new MetropolisModell(normaleBuerger, normaleRichter, normaleSchurke, normaleSuperhelden, normalePersonengesellschaft, normaleKapitalgesellschaft, normalesSyndikat);
		for (int i = 0; i < 20; i++) {
			normalMetropolis.kampfhandlung();
		}
		
		// Utopisches Metropolis
		// Metropolis geht es sehr gut, viele unternehmen und reiche b�rger bescheren viele steuereinnahmen. 
		// Durch das harte durchgreifen von vielen nicht korrupten richtern gibt es fast keine Schurken.
		// Gro�e anzahl von Buergern
		// Schurken/Helden ratio 1/4
		// Grosse anzahl von Unternehmen
		//MetropolisModell utopiaMetropolis = new MetropolisModell();
		//for (int i = 0; i < 20; i++) {
			//utopiaMetropolis.kampfhandlung();
		//}

		/**
		 *  Dystopisches Metropolis
             Professor Xavier hat schon befuerhtet dass Schurken und Syndikate Metropolis in ihre finger bekommen. 
             Zudem hat eine ueberpopulation an menschen dafuer gesorgt dass Nahrung und Wasser mangelwahre sind.
             Ein ominoeser Konzern, der sein Geld mit dem verkauf von gelben und guenen Rationsriegeln macht hat eine Monopolstellung der Unternehmen.
             Die Richter sind ein korruptes Pack auf der seite der Konzerne und Schurken.
             Riesige anzahl an Buergern
             Schurken/Helden ratio 1/8
             Ein Ominoeses Kapitalunternehmen
		 */
		Buerger[] dystBuerger = {
				new Buerger("Kurt Berger", 85, 20000),
				new Buerger("Marc Bauer", 21, 30500),
				new Buerger("Mira Lechstein", 35, 30500),
				new Buerger("Solomon Roth", 40, 10800),
				new Buerger("Robert Thorn", 60, 42000),
				new Buerger("Shirl", 45, 32000),
				new Buerger("Tab Fielding", 42, 12000),
				new Buerger("Andrea Towak", 35, 10000),
				new Buerger("Ohfuk Karen", 23, 12000),
				new Buerger("Todd Edwield", 45, 13000),
				new Buerger("Annika Blue", 12, 100),
				new Buerger("Pad Brown", 35, 17000),
				new Buerger("Mac Giver", 86, 43000),
				new Buerger("Hans Raum", 54, 15000),
				new Buerger("Anna Schnitz", 23, 12000),
				new Buerger("Sandra Scheiner", 78, 45000),
				new Buerger("Klara Schoen", 34, 15000),
				new Buerger("Paul Panzer", 48, 8000),
				new Buerger("Katarina FLint", 19, 10000),
				new Buerger("Black Kulozik", 50, 1000000),
                new Buerger("Joel Donovan", 65, 500000)
		};
		Richter[] dystRichter = {
			new Richter("Markus Braun", 50, false),
			new Richter("Kulozik Schwarz", 50, true),
			new Richter("Daniela Katzenberger", 42, true),
			new Richter("Joe Donovan", 65, true)
		};
		Superheld[] dystHelden = {
		        new Superheld("Super Siggi", "Nadespam", "360Noscope", "Stab der Muskelkraft", "Eisenfaust")
		};
		Schurke[] dystSchurken = {
			new Schurke("Black Kulozik", "360Noscope", 1000000),
			new Schurke("Joel Donovan", "Eisenfaust", 500000),
			new Schurke("Elias der Schreckliche", "Nadespam", 300000),
			new Schurke("Paul Richter", "Eisregen", 450000),
			new Schurke("Kevin", "Eisenfaust", 350000),
			new Schurke("Kokainmann", "Kalter Entzug", 100000),
			new Schurke("Helene Fischer", "Gute Musik", 4000000),
			new Schurke("Spageltazan", "Stab der Muskelkraft", 200000)
		};
		Syndikat[] dystSyndikate = {
		    new Syndikat("Die Schwarze Hand", dystSchurken),
		    new Syndikat("Die andere Hand", dystSchurken[3], dystSchurken[4], dystSchurken[5])
		};
		Personengesellschaft[] dystPersGes = {
		    new Personengesellschaft("Thorn Framing", dystBuerger[4].getEinkommen(), dystBuerger[4]),
		    new Personengesellschaft("Giver Improvisation", dystBuerger[12].getEinkommen(), dystBuerger[12]),
		    new Personengesellschaft("Scheiner Coop", dystBuerger[15].getEinkommen(), dystBuerger[15])
		};
		Kapitalgesellschaft[] dystKapGes = {
		    new Kapitalgesellschaft("Soylent Inc", 4000000, dystBuerger[19], dystBuerger[20])
		};
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Dystopisches Metropolis<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		MetropolisModell dystopiaMetropolis = new MetropolisModell(dystBuerger, dystRichter, dystSchurken, dystHelden, dystPersGes, dystKapGes, dystSyndikate);
		for (int i = 0; i < 20; i++) {
			dystopiaMetropolis.kampfhandlung();
		}
	}

}

package de.hsmannheim.g06.metropolis.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hsmannheim.g06.metropolis.einwohner.menschen.*;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.*;

public class JUnitTestEinwohner {
    public static final float PRAEZISION = 0.0001f;

    Buerger buerger = new Buerger("Markus", 22, 287);
    Richter korrupterRichter = new Richter("Harald", 55, true);
    Richter nichtKorrupterRichter = new Richter("Uwe", 20, false);
    Schurke darklord = new Schurke("Dark-Lord", "Feuer", 100000);
    Schurke captainevil = new Schurke("Captain Evil", "Wasser", 150000);
    Schurke robotinator = new Schurke("Robotinator", "Metall", 15000);
    Schurke manfred = new Schurke("Manfred", "Bierbauch", 1000);
    Superheld gertrud = new Superheld("Gertrud", new String[] { "Bierbauch", "Blitz" });
    Superheld luffy = new Superheld("Luffy", new String[] { "Gummi" });

    /**
     * Testet die Daten der Buerger
     */
    @Test 
    public void testeDatenVonBuerger() {
        assertEquals("Markus", buerger.getName());
        assertEquals(22, buerger.getAlter(), PRAEZISION);
        assertEquals(287, buerger.getEinkommen(), PRAEZISION);
    }

    /**
     * Testet kaempfe von Helden initiiert
     */
    @Test 
    public void testeKaempfeHeldGegenSchurke() {
        assertTrue(gertrud.kaempfe(manfred));
        assertFalse(gertrud.kaempfe(darklord));
    }
    
    /**
     * Testet kaempfe von Schurken initiiert
     */
    @Test 
    public void testeKaempfeSchurkeGegenHeld() {
        assertTrue(captainevil.kaempfe(luffy));
        assertFalse(manfred.kaempfe(gertrud));
    }

    /**
     * Testet verurteilen von korrupten Richter
     */
    @Test 
    public void testeKorrupterRichter() {
        assertFalse(korrupterRichter.verurteile(robotinator));
    }

    /**
     * Testet verurteilen von nicht korrupten Richter
     */
    @Test 
    public void testeNichtKorrupterRichter() {
        assertTrue(nichtKorrupterRichter.verurteile(manfred));
    }
}

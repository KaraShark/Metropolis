package de.hsmannheim.g06.metropolis.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hsmannheim.g06.metropolis.einwohner.menschen.*;
import de.hsmannheim.g06.metropolis.einwohner.mutanten.*;

public class JUnitTestEinwohner {
    public static final float PRAEZISION = 0.0001f;

    Buerger mustafa = new Buerger("Mustafa", 22, 5);
    Richter korrupterRichter = new Richter("Harald", 55, true);
    Richter nichtKorrupterRichter = new Richter("Uwe", 20, false);
    Schurke darklord = new Schurke("Dark-Lord", "Feuer", 100000);
    Schurke captainevil = new Schurke("Captain Evil", "Wasser", 150000);
    Schurke robotinator = new Schurke("Robotinator", "Metall", 15000);
    Schurke manfred = new Schurke("Manfred", "Bierbauch", 1000);
    Superheld gertrud = new Superheld("Gertrud", new String[] { "Bierbauch", "Blitz" });
    Superheld luffy = new Superheld("Luffy", new String[] { "Gummi" });

    @Test // teste die Daten der Buerger
    public void testeDatenVonBuerger() {
        assertEquals("Mustafa", mustafa.getName());
        assertEquals(22, mustafa.getAlter(), PRAEZISION);
        assertEquals(5, mustafa.getEinkommen(), PRAEZISION);
    }

    @Test // teste kaempfe von Helden initiiert
    public void testeKaempfeHeldGegenSchurke() {
        assertTrue(gertrud.kaempfe(manfred));
        assertFalse(gertrud.kaempfe(darklord));
    }

    @Test // teste kaempfe von Schurken initiiert
    public void testeKaempfeSchurkeGegenHeld() {
        assertTrue(captainevil.kaempfe(luffy));
        assertFalse(manfred.kaempfe(gertrud));
    }

    @Test // teste verurteilen von korrupten Richter
    public void testeKorrupterRichter() {
        assertFalse(korrupterRichter.verurteile(robotinator));
    }

    @Test // teste verurteilen von nicht korrupten Richter
    public void testeNichtKorrupterRichter() {
        assertTrue(nichtKorrupterRichter.verurteile(manfred));
    }
}

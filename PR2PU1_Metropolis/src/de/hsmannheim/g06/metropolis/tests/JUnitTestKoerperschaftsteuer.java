package de.hsmannheim.g06.metropolis.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hsmannheim.g06.metropolis.wirtschaft.steuern.Koerperschaftsteuer;


public class JUnitTestKoerperschaftsteuer {
    Koerperschaftsteuer kst = new Koerperschaftsteuer();
    
    @Test
    public void testGetKST_SATZ() {
        assertTrue("Fehler bei Get GWST_SATZ", kst.getKST_SATZ() == 0.25f);
    }
    
    @Test
    public void testBerechne() {
        assertTrue("Fehler beim berechnen von 10000", kst.berechne(10000) == 2500);
    }

    @Test
    public void testBerechneRandfaelle() {
        assertTrue("Fehler beim berechnen von -10000", kst.berechne(-10000) == 0);
        assertTrue("Fehler beim berechnen von 0", kst.berechne(0) == 0);
    }
}

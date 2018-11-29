package de.hsmannheim.g22.metropolis.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hsmannheim.g22.metropolis.wirtschaft.steuern.Gewerbesteuer;

public class JUnitTestGewerbesteuer {
    Gewerbesteuer gwst = new Gewerbesteuer();
    
    @Test
    public void testGetGWST_SATZ() {
        assertTrue("Fehler bei Get GWST_SATZ", gwst.getGWST_SATZ() == 0.1f);
    }
    
    @Test
    public void testBerechne() {
        assertTrue("Fehler beim berechnen von 10000", gwst.berechne(10000) == 1000);
    }

    @Test
    public void testBerechneRandfaelle() {
        assertTrue("Fehler beim berechnen von -10000", gwst.berechne(-10000) == 0);
        assertTrue("Fehler beim berechnen von 0", gwst.berechne(0) == 0);
    }
    
}

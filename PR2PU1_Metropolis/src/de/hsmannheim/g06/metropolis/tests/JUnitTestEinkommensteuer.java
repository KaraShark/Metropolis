package de.hsmannheim.g06.metropolis.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.hsmannheim.g06.metropolis.wirtschaft.steuern.Einkommensteuer;

public class JUnitTestEinkommensteuer {
    public static final float   PRAEZISION = 0.0001f;
    public static final float[] STEUERSATZ = {0.1f, 0.25f, 0.35f, 0.5f};
    
    Einkommensteuer eks = new Einkommensteuer();
    /**
     * Testet die Methode die den gesammten Steuersatz herausgibt
     */
    @Test 
    public void testEKSSTufensatz() {
        assertArrayEquals(STEUERSATZ, eks.getEKSStufensatz(), PRAEZISION);
    }
    
    /**
     * Testet die Methode die einzelne Steuersaetze nach Stufe herausgibt
     */
    @Test 
    public void testEKSGetStufe() {
        for (int stufe = 0; stufe < STEUERSATZ.length; stufe++) {
            assertEquals(STEUERSATZ[stufe], eks.getEKSStufe(stufe), PRAEZISION);
        }
    }
    
    /**
     *  Testet die Methode berechne auf Randfaelle
     */
    @Test 
    public void testBerechneRandfaelle() {
        assertTrue("Fehler beim berechnen von -1000", eks.berechne(-1000) == 0);
        assertTrue("Fehler beim berechnen von 0", eks.berechne(0) == 0);
    }
    
    /**
     * Testet die Berechnung der Stufe 1
     */
    @Test 
    public void testBerechneStufe0() {
        assertTrue("Fehler beim berechnen von 10,000", eks.berechne(10000) == 1000);
        assertTrue("Fehler beim berechnen von 20,000", eks.berechne(20000) == 2000);
    }
    /**
     * Testet die Berechnung der Stufe 2
     */
    @Test 
    public void testBerechneStufe1() {
        assertTrue("Fehler beim berechnen von 30,000", eks.berechne(30000) == 4500);
        assertTrue("Fehler beim berechnen von 40,000", eks.berechne(40000) == 7000);
    }
    
    /**
     *  Testet die Berechnung der Stufe 3
     */
    @Test 
    public void testBerechneStufe2() {
        assertTrue("Fehler beim berechnen von 50,000", eks.berechne(50000) == 9500);
        assertTrue("Fehler beim berechnen von 60,000", eks.berechne(60000) == 12000);
    }
    
    /**
     * Testet die Berechnung der Stufe 4
     */
    @Test 
    public void testBerechneStufe3() {
        assertTrue("Fehler beim berechnen von 80,000" , eks.berechne(80000)  == 19000);
        assertTrue("Fehler beim berechnen von 100,000", eks.berechne(100000) == 26000);
        assertTrue("Fehler beim berechnen von 120,000", eks.berechne(120000) == 33000);
    }
    

}

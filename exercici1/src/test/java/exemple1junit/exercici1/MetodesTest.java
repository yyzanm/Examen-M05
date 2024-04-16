/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exemple1junit.exercici1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jimen
 */
public class MetodesTest {
    
    public MetodesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of introduirEuros method, of class Metodes.
     */
    @Test
    public void testIntroduirEuros() {
        System.out.println("introduirEuros");
        double expResult = 0.0;
        double result = Metodes.introduirEuros();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introduirMoneda method, of class Metodes.
     */
    @Test
    public void testIntroduirMoneda() {
        System.out.println("introduirMoneda");
        String expResult = "";
        String result = Metodes.introduirMoneda();
        assertEquals(expResult, result, "dolars");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canviarMoneda method, of class Metodes.
     */
    @Test
    public void testCanviarMoneda() {
        System.out.println("canviarMoneda");
        String moneda = "dolars";
        double euros = 0.0;
        double expResult = 0.0;
        double result = Metodes.canviarMoneda(moneda, euros);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Metodes.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        double canvi = 0.0;
        Metodes.imprimir(canvi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

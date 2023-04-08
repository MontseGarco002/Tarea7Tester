/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tarea7.tiendacamisas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MONTSE GARCIA
 */
public class NombresCamisasTest {
    
    public NombresCamisasTest() {
    }

    @Test
    public void testValues() {
        System.out.println("values");
        NombresCamisas[] expResult = null;
        NombresCamisas[] result = NombresCamisas.values();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        NombresCamisas expResult = null;
        NombresCamisas result = NombresCamisas.valueOf(string);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecios() {
        System.out.println("getPrecios");
        NombresCamisas instance = null;
        int expResult = 0;
        int result = instance.getPrecios();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

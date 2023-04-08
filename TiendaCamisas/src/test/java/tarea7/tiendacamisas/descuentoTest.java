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
public class descuentoTest {
    
    public descuentoTest() {
    }

    @Test
    public void testObtenerDescuento() {
        System.out.println("obtenerDescuento");
        int cantidad =0 ;
        descuento instance = new descuento();
        double expResult = 0.0;
        double result = instance.obtenerDescuento(cantidad);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        descuento instance = new descuento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

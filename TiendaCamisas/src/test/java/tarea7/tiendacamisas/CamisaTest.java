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
public class CamisaTest {
    
    public CamisaTest() {
    }

    @Test
    public void testObtenerTipo() {
        System.out.println("obtenerTipo");
        Camisa instance = null;
        instance.obtenerTipo();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Camisa instance = null;
        instance.calcular();
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Camisa instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Camisa instance = null;
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecioFinal() {
        System.out.println("getPrecioFinal");
        Camisa instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioFinal();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Camisa instance = null;
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Camisa instance = null;
        instance.setCantidad(cantidad);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecioFinal() {
        System.out.println("setPrecioFinal");
        int precioFinal = 0;
        Camisa instance = null;
        instance.setPrecioFinal(precioFinal);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Camisa instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMostrarProducto() {
        System.out.println("mostrarProducto");
        Camisa instance = null;
        String expResult = "";
        String result = instance.mostrarProducto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

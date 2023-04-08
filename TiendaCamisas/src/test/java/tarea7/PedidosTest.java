/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tarea7;

import org.junit.Test;
import static org.junit.Assert.*;
import tarea7.tiendacamisas.Camisa;

/**
 *
 * @author MONTSE GARCIA
 */
public class PedidosTest {
    
    public PedidosTest() {
    }

    @org.junit.Test
    public void testAgregarCamisas() {
        System.out.println("agregarCamisas");
        Camisa camisas = null;
        Pedidos instance = new Pedidos();
        instance.agregarCamisas(camisas);
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testMostrarPedido() {
        System.out.println("mostrarPedido");
        Pedidos instance = new Pedidos();
        instance.mostrarPedido();
        fail("The test case is a prototype.");
    }
    
}

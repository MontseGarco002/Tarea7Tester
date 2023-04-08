package tarea7;

import tarea7.tiendacamisas.Camisa;

public class Pedidos {
    private static int idPedido;
    private Camisa camisas[];
    private static int contadorPedidos;
    private int contadorCamisas;
    private final static int MAX_CAMISAS = 10;

    int[] n = new int[3];

    public Pedidos() {
        Camisa.CONTADOR_CAMISAS = 0;
        Camisa.precio = 0;
        Pedidos.idPedido = ++Pedidos.contadorPedidos;
        this.camisas = new Camisa[Pedidos.MAX_CAMISAS];
    }

    public void agregarCamisas(Camisa camisas) {
        //Limita los pedidos a 10 camisas
        if(this.contadorCamisas < Pedidos.MAX_CAMISAS) {
            this.camisas[this.contadorCamisas++] = camisas;
            // this.camisas[this.contadorCamisas] = camisas;
            // this.contadorCamisas++;
        } else {
            System.out.println("Sobrepasó el límite (10)");
        }
    }

    public void mostrarPedido() {
        System.out.println("Numero de orden: " +Pedidos.idPedido);
        System.out.println("Los productos son: ");
        for(int i = 0; i < this.contadorCamisas; i++) {
            System.out.println(this.camisas[i].getDescripcion());
            if(this.camisas[i+1] == null) {
                if(this.camisas[i] != null) {
                    System.out.println(this.camisas[i].mostrarProducto());
                }
            }
        }
    }
}

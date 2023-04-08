package tarea7.tiendacamisas;
/**
 *
 * @author MONTSE GARCIA
 */
public class descuento{
    private double descuento;
    private String imprimirDescuento;
    
    public double obtenerDescuento(int cantidad) {
        if(cantidad <= 2) {
            this.imprimirDescuento = "0%";
            return this.descuento = 1;
        } else if(cantidad >= 3 && cantidad <= 5) {
            this.imprimirDescuento = "5%";
            return this.descuento = 0.95;
        } else {
            this.imprimirDescuento = "8%";
            return this.descuento = 0.92;
        }
    }

    @Override
    public String toString() {
        return "El descuento es de: " +this.imprimirDescuento +"\n\n";
    }
}
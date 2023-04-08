package tarea7.tiendacamisas;

/**
 *
 * @author MONTSE GARCIA
 */
public class Camisa extends descuento{
    //Protected: Public para las clases hijas; Private para las demás clases
    private int id;
    private int cantidad;
    private String descripcion;
    private double desc;
    private double precioFinal;
    // static relaciona la variable con la clase y no con el objeto
    public static double precio = 0; 
    public static int CONTADOR_CAMISAS = 0;

    //Constructor
    public Camisa(int id, int cantidad) { 
        //super(); manda a llamar el constructor de la clase object
        // this(); manda a llamar al primer constructor
        this.id = id;
        this.cantidad = cantidad;
        obtenerTipo();
    }

    public void obtenerTipo() {
        if(this.id==1||this.id==2||this.id==3){
            if (this.id==1){
                this.descripcion="Camisa Manga Corta";
                Camisa.precio += NombresCamisas.mangaCorta.getPrecios()*this.cantidad;
            }else if(this.id==2){
                this.descripcion = "Camisa Casual Manga Larga";
                Camisa.precio += NombresCamisas.casualMangaLarga.getPrecios()*this.cantidad;
            }else if (this.id==3){
                this.descripcion="Camisa Formal Manga Larga";
                Camisa.precio += NombresCamisas.formalMangaLarga.getPrecios()*this.cantidad;
            }
            //Guarda el número de camisas que metamos en cada objeto asociado al pedido
            Camisa.CONTADOR_CAMISAS += this.cantidad;
        }else{
            System.out.println("ID no identificado: " + this.id);
        }
    }

    public void calcular() {
        this.desc = obtenerDescuento(Camisa.CONTADOR_CAMISAS);
        this.precioFinal = Camisa.precio * this.desc;
    }

    public int getId() {
        return id;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getDescripcion() {
        return this.descripcion +" cantidad[" +this.cantidad +"]";
    }

    public String mostrarProducto() {
        calcular();
        return "El total de los productos es de: $" +this.precioFinal 
        +"\n" +super.toString();
    }
}
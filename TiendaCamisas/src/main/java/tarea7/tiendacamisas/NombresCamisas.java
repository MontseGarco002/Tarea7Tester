package tarea7.tiendacamisas;

/**
 *
 * @author MONTSE GARCIA
 */
public enum NombresCamisas {
    mangaCorta(190), 
    casualMangaLarga(230),
    formalMangaLarga(310);
    
   private final int precios;
   
   NombresCamisas(int precios){
       this.precios= precios;
   }
   
   public int getPrecios(){
        return this.precios;
    }
   
}

package Eje1;

/**
 * Clase que calcula en total pagado por un socio, y el total impagado.
 * 
 * @author Soufiane
 * @version 1.0
 * @since 10/03/2022
 * 
 */

public class Socio {
    
    /**Valores numericos:
     * El numero del socio,
     * Los meses de antiguedad,
     * Los meses impagados.
     */
    private int numSocio, mesesAntiguedad, mesesImpagados;
    
    /**
     * Valor numerico final statico de la cuota mensual
     */
    private static final int CUOTA = 200;
    
    
    
    //ZONA DE CONSTRUCTORES
    
    /**
     * Constructor por parametros para dar los valores necesarios a los attributos
     * 
     * @param numSocio
     * @param mesesAntiguedad
     * @param mesesImpagados 
     */
    public Socio(int numSocio, int mesesAntiguedad, int mesesImpagados){
        this.numSocio = numSocio;
        this.mesesAntiguedad = mesesAntiguedad;
        this.mesesImpagados = mesesImpagados;
    }//Cierre del constructor
    
    
    //GETTERS
    /**
     * Devuelve el numero del socio
     * 
     * @return el numero del socio
     */
    public int getNumSocio(){
        return numSocio;
    }
    
    /**
     * Devuelve los meses de antiguedad
     * 
     * @return los meses de antiguedad
     */
    public int getMesesAntiguedad(){
        return mesesAntiguedad;
    }
    
    /**
     * Devuelve los meses impagados
     * 
     * @return los meses impagados
     */
   public int getMesesImpagados(){
       return mesesImpagados;
   }
    
   //Setters
   /**
    * Ajustar el numero del socio
    * @param numSocio
    */
   public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
   
   /**
    * Ajustar los meses de antiguedad
    * @param mesesAntiguedad 
    */
    public void setMesesAntiguedad(int mesesAntiguedad) {
        this.mesesAntiguedad = mesesAntiguedad;
    }
    
    
    /**
     * Ajustar los meses impagados
     * @param mesesImpagados 
     */
    public void setMesesImpagados(int mesesImpagados) {
        this.mesesImpagados = mesesImpagados;
    }
    
    
    
    //ZONA DE METODOS
    
    /**
     * Devuelve cuanto debe el socio, multiplicando 
     * los meses impagados por la CUOTA mensual.
     * 
     * @return cuanto debe el socio
     */
    public int debe() {
        
        int deber;
        deber = CUOTA*this.mesesImpagados;
        return deber;
    }//Cierre del metodo debe()
    
    
    /**
     * Devuelve el total lo que ha pagado el socio,
     * multiplicando los meses de antiguedad por la CUOTA mensual.
     * 
     * @return el total pagado por el socio
    */
    public int pagado() {
        int pagado;
        
        pagado = CUOTA*mesesAntiguedad;
        
        return pagado;
    }//Cierre del metodo pagado()
    
}//Cierre del clase Socio{}
    

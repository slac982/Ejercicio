package Eje1;

/**
 * Clase que prueba la clase Socio
 * @see Socio
 * 
 * @author Soufiane
 * @version 1.0
 * @since 10/03/2022
 */

public class TestSocio {

    
    public static void main(String[] args) {
        
        
        /**
         * Crear todos lo socios necesarios
         */
        
        Socio socio1 = new Socio (100, 10, 2);  
        Socio socio2 = new Socio(101, 3, 0);
        Socio socio3 = new Socio(102, 23, 4);
        Socio socio4 = new Socio(103, 12, 1);
        
        /**
         * Valor numerico para calcular el numero de socios creados
         */
        int num=0;
        
        //
         System.out.println("cuanto debe el socio 1 : " +socio1.debe() + "\nha pagado : "+socio1.pagado());
         num++;
         System.out.println("cuanto debe el Socio 2  "+socio2.debe()+"\nha pagado: "+socio2.pagado());
         num++;
         System.out.println("cuanto debe el Socio 3  "+socio3.debe()+"\nha pagado: "+socio3.pagado());
         num++;
         System.out.println("cuanto debe el Socio 4  "+socio4.debe()+"\nha pagado: "+socio4.pagado());
         num++;
       
         //Imprimir el numero de socios
         System.out.println("Numero de socios : "+num);
     } 
    }
    


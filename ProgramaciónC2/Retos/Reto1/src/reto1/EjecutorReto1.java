/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author naral
 */
public class EjecutorReto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cuando se trabaja con fechas se instancia la clase Date
        Date inst_fecha_actual = new Date();
        //Modificamos el formato largo de la fecha utilizando la clase SimpleDateFormat
        SimpleDateFormat inst_cambiar_formato = new SimpleDateFormat("dd/MM/yyyy");
        //1. Instanciar la clase persona 
        PersonClass inst_persona = new PersonClass();
        //2. Mediante la instancia accedemos a las funciones o métodos de la clase
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package measure_converter;

import unit.Kelvin;

/**
 *
 * @author invitado
 */
public class MEASURE_CONVERTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kelvin amlo = new Kelvin(280.15); 
        System.out.println(amlo.convCelsius());
        System.out.println(amlo.convFahrenheit());
    }
    
}

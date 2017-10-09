/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // x=primer numero. 
       // y=segundo numero.
       int x, y, suma, resta, producto,division;
       x=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
       y=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
       suma=x+y;
       resta=x-y;
       producto=x*y;
       division=x/y;
       System.out.println("La suma es igual a "+suma);
       System.out.println("La resta es igual a "+resta);
       System.out.println("El producto es igual a "+producto);
       System.out.println("La division es igual a "+division);
    }
    
}

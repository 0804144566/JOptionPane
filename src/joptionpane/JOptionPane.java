/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;

/**
 *
 * @author paul2
 */

import javax.swing.JOptionPane;
import java.util.Arrays;

public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    // Diseña un programa que permite ingresar cinco números por ventanas emergentes (JOptionPane) y los imprime de forma ordenada de menor a mayor.
    
    public static void main(String[] args) {
        // TODO code application logic here
    
           int[ ] numeros = new int[5];
// creamos un ciclo for para ingresar los numeros 
        for (int i = 0; i < 5; i++) {
          //pedimos al usuario que ingrese los numeros 
            String input = JOptionPane.showInputDialog (" \nBienvenidos vamos a ordenar numeros de Menor a Mayor\n \nIngrese el número por favor " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
            
        }
        // ordenamos los numeros de menor a mayor
        Arrays.sort(numeros);
        // creamos un ciclo for para imprimir los numeros ordenados 
        StringBuilder mensaje = new StringBuilder("\nAhora te mostrare los números ordenados de menor a mayor que son:\n ");
        for (int i = 0; i < numeros.length; i++) {
            mensaje.append(numeros[i]);
            if (i < numeros.length - 1) {
                mensaje.append(", ");
    }
}
    
    // mostramos el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
} // fin del programa
package com.josh.tarea1;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class Calculator {

    public static void main(String[] args) {
        
        String initDialog = "Bienvenido a la calculadoraDeJava-Inador\n\n";
               initDialog = initDialog.concat("Esta calculadora es capaz de realizar operaciones como\n");
               initDialog = initDialog.concat("sumar, restar, multiplicar y dividir.\n\n");
               
        JOptionPane.showMessageDialog(null, initDialog);
    }
}

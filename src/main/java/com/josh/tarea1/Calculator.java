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
          
        String rulesDialog = "reglas para evitar errores";
        
        JOptionPane.showMessageDialog(null, rulesDialog);
        
        int num1 = 2, num2 = 4;
        
        CalcEngine numbers = new CalcEngine(num1, num2);
        
        JOptionPane.showMessageDialog(null, numbers.multiplyNumbers()); //test
        //JOptionPane.showMessageDialog(null, "El numero 1 debe ser diferente de '0'");
    }
}

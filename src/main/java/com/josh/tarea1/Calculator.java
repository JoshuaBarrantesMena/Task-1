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
               
        String rulesDialog = "reglas para evitar errores";
               
        JOptionPane.showMessageDialog(null, initDialog);
        JOptionPane.showMessageDialog(null, rulesDialog);
        
        int num1, num2, option;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        CalcEngine numbers = new CalcEngine(num1, num2);
        
        String[] options = {"Cambiar Numeros", "Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
        
        boolean calcCycle = true;
        
        while(calcCycle){
            
            option = JOptionPane.showOptionDialog(null,"Que desea hacer?", "Escojer opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null , options, options[0]);
        
            switch(option){
                case (0) -> {
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    numbers.resetNumbers(num1, num2);
                }
                case (1) -> {
                    JOptionPane.showMessageDialog(null, numbers.addNumbers());
               
                }
                case (2) -> {
                    JOptionPane.showMessageDialog(null, numbers.substractNumbers());
                }
                case (3) -> {
                    JOptionPane.showMessageDialog(null, numbers.multiplyNumbers());
                }
                case (4) -> {
                    if (num1 != 0){
                        JOptionPane.showMessageDialog(null, numbers.splitNumbers());
                    }else{
                        JOptionPane.showMessageDialog(null, "El primer numero debe ser diferente de '0'");
                    }
                }
                case (5) -> {
                    calcCycle = false;
                }
            }
        }
    }
}

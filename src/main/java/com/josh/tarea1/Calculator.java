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
               initDialog = initDialog.concat("sumar, restar, multiplicar y dividir.\n");
               
        String rulesDialog = "reglas para evitar errores\n\n";
               rulesDialog = rulesDialog.concat("1. Evite colocar un valor que no sea un numero\n");
               rulesDialog = rulesDialog.concat("2. El numero '0' no se puede dividir entre ningun numero, evite usarlo como primer valor\n");
               rulesDialog = rulesDialog.concat("3. Abstenerse de colocar valores separados por espacios\n");
               rulesDialog = rulesDialog.concat("4. Para colocar decimales, separe el valor entero del decimal con un punto '.'\n");
               
        JOptionPane.showMessageDialog(null, initDialog);
        JOptionPane.showMessageDialog(null, rulesDialog);
        
        float num1, num2;
        int option;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        CalcEngine numbers = new CalcEngine(num1, num2);
        
        String[] options = {"Cambiar Numeros", "Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
        
        boolean calcCycle = true;
        
        while(calcCycle){
            
            option = JOptionPane.showOptionDialog(null,"Que desea hacer?", "Escojer opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null , options, options[0]);
        
            switch(option){
                case (0) -> {
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                    numbers.resetNumbers(num1, num2);
                }
                case (1) -> {
                    JOptionPane.showMessageDialog(null, num1 + " + " + num2 + "  =  " + numbers.addNumbers());
               
                }
                case (2) -> {
                    JOptionPane.showMessageDialog(null, num1 + " - " + num2 + "  =  " + numbers.substractNumbers());
                }
                case (3) -> {
                    JOptionPane.showMessageDialog(null, num1 + " x " + num2 + "  =  " + numbers.multiplyNumbers());
                }
                case (4) -> {
                    if (num1 != 0){
                        JOptionPane.showMessageDialog(null, num1 + " ÷ " + num2 + "  =  " + numbers.splitNumbers());
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

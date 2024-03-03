package com.josh.tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class CalcEngine {
    private float num1;
    private float num2;
    
    public CalcEngine(float pNum1, float pNum2){
        this.num1 = pNum1;
        this.num2 = pNum2;
    }
    
    public void resetNumbers(float pNum1, float pNum2){
        this.num1 = pNum1;
        this.num2 = pNum2;
    }
    
    public float addNumbers(){
        return (this.num1 + this.num2);
    }
    
    public float substractNumbers(){
        return (this.num1 - this.num2);
    }
    
    public float multiplyNumbers(){
        return (this.num1 * this.num2);
    }
    
    public float splitNumbers(){
        return (this.num1 / this.num2);
    }
}

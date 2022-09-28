
package test;

import java.util.Scanner;


public class operaciones {
    public static Scanner ent = new Scanner (System.in);
    public float num1;
    public float num2;

    public operaciones() {
        
    }

    
    public operaciones(float num1, float num2) {
        System.out.print("\nIngrese un número: ");
        this.num1 = ent.nextFloat();
        System.out.print("\nIngrese otro número: ");
        this.num2 = ent.nextFloat();
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float suma(){
       
        return (float) (num1+num2);   
    }
    
    public float resta(){
       
        return (float) (num1-num2);   
    }
    public float multiplicacion(){
       
        return (float) (num1*num2);   
    }
    public float division(){
       
        return (float) (num1/num2);   
    }  

    @Override
    public String toString() {
        return "operaciones{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}

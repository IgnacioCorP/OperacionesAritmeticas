/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import java.util.Scanner;
import test.operaciones;
import static test.operaciones.ent;

/*
Llamar metodos de otra clase que haga las operaciones matematicas.
Operaciones
 - Suma 
 - resta
 - Multiplicacion
 - Division

 */
public class Aritmetica {
       public static Scanner ent = new Scanner (System.in);
 
    public static void main(String[] args) {
        operaciones o2 = new operaciones(); 
        operaciones o = new operaciones(o2.getNum1(),o2.num2); 
       
        System.out.print("\nSuma: ");
        System.out.print(o.suma());
        System.out.print("\nResta: ");
        System.out.print(o.resta());
        System.out.print("\nMultiplicación: ");
        System.out.print(o.multiplicacion());
        System.out.print("\nDivisión: ");
        System.out.println(o.division());
        
    }
    
}

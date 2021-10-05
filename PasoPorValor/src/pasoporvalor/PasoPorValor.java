/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author Alumno Mañana
 */
public class PasoPorValor {

    
    public static void main(String[] args) {
        
        
       var a = 10;
       
        System.out.println("a = " + a);
        cambiarValor(a);
         System.out.println("fin");
    }
    
     public static  void cambiarValor(int arg1) {
    
     System.out.println("a = " + arg1);
    
      arg1 = 15;
       System.out.println("a = " + arg1);
}  
}

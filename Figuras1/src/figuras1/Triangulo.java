/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras1;

/**
 *
 * @author ipampillonvieitez
 */
public class Triangulo {
     public Triangulo(){
        
    }
    public void Triangulo(){
        int max=20;
        int base=0,altura=0;
 
        for(base=1;base<=max;base=base+1)
        {
           
            for(altura=0;altura<base;altura++)
            {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}

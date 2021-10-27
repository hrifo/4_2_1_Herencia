/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._2_1_herencia;


public class Pez extends Animal{

    
    @Override
    public void mover(String nadar) {
        System.out.println(nadar);
    }

    
    @Override
    public void comer() {
        System.out.println("Peces mas pequeños o algas");
    }

    @Override
    public void dormir() {
        System.out.println("Con los ojos abiertos");
    }

    public Pez(String atributo) {
        super(atributo);
    }


    
}

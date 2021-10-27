/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._2_1_herencia;

public class Reptil extends Animal {

    public Reptil(String atributo) {
        super(atributo);
    }

    @Override
    public void mover(String movimiento) {
        System.out.println("Repta");
    }

    @Override
    public void comer() {
        System.out.println("Come insectos o huevos");

    }

    @Override
    public void dormir() {
        System.out.println("Invernacion");
    }

}

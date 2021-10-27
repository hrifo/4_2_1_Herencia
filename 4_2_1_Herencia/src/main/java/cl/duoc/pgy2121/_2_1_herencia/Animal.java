/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121._2_1_herencia;

/**
 *
 * @author Cetecom
 */
public abstract class Animal {
    public String atributo;
    public abstract void mover(String movimiento);
    public abstract void comer();
    public abstract void dormir();

    public Animal(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    
    
}

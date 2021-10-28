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
public abstract class Animal implements TiendaInterfaz{
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

    @Override
    public void porPagar() {
        System.out.println("Pagadidisisimo");
    }

    @Override
    public void porDevolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}

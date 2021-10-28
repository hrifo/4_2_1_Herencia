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
public class NewHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            pecesito pez_chico = new pecesito("Nadar");
            Reptil reptil = new Reptil("Repta");
            pez_chico.setAtributo("Nadando");
            
            System.out.println("Que hace el pez?:"+pez_chico.getAtributo());
            System.out.println("El animal se encuentra: ");
            //pez_chico.porPagar();
            reptil.porPagar();
    }
    
}

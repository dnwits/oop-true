/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class D1_main {
    public static void main(String[] args) {
        //crear objetos
        D1_punto punt1 = new D1_punto(5,0);
        D1_punto punt2 = new D1_punto(10,5);
        D1_punto punt3 = new D1_punto(-3,7);
        //imprimirlos
        System.out.println("Valors inicials");
        punt1.imprimeix();
        punt2.imprimeix();
        punt3.imprimeix();
        //metodo desplazar
        punt1.desplacar(3, 5);
        punt2.desplacar(7, -2);
        punt3.desplacar(13, -5);
        //imprimirlos para comprobar
        System.out.println("Valors al desplaçar");
        punt1.imprimeix();
        punt2.imprimeix();
        punt3.imprimeix();
        //usar metodo de desplazamiento
        System.out.println("resultado desplaçament");
        System.out.println("La distància entre P1 i P2 és " + punt1.distancia(punt2));
    }
}

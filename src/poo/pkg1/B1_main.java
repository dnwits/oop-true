/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class B1_main {
    public static void main(String[] args) {
        //creamos los objetos llamando al constructor con los dos parametros que hemos asignado en B1_punto
        B1_punto punt1 = new B1_punto(5,0);
        B1_punto punt2 = new B1_punto(10,10);
        B1_punto punt3 = new B1_punto(-3,7);
        //printar los puntos
        System.out.println("Coordenades del punt 1 són ("+punt1.x+","+punt1.y+")");
        System.out.println("Coordenades del punt 2 són ("+punt2.x+","+punt2.y+")");
        System.out.println("Coordenades del punt 3 són ("+punt3.x+","+punt3.y+")");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class C1_main {
    public static void main(String[] args) {
        C1_punto punt1 = new C1_punto(5,0);
        C1_punto punt2 = new C1_punto(10,10);
        C1_punto punt3 = new C1_punto(-3,7);
        //printar los puntos
        System.out.println("Coordenades del punt 1 són ("+punt1.getX()+","+punt1.getY()+")");
        System.out.println("Coordenades del punt 2 són ("+punt2.getX()+","+punt2.getY()+")");
        System.out.println("Coordenades del punt 3 són ("+punt3.getX()+","+punt3.getY()+")");
        
       //asignar nuevos valores
       punt1.setX(6);
       punt1.setY(punt1.getY()+3);
       punt2.setX(7);
       punt2.setY(punt2.getY()+3);
       punt3.setX(3);
       punt3.setY(punt3.getY()+3);
       System.out.println("Coordenades del punt 1 són ("+punt1.getX()+","+punt1.getY()+")");
       System.out.println("Coordenades del punt 2 són ("+punt2.getX()+","+punt2.getY()+")");
       System.out.println("Coordenades del punt 3 són ("+punt3.getX()+","+punt3.getY()+")");
    }
}

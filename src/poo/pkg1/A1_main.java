/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 * instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3,7). Muestra por pantalla sus coordenadas 
 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba distintos operadores 
 * como = + - += *=...) y vuelve a imprimirlas por pantalla.
 * @author ves8167
 */
public class A1_main {
    public static void main(String[] args) {
        //crear los objetos
        A1_punto punt1 = new A1_punto();
        A1_punto punt2 = new A1_punto();
        A1_punto punt3 = new A1_punto();
        //asignarle valores
        punt1.x = 5;
        punt1.y = 0;
        
        punt2.x = 10;
        punt2.y = 10;
        
        punt3.x = -3;
        punt3.y = 7;
        //printarlos primer cop
        System.out.println("Coordenades del punt 1 són ("+punt1.x+","+punt1.y+")");
        System.out.println("Coordenades del punt 2 són ("+punt2.x+","+punt2.y+")");
        System.out.println("Coordenades del punt 3 són ("+punt3.x+","+punt3.y+")");
        
       //modificar las coordenades
        punt1.x+=5;
        punt1.y=+8;
        
        punt2.x/=2;
        punt2.y-=3;
        
        punt3.x*=5;
        punt3.y/=2;
        //printarlo segon cop
        System.out.println("Coordenades del punt 1 són ("+punt1.x+","+punt1.y+")");
        System.out.println("Coordenades del punt 2 són ("+punt2.x+","+punt2.y+")");
        System.out.println("Coordenades del punt 3 són ("+punt3.x+","+punt3.y+")");
    }
}

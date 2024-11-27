/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class E1_main {
    public static void main(String[] args) {
        E1_punto p1 = new E1_punto(5, 0);
        E1_punto p2 = new E1_punto(10, 10);
        E1_punto p3 = new E1_punto(-3, 7);

        // Imprimimos las coordenadas de los tres puntos        
        p1.imprimeix();
        p2.imprimeix();
        p3.imprimeix();
        System.out.println();

        // Modificamos las coordenadas de los tres puntos
        p1.setX(p1.getX() + 3);
        p1.setY(6);
        p2.setX(p2.getX() / 2);
        p2.setY(p2.getY() * 2);
        p3.setX(p3.getX() - 5);
        p3.setY(p3.getY() % 2);

        // Imprimimos las coordenadas de los tres puntos        
        p1.imprimeix();
        p2.imprimeix();
        p3.imprimeix();
        System.out.println();
        
        // Imprimimos distancia entre puntos
        System.out.println("La distancia entre P1 y P2 es " + p1.distancia(p2));
        System.out.println("La distancia entre P2 y P3 es " + p2.distancia(p3));
        System.out.println("La distancia entre P3 y P1 es " + p3.distancia(p1));
        System.out.println();
        
        // Desplazamos p1 y p2. Los imprimimos
        p1.desplacar(-1, -1);
        System.out.print("P1 tras desplazarlo -1,-1: ");
        p1.imprimeix();
        p2.desplacar(10, 10);
        System.out.print("P2 tras desplazarlo 10,10: ");
        p2.imprimeix();
        System.out.println();

        // Creamos 20 puntos aleatorios y los imprimimos por pantalla
        E1_punto puntos[] = new E1_punto[20];
        for (int i = 0; i < 5; i++) {
            puntos[i] = E1_punto.creaPuntoAleatorio();
            System.out.print("Punto aleatorio " + i + ": ");
            puntos[i].imprimeix();
        }
    }
}

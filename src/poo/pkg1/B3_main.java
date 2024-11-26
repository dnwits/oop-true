/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class B3_main {
    public static void main(String[] args) {
        B3_rectangle rec1 = new B3_rectangle(0, 0, 5, 5);
        B3_rectangle rec2 = new B3_rectangle(7, 9, 2, 3);

        System.out.println("Coordenadas del rectángulo 1 (" + rec1.x1 + "," + rec1.y1 + ") y (" + rec1.x2 + "," + rec1.y2 + ")");
        System.out.println("Coordenadas del rectángulo 2 (" + rec2.x1 + "," + rec2.y1 + ") y (" + rec2.x2 + "," + rec2.y2 + ")");
        System.out.println("El perímetro del rectángulo 1 es: " + perimetro(rec1));
        System.out.println("El perímetro del rectángulo 2 es: " + perimetro(rec2));
        System.out.println("El área del rectángulo 1 es: " + area(rec1));
        System.out.println("El área del rectángulo 2 es: " + area(rec2));
        System.out.println("");

    }

    public static double perimetro(B3_rectangle rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return (lado1 + lado2) * 2;
    }

    public static double area(B3_rectangle rect) {
        int lado1 = Math.abs(rect.x1 - rect.x2);
        int lado2 = Math.abs(rect.y1 - rect.y2);

        return lado1 * lado2;
    }
}

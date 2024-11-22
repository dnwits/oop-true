/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class A3_main {
    public static void main(String[] args) {
        A3_rectangle r1 = new A3_rectangle();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        A3_rectangle r2 = new A3_rectangle();
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        System.out.println("coordenadas de rectangle1: "+"("+r1.x1+","+r1.y1+")"+"("+r1.x2+","+r1.y2+")");
        System.out.println("coordenadas de rectangle2: "+"("+r2.x1+","+r2.y1+")"+"("+r2.x2+","+r2.y2+")");
        //A partir de aquí mal, pero hay que solucionarlo :T
        System.out.println("El perimetre de rectangle1 és "+((r1.x1+r1.x2)+(r1.y1+r1.y2)));
        System.out.println("La seva àrea és de "+r1.x1);
    }
}

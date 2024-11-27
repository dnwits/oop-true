/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

import static java.lang.Math.abs;
import static java.lang.Math.min;
import java.util.Random;

/**
 *
 * @author ves8167
 */
public class E3_rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private final static int max = 100;
    private final static int min = 0;

    public E3_rectangle(int x1, int y1, int x2, int y2) {
        // Comprobamos si es un rectángulo válido
        if ((x1 < x2) && (y1 < y2) && (x1 >= E3_rectangle.min && x1 <= E3_rectangle.max && y1 >= E3_rectangle.min && y1 <= E3_rectangle.max && x2 >= E3_rectangle.min && x2 <= E3_rectangle.max && y2 >= E3_rectangle.min && y2 <= E3_rectangle.max)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al intanciar el Rectángulo (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        if (x1 > this.x2) {
            System.err.println("ERROR el valor de x1 no puede ser mayor que el valor de x2");
        } else if (x1 < E3_rectangle.min || x1 > E3_rectangle.max) {
            System.err.println("ERROR el valor debe estar entre " + E3_rectangle.min + " y " + E3_rectangle.max);
        } else {
            this.x1 = x1;
        }
    }
    public void setY1(int y1) {
        if (y1 > this.x2) {
            System.err.println("ERROR el valor de x1 no puede ser mayor que el valor de y2");
        } else if (y1 < E3_rectangle.min || y1 > E3_rectangle.max) {
            System.err.println("ERROR el valor debe estar entre " + E3_rectangle.min + " y " + E3_rectangle.max);
        } else {
            this.y1 = y1;
        }
    }

    public void setX2(int x2) {
        if (x2 < this.x1) {
            System.err.println("ERROR el valor de x1 no puede ser menor que el valor de x1");
        } else if (x2 < E3_rectangle.min || x2 > E3_rectangle.max) {
            System.err.println("ERROR el valor debe estar entre " + E3_rectangle.min + " y " + E3_rectangle.max);
        } else {
            this.x2 = x2;
        }
    }

    public void setY2(int y2) {
        if (y2 < this.y1) {
            System.err.println("ERROR el valor de x1 no puede ser menor que el valor de y1");
        } else if (y2 < E3_rectangle.min || y2 > E3_rectangle.max) {
            System.err.println("ERROR el valor debe estar entre " + E3_rectangle.min + " y " + E3_rectangle.max);
        } else {
            this.y2 = y2;
        }
    }
    // Setter X1Y1
    public void setX1Y1(int x1, int y1){
        this.setX1(x1);
        this.setY1(y1);
    }

    // Setter X2Y2
    public void setX2Y2(int x2, int y2){
        this.setX2(x2);
        this.setY2(y2);
    }
    // Setter X1Y1 X2Y2 (todos)
    public void setAll(int x1, int y1, int x2, int y2) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }
    // Obtener el perimetro
    public int getPerimetro(){
        return abs(this.x1 - this.x2) * 2 + abs(this.y1 - this.y2) * 2;
    }
    // Obtener el area
    public int getArea(){
        return abs(this.x1 - this.x2) * abs(this.y1 - this.y2);
    }
    // imprime informacion rectangulo
    public void imprime(){
        System.out.println("Coordenadas: (" + this.x1 + "," + this.y1 + ")-(" + this.x2 + "," + this.y2 + ")");
        System.out.println("Perimetro: " + this.getPerimetro());
        System.out.println("Area: " + this.getArea());
    }
    public static E3_rectangle creaRectangleAleatori(){
        Random rndm = new Random();
        int a,b,c,d;
        a = rndm.nextInt(E3_rectangle.max);
        b = rndm.nextInt(E3_rectangle.max);
        c = min(100, a + rndm.nextInt(E3_rectangle.max));
        d = min (100, b + rndm.nextInt(E3_rectangle.max));
        E3_rectangle tmp = new E3_rectangle(a, b, c, d);
        return tmp;
    }
}
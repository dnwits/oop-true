/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class D3_main {
    public static void main(String[] args) {
        D3_rectangle rec1 = new D3_rectangle(0, 0, 5, 5);
        D3_rectangle rec2 = new D3_rectangle(7, 9, 2, 3);
        rec1.imprime();
        rec2.imprime();

        // Cambiamos valores e imprimimos
        rec1.setX1(10);
        rec1.setX2(3);
        rec2.setY1(12);
        rec2.setY2(5);
        rec1.imprime();
        rec2.imprime();

        // Cambiamos valores e imprimimos
        rec1.setX1Y1(2, 4);
        rec1.setX2Y2(10, 20);
        rec2.setAll(3, 4, 5, 6);
        rec1.imprime();
        rec2.imprime();
    }
}

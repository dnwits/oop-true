/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class A4_main {
    public static void main(String[] args) {
        A4_article a1 = new A4_article();
        a1.nombre = "Camisa de cuadros";
        a1.precio = 20;
        a1.iva = 21;
        a1.cuantosQuedan = 5;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");

        a1.precio = 10;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");
        System.out.println(a1);
    }
}

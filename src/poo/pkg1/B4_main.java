/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class B4_main {
    public static void main(String[] args) {
    B4_article a1 = new B4_article("Camisa de cuadros", 20, 21, 5);
    B4_article a2 = new B4_article("Pantalón pana", 100, 10, -5);
    
    System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");
    System.out.println(a2.nombre + " - Precio: " + a2.precio + "€ - IVA: " + a2.iva + "% - PVP: " + (a2.precio + (a2.precio * a2.iva / 100)) + "€");
    }
}

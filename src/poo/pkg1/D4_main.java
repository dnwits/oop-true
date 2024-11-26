/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class D4_main {
    public static void main(String[] args) {

        D4_article a1 = new D4_article("Camisa de cuadros", 20, 21, 5);
        D4_article a2 = new D4_article("Pantalón pana", 100, 21, 10);
        a1.imprimir();
        a2.imprimir();
        System.out.println("");

        a1.setNombre("Chaqueta de lana");
        a1.setPrecio(0);
        a1.setPrecio(30);
        a2.setIva(10);
        a2.setCuantosQuedan(-5);
        a2.setCuantosQuedan(0);
        a1.imprimir();
        a2.imprimir();
        System.out.println("");
        
        if (a1.vender(1000)) {
            System.out.println("He vendido mil!");
        } else {
            System.out.println("No he vendido mil, se cancela la venta por falta de stock");
        }
        
        if (a1.vender(2)) {
            System.out.println("He vendido 2!");
        } else {
            System.out.println("No he vendido 2, se cancela la venta por falta de stock");
        }
        
        System.out.println("Voy a almacenar 3 mas");
        if (a1.almacenar(3)) {
            System.out.println("He almacenado 3!");
        } else {
            System.out.println("No he almacenado 3, no hay sitio");
        }

        a1.imprimir();
        a2.imprimir();
    }
}

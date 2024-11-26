/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class C4_main {
    public static void main(String[] args) {

        C4_article a1 = new C4_article("Camisa de cuadros", 20, 21, 5);
        C4_article a2 = new C4_article("Pantalón pana", 100, 21, 10);

        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + "€ - IVA: " + a1.getIva() + "% - PVP: " + (a1.getPrecio() + (a1.getPrecio() * a1.getIva() / 100)) + "€");
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + "€ - IVA: " + a2.getIva() + "% - PVP: " + (a2.getPrecio() + (a2.getPrecio() * a2.getIva() / 100)) + "€");

        a1.setNombre("Chaqueta de lana");
        a1.setPrecio(0);
        a1.setPrecio(30);

        a2.setIva(10);
        a2.setCuantosQuedan(-5);
        a2.setCuantosQuedan(0);

        System.out.println(a1.getNombre() + " - Precio: " + a1.getPrecio() + "€ - IVA: " + a1.getIva() + "% - PVP: " + (a1.getPrecio() + (a1.getPrecio() * a1.getIva() / 100)) + "€");
        System.out.println(a2.getNombre() + " - Precio: " + a2.getPrecio() + "€ - IVA: " + a2.getIva() + "% - PVP: " + (a2.getPrecio() + (a2.getPrecio() * a2.getIva() / 100)) + "€");

    }
}

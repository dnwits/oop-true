/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

//import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class D2_main {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        D2_persona persona1 = new D2_persona("981276345K", "Ada", "Wilkerson", 26);
        persona1.imprime();
        persona1.setDNI("981234557M");
        System.out.println("con DNI corregido "+persona1.getDNI());
        System.out.println("La persona es mayor de edad? "+persona1.esMayorEdad());
        System.out.println("La persona está jubilada? "+persona1.esJubilado());
        D2_persona persona2 = new D2_persona("999999945K", "Lia", "Garcia", 21);
        persona2.imprime();
        System.out.println("Ls direcencia de edad entre "+persona1.getNombre()+" y "+persona2.getNombre()+" es de "+ persona1.diferenciaEdad(persona2.getEdad()));
    }
}

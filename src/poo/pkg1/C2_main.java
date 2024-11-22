/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class C2_main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        C2_persona persona1 = new C2_persona("981276345K", "Ada", "Wilkerson", 26);
        System.out.println("La persona se apellida "+persona1.getApellidos());
        System.out.println("La persona tiene "+persona1.getEdad()+ " años");
        System.out.println("La persona se llama "+persona1.getNombre());
        System.out.println("con DNI "+persona1.getDNI());
        persona1.setDNI("981234557M");
        System.out.println("con DNI corregido "+persona1.getDNI());
        
    }
}

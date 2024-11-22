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
public class A2_main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        A2_persona persona1 = new A2_persona();
        System.out.print("Introduzca su DNI: ");
        persona1.dni = entrada.nextLine();
        System.out.print("Introduzca su nombre: ");
        persona1.nombre = entrada.nextLine();
        System.out.print("Introduzca sus apellidos: ");
        persona1.apellido = entrada.nextLine();
        System.out.print("Introduzca su edad: ");
        persona1.edad = entrada.nextInt();
        System.out.println("");
        A2_persona persona2 = new A2_persona();
        System.out.print("Introduzca su DNI: ");
        persona2.dni = entrada.nextLine();
        System.out.print("Introduzca su nombre: ");
        persona2.nombre = entrada.nextLine();
        System.out.print("Introduzca sus apellidos: ");
        persona2.apellido = entrada.nextLine();
        System.out.print("Introduzca su edad: ");
        persona2.edad = entrada.nextInt();
        
        if (persona1.edad>=18){
            System.out.println(persona1.nombre +" " +persona1.apellido+" con DNI "+persona1.dni +" es mayor de edad");
        } else {
            System.out.println(persona1.nombre +" " +persona1.apellido+" con DNI "+persona1.dni +" es menor de edad");
        }
        
        if (persona2.edad>=18){
            System.out.println(persona2.nombre +" " +persona2.apellido+" con DNI "+persona2.dni +" es mayor de edad");
        } else {
            System.out.println(persona2.nombre +" " +persona2.apellido+" con DNI "+persona2.dni +" es menor de edad");
        }
        
    }
}

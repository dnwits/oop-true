/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class E2_main {
    public static void main(String[] args) {
        E2_persona persona1 = new E2_persona("18999548P", "José", "Serrano Márquez", 25);
        E2_persona persona2 = new E2_persona("91276345A", "Ada", "Wilkerson", 26);
        E2_persona persona3 = new E2_persona("2022234L", "María", "Carcelén Sánchez", 17);

        // Imprimimos p1 y p2
        /*persona1.imprime();
        persona2.imprime();
        System.out.println("");
        */
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println("");

        // Realizamos algunos cambios
        persona1.setNombre("Byul");
        persona1.setEdad(11);
        persona2.setNombre("Irene");
        persona2.setEdad(33);

        // Imprimimos p1 y p2
        /*persona1.imprime();
        persona2.imprime();
        System.out.println("");
        */
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        // Imprimomos diferencia de edad
        System.out.println("La diferencia de edad es " + persona1.diferenciaEdad(persona3));
        System.out.println("");
        
        //Validamos algunos DNIs
        System.out.println("DNI 12345678Z => " + ((E2_persona.validarDNI("12345678Z")) ? "Valido" : "No válido") );
        System.out.println("DNI 1234567Z  => " + ((E2_persona.validarDNI("1234567Z")) ? "Valido" : "No válido") );
        System.out.println("DNI 123456789 => " + ((E2_persona.validarDNI("123456789")) ? "Valido" : "No válido") );   
    }
}

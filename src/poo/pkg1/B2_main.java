/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class B2_main {
    public static void main(String[] args) {
       B2_persona persona1 = new B2_persona("871234567t", "Lia", "Wong", 30);
       if (persona1.edad>=18){
            System.out.println(persona1.nombre +" " +persona1.apellidos+" con DNI "+persona1.dni +" es mayor de edad");
        } else {
            System.out.println(persona1.nombre +" " +persona1.apellidos+" con DNI "+persona1.dni +" es menor de edad");
        }
    }
}

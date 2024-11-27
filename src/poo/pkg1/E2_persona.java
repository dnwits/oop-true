/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

import java.util.regex.Pattern;

/**
 *
 * @author ves8167
 */
public class E2_persona {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    static final int mayoriaEdat = 18;
    
    public E2_persona (String dni, String nombre, String apellidos, int edad){
        if (!validarDNI(dni)){ //validación
            System.err.println("DNI no valid...");
            dni = "00000000Z"; //valor por defecto
        }
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //GETTERS
    public String getDNI(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    
    //SETTERS
    /*public void setDNI(String dni){
        this.dni = dni;
    }*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    /*public void imprime(){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
    }*/
    public boolean esMayorEdad(){
        return this.edad >= E2_persona.mayoriaEdat;
    }
    public boolean esJubilado(){
        return this.edad >= 65;
    }
    public int diferenciaEdad(E2_persona p) {
        return this.edad - p.edad;
    }
    public static boolean validarDNI(String dni){
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(dniRegexp, dni);
    }
    @Override
    public String toString(){
        return "E2_Persona {" +
           "DNI='" + dni + "\'" +
           ", Nombre='" + nombre + "\'" +
           ", Apellidos='" + apellidos + "\'" +
           ", Edad=" + edad +
           '}';
    }
}

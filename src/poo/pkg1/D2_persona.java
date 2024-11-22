/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class D2_persona {
     private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    public D2_persona (String dni, String nombre, String apellidos, int edad){
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
    public void setDNI(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void imprime(){
        System.out.println("DNI: "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
    }
    public boolean esMayorEdad(){
        if (this.edad >=18){
            return true;
        } else {
            return false;
        }
    }
    public boolean esJubilado(){
        if (this.edad >=65){
            return true;
        } else {
            return false;
        }
    }
    public int diferenciaEdad(int D2_persona){
        return this.edad - D2_persona;
    }
}

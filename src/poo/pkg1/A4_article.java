/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author Val
 */
public class A4_article {
    String nombre;
    double precio;
    int iva;
    int cuantosQuedan;
    
    @Override
    public String toString(){
    return 
           "Articulo:"+"\n" 
            + "Nombre>> " + nombre + "\n"
            + "Preu>> "+ precio+"\n"
            + "IVA>> "+iva+"\n"
            +"Quantitat restant>> " + cuantosQuedan;
            //"Article{" +
           //"nom >>'" + nombre + "\'" +
           //"preu >>'" + precio + "\'" +
           //"IVA >>'" + iva + "\'" +
           //"Quantitat restant >>'" + cuantosQuedan + "\'" +
            //'}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class B3_rectangle {
    int x1;
    int y1;
    int x2;
    int y2;
    public B3_rectangle (int x1, int y1, int x2, int y2){
        if (x2<=x1 && y2<=x2){
            System.err.println("ERROR al instanciar Rectangulo...");
        }
    }
}

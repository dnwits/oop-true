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
        if ((x1 < x2) && (y1 < y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
        } else {
            System.err.println("ERROR al intanciar el Rectángulo (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }
    }
}

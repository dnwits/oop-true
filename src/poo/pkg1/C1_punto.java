/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

/**
 *
 * @author ves8167
 */
public class C1_punto {
    //ocultarlas para que en el main  utilicen los get
    private int x;
    private int y;
    
    public C1_punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    //GETTERS = RETURN
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //SETTERS = VOID
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
}

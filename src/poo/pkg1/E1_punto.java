/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pkg1;

import java.util.Random;

/**
 *
 * @author ves8167
 */
public class E1_punto {
    private int x;
    private int y;
    
    public E1_punto (int x, int y){
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
    public void imprimeix (){
        System.out.println("("+ this.x+","+this.y+")");
    }
    public void setXY(int a, int b){
        this.x = a;
        this.y = b;
    }
    public void desplacar(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
    public double distancia(E1_punto p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.x- p.y, 2));
    }
    public static E1_punto creaPuntoAleatorio(){
        Random rndm = new Random();
        E1_punto punto_nou = new E1_punto(-100 + rndm.nextInt(200), -100 + rndm.nextInt(200));
        return punto_nou;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author hp
 */
public class Circle extends Shapes {

    private double r;
    private int x,y;
    
    
    

    public Circle(double r, int x, int y, String color) {
        super(color);
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public Circle(double r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    
    
    @Override
    public double calArea() {
           
        return 3.14*r*r;    
       }
    
    @Override
    public String toString() {
        return "Redius: " + r + "\n(" + x + ", " + y + ")\nArea: " + calArea() +"\nColor: " + super.toString() ;
    }
}

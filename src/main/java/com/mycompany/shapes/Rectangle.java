/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author hp
 */
public class Rectangle extends Shapes{
    private double l,w;
    private String color;

    public Rectangle(int l, int w, String color) {
        this.color = color;
        this.l = l;
        this.w = w;
    }

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }
    
    @Override
    public double calArea(){
        return l*w;
    }

    @Override
    public String toString() {
        return "Length: " + l + "\nWidth: "+ w +"\nArea: " + calArea() + "\nColor: " + color;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author hp
 */
public class Triangle extends Shapes{
    private double base, height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.color = color;
    }
    
    @Override
    public double calArea(){
        return base*height*0.5;
    }

    @Override
    public String toString() {
        return "Base: " + base + "\nHeight: " + height + "\nArea: " + calArea() + "\nColor: " + super.toString();
    }
    
    
}

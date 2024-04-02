/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author hp
 */
public class Square extends Shapes {
    
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Side: "+ side + "\nArea: " + calArea() + "\nColor: " + super.toString();
    }
    
    
    
}

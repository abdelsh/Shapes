/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author hp
 */
public class AbstractClass  {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5,0,2, "Red");
        Rectangle rect = new Rectangle(5, 3, "Blue");
        Square sqr = new Square(5, "Yellow");
        Triangle tri = new Triangle(5,2,"Green");
        
        System.out.println(circle);
        System.out.println("-------");
        System.out.println(rect);
        System.out.println("-------");
        System.out.println(sqr);
        System.out.println("-------");
        System.out.println(tri);
    }
}

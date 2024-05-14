/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Triangle extends Shape {

    private double a, b, c;

    // contructor
    
    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    void printResult() {
        System.out.println("-------Triangle------");
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side A: " + c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

}

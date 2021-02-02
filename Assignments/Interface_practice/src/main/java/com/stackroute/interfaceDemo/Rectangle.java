package com.stackroute.interfaceDemo;

public class Rectangle implements shape {
    private double length,breadth;
    public Rectangle(){

    }

    public Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    @Override
    public double Area() {
        return length*breadth;
    }

    @Override
    public double Circumference() {
        return 2*(length+breadth);
    }
}

package com.stackroute.interfaceDemo;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = (Shape) new Rectangle(100, 10);
        System.out.println(shape.Area());
        System.out.println(shape.Area());
    }
}

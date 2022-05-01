package application;

import entities.Shape;
import enums.Color;
import entities.*;
import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Shape s1 = new Circle(Color.WHITE, 2.0);
        Shape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);
        System.out.println(s1.getColor());
        System.out.println(s2.getColor());

    }
}

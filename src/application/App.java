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
        System.out.println("Cor do Circle:" + s1.getColor());
        System.out.println("Cor do Circle:" + String.format("%.3f", s1.area()));
        System.out.println("Cor do Rectangle:" + s2.getColor());
        System.out.println("Cor do Rectangle:" + String.format("%.3f", s2.area()));

    }
}

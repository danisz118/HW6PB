package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        float a = 4;
        float b = 5;
        float c = 7;

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("возвращает true если треугольник с такими сторонами может существовать: "
                + triangle.isValid());
        System.out.println("площать треугольника: " + triangle.square());
        System.out.println("периметр треугольника: " + triangle.perimeter());
        System.out.println("_____________________________________________________");
        //toStr
        String str = triangle.toString();
        System.out.println("toStr: " + str);
        System.out.println("_____________________________________________________");
        //equals hashcode
        Triangle triangle1 = new Triangle(1, 2, 3);
        System.out.println("Работа \"equals hashcode\"  : " + triangle.equals(triangle1));
        System.out.println("_____________________________________________________");
        //Object create Reflection
        Triangle triangle2 = new Triangle(3, 5, 6);
        Class<? extends Triangle> aClass = triangle2.getClass();
        System.out.println(aClass.getName());
        //   System.out.println(Arrays.toString(aClass.getMethods()));

        System.out.println("_____________________________________________________");
        //Array Object
        Triangle[] triangle3 = new Triangle[1];
        triangle3[0] = new Triangle(10, 9, 8);
        System.out.println("Array Object isValid :" + triangle3[0].isValid());
        System.out.println("Array Object perimeter :" + triangle3[0].perimeter());
        System.out.println("Array Object square :" + triangle3[0].square());
        System.out.println("_____________________________________________________");
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("возвращает true если прямоугольник с такими сторонами может существовать: " + rectangle.isValid());
        System.out.println("площать прямоугольника: " + rectangle.square());
        System.out.println("периметр прямоугольника: " + rectangle.perimeter());
    }
}

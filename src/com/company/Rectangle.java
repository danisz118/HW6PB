package com.company;

import java.util.Objects;

public class Rectangle implements GeometricFigures {
    float a;
    float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean isValid() {
        return a > 0 || b > 0;
    }

    @Override
    public float square() {
        return a * b;
    }

    @Override
    public float perimeter() {
        return (a + b) * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.a, a) == 0 &&
                Float.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

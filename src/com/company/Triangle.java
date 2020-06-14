package com.company;

import java.util.Objects;

public class Triangle implements GeometricFigures {
    float a;
    float b;
    float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean isValid() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    @Override
    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public float perimeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(triangle.a, a) == 0 &&
                Float.compare(triangle.b, b) == 0 &&
                Float.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

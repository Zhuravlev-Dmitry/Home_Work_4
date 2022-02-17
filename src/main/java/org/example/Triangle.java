package org.example;

public class Triangle {

    public static double getSqrTriangle(int a, int b, int c) throws TriangleException {

        if (a <= 0 || b <= 0 || c <= 0 )throw new TriangleException("Один из параметров меньше или равен нулю!");
        if ( a + b <= c || a + c <= b || b + c <= a) throw new TriangleException("Сумма двух сторон меньше третей!");
        double p = (a + b + c)/2; // Вычисляем полупериметр
        double s = Math.sqrt(p * (p -a) * (p-b) * (p-c));// Вычисляем площядь треугольника
        return s;
    }
}

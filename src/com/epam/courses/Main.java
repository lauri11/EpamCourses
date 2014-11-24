package com.epam.courses;

import com.epam.courses.mathematics.Mathematics;
import com.epam.courses.triangle.Point;
import com.epam.courses.triangle.Triangle;

/**
 * Created by Lena on 11/22/2014.
 */
public class Main {
    public static void main(String [] args){
        //Fibonacci
        System.out.println(Mathematics.fibonacci(5));
        System.out.println(Mathematics.fibonacci(0));
        System.out.println(Mathematics.fibonacci(-5));

        //Minimum
        System.out.println(Mathematics.min1(1.3, -1, 1.4));
        System.out.println(Mathematics.min2(1.3, -1, 1.4));
        System.out.println(Mathematics.min3(1.3, -1, 1.4));

        //Random
        System.out.println(Mathematics.random(6, 5));

        //Round
        System.out.println(Mathematics.numRound(1.55678f));

        //segmentLength
        Point a = new Point(2, 2);
        Point b = new Point(7, 7);
        System.out.println(Mathematics.segmentLength(a, b));

        //
        Triangle triangle = new Triangle(new Point(1,1 ), new Point(2, 2), new Point(3,1));
        System.out.println(triangle.perimeter());
        System.out.println(triangle.square());

        Triangle triangle1 = new Triangle(new Point(1,3), new Point(2, -5), new Point(-8, 4));
        System.out.println(triangle1.square());

        Triangle triangle2 = new Triangle(new Point(1, 8), new Point(-2, -7), new Point(-4, -17));
        System.out.println(triangle2.square());
    }
}

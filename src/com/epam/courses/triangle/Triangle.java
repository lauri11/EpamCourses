package com.epam.courses.triangle;

import com.epam.courses.mathematics.Mathematics;

/**
 * Created by Lena on 11/23/2014.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double ab;
    private double bc;
    private double ac;

    public Triangle(Point point1, Point point2, Point point3){
        a = point1;
        b = point2;
        c = point3;

        int x1 = a.getX();
        int y1 = a.getY();
        int x2 = b.getX();
        int y2 = b.getY();
        int x3 = c.getX();
        int y3 = c.getY();


        ab = Mathematics.segmentLength(a,b);
        bc = Mathematics.segmentLength(b,c);
        ac = Mathematics.segmentLength(a,c);

        if((x1 - x3)*1.0/(x2 - x3) == (y1 - y3)*1.0/(y2 - y3) ||
                !(ab<bc + ac && bc<ab + bc && ac<ab + bc)){
            System.out.println("This is not a triangle!");
        }else {
            System.out.println("This is a triangle");
        }
    }

    public double perimeter(){
        double perimeter = ab + bc + ac;
        return perimeter;
    }

    public double square(){
        double p = perimeter()/2;
        double square = Math.sqrt(p*(p - ab)*(p - bc)*(p - ac));
        return square;
    }
}

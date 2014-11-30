package com.epam.courses.mathematics;

import com.epam.courses.triangle.Point;

/**
 * Created by Lena on 11/22/2014.
 */
public class Mathematics {
    public static int fibonacci(int n){
        if(n<0){
            System.out.println("Please, enter a positive number");
            return -1;
        }

        if(n==1) return 1;

        int fN = 0;
        int fN1 = 1;
        int fN2 = 0;

        for(int i = 2; i<=n; i++){
            fN = fN1 +fN2;
            fN2 = fN1;
            fN1 = fN;
        }
        return fN;
    }

    public static double min1(double num1, double num2, double num3){
        double min;

        double modNum1 = Math.abs(num1);
        double modNum2 = Math.abs(num2);
        double modNum3 = Math.abs(num3);

        if(modNum1<modNum2&&modNum1<modNum3){
            min = num1;
        }else if(modNum2<modNum3){
            min = num2;
        }else{
            min = num3;
        }
        return min;
    }

    public static double min2(double num1, double num2, double num3){
        double min = Math.min(num1, Math.min(num2, num3));
        return min;
    }

    public static double min3(double...a){
        double min = a[0];
        for(int i = 1; i<a.length; i++ ){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static double random(int a, int b){
        if(a>=b){
            System.out.println("The second number must be greater than the first one!");
            return -1;
        }
        int segment = b - a;
        double randomNum = Math.random()*segment + a;
        return randomNum;
    }

    public static int numRound(float n){
        return Math.round(n);
    }

    public static double segmentLength(Point a, Point b){
        double ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        return ab;
    }
}

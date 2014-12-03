package com.epam.courses;

import com.epam.courses.arrays.ArraysHelper;
import com.epam.courses.devices.Device;
import com.epam.courses.devices.Laptop;
import com.epam.courses.devices.Mobile;
import com.epam.courses.mathematics.Mathematics;
import com.epam.courses.triangle.Point;
import com.epam.courses.triangle.Triangle;

import java.util.Arrays;

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

        //Task 4. N1
        ArraysHelper arraysHelper = new ArraysHelper();
        int [] tempArray = arraysHelper.fibonacciShuffle(20);
        System.out.println(Arrays.toString(tempArray));

        //Task 4. N2
        int [] tempArray1 = new int [] {1, -3, 5, 10, -5};
        System.out.println(arraysHelper.arrayMin(tempArray1));
        System.out.println(arraysHelper.arrayMax(tempArray1));

        //Task 4. N3
        int [] result = arraysHelper.arrayReversed(tempArray1);
        System.out.println(Arrays.toString(result));

        //Task 4. N4
        arraysHelper.arraySort(tempArray1);
        System.out.println(Arrays.toString(tempArray1));

        //Task 4. N5
        int res = arraysHelper.arraySearch(tempArray1);
        System.out.println(res);

        //Task 4. N6
        int [][] twoDimArray = arraysHelper.twoDimArray(2, 3);
        //arraysHelper.printTwiDimArray(twoDimArray);

        //Task 4. N7
        arraysHelper.twoDimArrayFill(twoDimArray, 10);
        arraysHelper.printTwiDimArray(twoDimArray);

        //Task 4. N8
        int [][] twoDimArray2;
        twoDimArray2 = twoDimArray.clone();

        //Task 4. N9
        System.out.println(Arrays.equals(twoDimArray, twoDimArray2));
        System.out.println(Arrays.deepEquals(twoDimArray, twoDimArray2));

        //Task5. N4
        Device d = new Laptop();
        //
        // d.powerOff();
        System.out.println(d.getMaker());
        System.out.println(d.getMaker("Any"));
    }
}

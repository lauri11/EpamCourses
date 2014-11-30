package com.epam.courses.arrays;

import com.epam.courses.mathematics.Mathematics;

import java.util.Arrays;

/**
 * Created by Lena on 11/30/2014.
 */
public class ArraysHelper {
    private void shuffle(int [] a){
        for(int i =0; i<a.length; i++){
            int randomIndex = (int)(Math.random()* (a.length-1));
            swap(a, i, randomIndex);
        }
    }

    private void swap(int[] a, int i, int randomIndex) {
        int temp = a[randomIndex];
        a[randomIndex] = a[i];
        a[i] = temp;
    }

    //N1
    public int [] fibonacciShuffle(int n){
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = Mathematics.fibonacci(i);
        }
        shuffle(arr);
        return arr;
    }

    //N2
    public int arrayMin(int [] arr){
        int arrayMin = arr[0];
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i]>arr[i+1]){
                arrayMin = arr[i+1];
            }
        }
        return arrayMin;
    }

    public int arrayMax(int [] arr){
        int arrayMax = arr[0];
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i]<arr[i+1]){
                arrayMax = arr[i+1];
            }
        }
        return arrayMax;
    }

    //3
    public int [] arrayReversed(int [] arr){
        int [] reversedArray = new int [arr.length];
        for (int i = arr.length - 1, j = 0; i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    //4
    public void arraySort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    //5
    public int arraySearch(int [] arr){
        int result = Mathematics.fibonacci(8);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == result){
                return i;
            }
        }
        return -1;
    }

    //6
    public int [][] twoDimArray (int rows, int cols){
        int [][] twoDimArray = new int [rows][cols];
    return twoDimArray;
    }

    public void printTwiDimArray(int [][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<arr.length+1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void twoDimArrayFill(int [][] twoDimArray, int n){
        for(int[] row : twoDimArray){
            Arrays.fill(row, n);
        }
    }
}
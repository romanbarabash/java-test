package com.practise.lesson5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by romabarabash on 25.02.16.
 */
public class ArraysMultipleArrays {

    public static void main(String[] args) {

/*
        // ex.1
        int[] mas2 = new int[10];

        for (int i = 0; i <= 9; i++) {
            mas2[i] = (i + 1) * 10;

            System.out.print(mas2[i] + ",");
        }


        // ex.2
        int[] arr2 = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr2[i] = (i + 1) * 2;
            System.out.println(arr2[i]);
        }

        // ex.3
        int[] arr3 = new int[52];
        for (int i = 1; i < arr3.length - 1; i++) {
            arr3[i] = (i * 2) - 1;
            System.out.print(arr3[i] + ",");

        }

        // ex.4
        int[] arr4 = new int[15];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10);
            System.out.print(arr4[i] + "  ");
        }

        // ex.5
        int[] arr5 = new int[5];
        int[] arr6 = new int[5];
        int sumArr5 = 0;
        int sumArr6 = 0;
        int i;
        for (i = 0; i < arr5.length && i < arr6.length; i++) {
            arr5[i] = (int) (Math.random() * 6);
            arr6[i] = (int) (Math.random() * 6);
            System.out.print(arr5[i] + "  ");
            System.out.println(arr6[i] + "  ");
            sumArr5 = sumArr5 + arr5[i];
            sumArr6 = sumArr6 + arr6[i];
        }

        if (sumArr5 > sumArr6) {
            System.out.println("sumArr5 > sumArr6");
        } else if (sumArr5 == sumArr6) {
            System.out.println("sumArr5 = sumArr6");
        } else {
            System.out.println("sumArr5 < sumArr6");
        }

        System.out.println("sumArr5 : " + sumArr5 + "; " + "sumArr6 : " + sumArr6 + ";");


        // ex.6
        int[] arr7 = new int[12];
        int j;
        for (j = 0; j < arr7.length; j++) {
            arr7[j] = (int) (Math.random() * 31 - 16);

            System.out.print(arr7[j] + "  ");
        }
        System.out.println();
        Arrays.sort(arr7);
        int maxValue = arr7[arr7.length - 1];
        System.out.println("maxValue of arr7: " + maxValue);
        int minValue = arr7[0];
        System.out.println("maxValue of arr7: " + minValue);


        // ex.7
        int[] arr10 = new int[10];
        int[] arr8 = new int[10];
        int[] arr9 = new int[10];
        int i;
        for (i = 0; i < arr8.length && i < arr9.length; i++) {
            arr8[i] = (int) (Math.random() * 9 + 1);
            arr9[i] = (int) (Math.random() * 9 + 1);
            arr10[i] = arr8[i] + arr9[i];
            System.out.print(arr8[i] + "  ");
            System.out.print(arr9[i] + "  ");
            System.out.println(arr10[i] + "  ");
        }


        // ex.8
        int[][] dd2 = new int[5][0];
        for (int i = 0; i < 5; i++) {
            dd2[i] = new int[i + 2];
            System.out.print(dd2[i][i] + "  ");
        }

        int[][] da = new int[6][4];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
        }


        //ex.9
        int[][] arr12 = new int[8][5];
        for (int i = 0; i < arr12.length; i++) {
            for (int j = 0; j < arr12[i].length; j++) {
                arr12[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        for (int i = 0; i < arr12.length; i++) {
            for (int j = 0; j < arr12[i].length; j++) {
                System.out.print(arr12[i][j] + " ");
            }
            System.out.println();
        }


        //ex.10
        int[] numberArray = new int[10];
        for(int i = 0; i < 10; i++){
            numberArray[i] = i;
            System.out.println((i+1) + "-й элемент массива = " +  numberArray[i]);
        }

        int [] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] =(int)(Math.random()*11);
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        Arrays.sort(numbers);
        int minValue = numbers[0];
        System.out.println(minValue);
        int maxValue = numbers.length - 1;
        System.out.println(maxValue);


        // ex.11
        int [] arr13 = new int [20];
        for ( int i = 1; i <= arr13.length-1; i++){
            arr13[i] = i;
            System.out.print(arr13[i] + ", ");
        }


        // ex.12
        int [] arr14 = new int [10];
        double sum = 0;
        for (int i = 0; i < arr14.length; i++){
            arr14[i] = (int)(Math.random()*11);
            sum = sum + arr14[i];

            System.out.print(arr14[i] + ", ");
        }
        double arr14Average = sum / 10;
        System.out.println();
        System.out.println("arr14 sum: " + sum);
        System.out.print("arr14Average: " + arr14Average);



        // ex.13
        String[] cars = new String[] {"BW", "Audi", "Bentley", "VW"};

        Arrays.sort(cars);
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");

        }
        System.out.println();

        Arrays.sort(cars, Collections.reverseOrder());
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }


        // ex.14
        int[][] matrixA;
        matrixA = new int[2][3];

        matrixA[0][0] = 1;
        matrixA[0][1] = -2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 1;
        matrixA[1][2] = 7;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }


        // ex.15
        int[][] multiplyTab  = new int[10][10];

        // цикл по первой размерности
        for (int i = 0; i < 10; i++) {
            // цикл по второй размерности
            for (int j = 0; j < 10; j++) {
                //инициализация элементов массива
                multiplyTab[i][j] = (i+1)*(j+1);

                //вывод элементов массива
                System.out.print(multiplyTab[i][j] + "\t");
            }
            System.out.println();

        }


        // ex.16
        int[][] arr15 = new int[5][];

        //определяем кол-во елементов в каждой [5] строчке массива

        arr15[0] = new int [1];
        arr15[1] = new int [2];
        arr15[2] = new int [3];
        arr15[3] = new int [4];
        arr15[4] = new int [5];


        for(int i = 0; i<arr15.length; i++){
            for(int j = 0; j<arr15[i].length; j++){
                System.out.print(arr15[i][j] + " ");
            }
            System.out.println();
        }


        // ex.17
        int [][] arr16 = new int [5][6];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                arr16[i][j] = (int)(Math.random()*100);
                System.out.print(arr16[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int h = 0; h < 6; h++){
            System.out.print(arr16[2][h] + " ");
        }
        System.out.println();
        System.out.println();


        // ex.18
        int[][] arr17 = new int[3][3];
        int sum = 0;
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 3; m++) {
                arr17[n][m] = (int) (Math.random() * 100);
                System.out.print(arr17[n][m] + " ");
                sum = sum + arr17[n][m];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(sum);


*/
        //ex.19
        int [] arr18 = {-2,0,4,38,10,-9,8,12,18,333,69,310};
        for (int i = 0; i < arr18.length; i++) {
            if (arr18[i] % 3 == 0) {
                System.out.print(arr18[i] + " ");
            } else if(arr18[i] % 4 == 0) {
                System.out.print(arr18[i] + " ");
            }
        }


    }
}

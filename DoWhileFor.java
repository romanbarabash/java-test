package com.practise.lesson5;


import java.util.*;


/**
 * Created by romabarabash on 25.02.16.
 */
public class DoWhileFor {

    public static void main(String[] args) {

        /*


        // ex.1
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        int i = 0;
        // Генерируем случайное целое число от 1 до 10
        prog = (int)(Math.random() * 21) -11;
        System.out.println("Я загадал число от -10 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);

        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                i++;
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == 0) {
                    System.out.println("Вы ввели 0");
                    System.out.println("Число загаданное программой: " + prog);
                    // если 0 - программа заканчивает работу
                }else if (user == prog ) {
                    System.out.println("Вы угадали");
                } else {
                    // Проверяем, входит ли число в отрезок [-10;10]
                    if (user >= -10 && user <= 10) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    }
                    else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }

            } while( user != prog && user != 0);

        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
        System.out.println("~~~~~~~~~~~");
        System.out.println("Количество попыток: " + i);


        // ex.2
        for (int i = 2; i <= 33; i = i + 2) {
            System.out.print(i + " ");
            } int sum = 0; // Сюда будем накапливать результат
        for (int j = 2; j <= 100; j=j+2) {
            sum = sum + j;
        }
        System.out.println(sum);


        // ex.3
        for (int i = 1; i < 11; i++) {
            System.out.print(2*i + 2 + " ");
            //2n+2, where n=1, 2, 3…:
        }


        // ex.4
        for (int arr11 = 2, i = 1; i <= 10; arr11 = arr11 * arr11, i++) {
            System.out.print(arr11 + " ");
        }


        //ex.5
        int z = 1000;
        while (z < 10000) {
            z = z + 3;
            System.out.println(z + " ");
        }

        for (int x = 1, n = 1; n <= 55; x = x + 2, n ++){
            System.out.print(x + " ");
        }


        //ex.6
        int x = 90;
        do {
            System.out.print(x + " ");
            x = x - 5;
        } while(x > 0);


        //ex.7
        for (int z = 2, i = 1; i <= 20; z = z * 2, i++) {
            System.out.print(z + " ");
        }


        //ex.8
        for (int arr11 = 2; arr11 < 10000; arr11++){
            System.out.print(arr11 + " ");
            arr11 = 2*arr11 - 1;
        }


        //ex.9
        //Выведите на экран все положительные делители натурального числа, введённого с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter int number");
        scanner.hasNextInt();
        i = scanner.nextInt();
        while(true) {
            System.out.print(i + " ");
            i = i / 2;
            if (i == 0) {
                break;
            }
        }

        //ex.10
        int sum = 0;
        for(int i = 8; i <= 400; i=i+4){
            sum = sum + i;
        }
        System.out.print(sum);


        //ex.11
        int id;
        String name = "test";
        int var1 = 3;
        int var2 = 1;

        for (id = 1; id <= 100; id++){
            System.out.print("("+ id + "," + name + id + "," + var1 + "," + var2+")" + ",");
        }

        //ex.12
        int i;
        int n;
        for (i = 0, n = 0; i <= 10; i++, n=n-5) {
            System.out.println(n);
        }


        //ex.13
        String search = "i don't give arr14 fuck";
        int maxLength = search.length();
        char symbol = 'c';
        boolean find = false;

        for (int i = 1; i < maxLength; i++) {

            if(search.charAt(i) == symbol) {
                find = true;
                break;
            }
        }
        if(find) {
            System.out.println("Symbol '" + symbol + "' was found in the string" );
        } else {
            System.out.println("Symbol '" + symbol + "' wasn't found in the string" );
        }


    */
        //ex.14
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println(count += 2);
        }


    }


}

package com.practise.lesson5;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by romabarabash on 27.02.16.
 */
public class ExploreString {

    public static void main(String[] args) {


        //ex.1
        String [] values = {"(" + "value1", "value2", "value3", "value4" + ")"};
        String setOfValues = new String();
        for(int i = 0; i < values.length; i++){
            if(i != values.length - 1){
                setOfValues = values[i] + ", ";
            } else {
                setOfValues = values[i] + " ";
            }
            System.out.print(setOfValues);
        }
            System.out.println();


        //ex.2
        String str = "automation";
        char[] strArray= str.toCharArray();
        int length = strArray.length;
        for (int i = length-1 ; i >= 0; i--){
            System.out.print(strArray[i]);
        }
        System.out.println();

        //ex.3
        String str1 = "1 000 000 000";
        char[] chArray = str1.toCharArray();
        for(int i = 0; i<chArray.length; i++){
            // finding ' '
            if(chArray[i] == ' '){
                //replace to '.'
                chArray[i] = '.';
            }
        }
        System.out.println(chArray);


        //ex.4
        String url = "www.mysite.com";
        String name = url.substring(4, url.length()-4);
        System.out.println(name); //  "mysite"

        String domain = url.substring(4);
        System.out.println(domain); // "mysite.com"


        //ex.5
        String isbn = "987-3-16-14867810-0";
        String [] isbnParts = isbn.split("-");
        System.out.println("EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регистрационной группы: " + isbnParts[1]);
        System.out.println("номер регистранта: " + isbnParts[2]);
        System.out.println("номер издания: " + isbnParts[3]);
        System.out.println("контрольная цифра: " + isbnParts[4]);


        //ex.6
        String data = "+%name:roma/+%nage:24/+%ntime:23:43";
        String [] lines = data.split("/");

        for(String line : lines){
            int pos = line.indexOf(":");
            String attributeName = line.substring(2, pos);
            String value = line.substring(pos+1, line.length());
            System.out.println(attributeName + "_" + value);
        }

        //ex.7
        String str2 = "1 000 000 000";
        String newStr = str2.replace(" ", ".");
        System.out.println(newStr);


        //ex.8
        StringBuilder builder = new StringBuilder("automation");
        System.out.println(builder.reverse().toString());

    }
}

        /*
        Main String methods


        // .concat(String str);

        String[] animals = {"Хаски","Морж"};// массив строк 1
        String[] food = {"колбаски","корж"}; // массив строк 2
        //составляем строки из элементов массивов и связующего слова
        String result1 = animals[0].concat(" ест ").concat(food[0]);
        String result2 = animals[1].concat(" ест ").concat(food[1]);


         //  .length();

        String str = "Строка из букв, цифр 492 и специальных символов %*;№?";
        int length = str.length();


        //  .charAt(int index); - возвращает символ, находящийся по указанному индексу в строке.

        String str = "Последний символ в этой строке - о";
        int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
        char ch = str.charAt(last);


        //  .toCharArray();  - преобразует строку в новый массив символов.

        String str = "1 000 000 000";
        //преобразовываем строку в массив
        char[] chArray = str.toCharArray();


        //  .substring(int beginIndex, int endIndex); - возвращает новую строку, подстроки используемой строки.

        String s = "www.mysite.com";
        String name = s.substring(4, s.length()-4);


        //  .split(String regex); -  разбиения строк на части

        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");


        //  .contains(CharSequence s); — проверяет, содержит ли строка заданную последовательность символов и возвращает true или false.

        String s = "www.mysite.com";
        boolean isContain1 = s.contains("mysite");
        System.out.println(isContain1);// нашел - выведет true


        //  .indexOf(String str, int fromIndex); - применяется для поиска первого вхождения указанного символа в строке


        //  .lastIndexOf(String str, int fromIndex); - ищется последнее вхождение символа или подстроки в строке.



       //  .replace(char oldChar, char newChar); - замена в строке одного символа или подстроки на другой символ или подстроку
           .replaceFirst (char oldChar, char newChar) - replace the first substring matching the regular expression

        String str = "1 000 000 000";
        String newStr = str.replace(" ", ".");
        System.out.println(newStr);


        // .equals(Object anObject); - проверяет идентичность строк.  Возвращает true

        String str = "Я помню ЧУДНОЕ мгновенье";
        String str2 = "я помню чудное мгновенье";
        //строки не идентичны
        System.out.println(str.equals(str2)); //


         Task - create your own examples!
         
        */








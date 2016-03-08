package com.practise.lesson5;


public class ExploreStringBuilder {


    public static void main(String[] args){

    	//ex.length();
        StringBuilder sb = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipisicing elit");
		System.out.println("length: " + sb.length());

		//ex.capacity();
		StringBuilder sb1 = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipisicing elit");
		System.out.println("capacity: " + sb1.capacity());

		//ex.charAt(int index); .setCharAt(int index, char ch);
		StringBuilder sb2 = new StringBuilder("Car");
		System.out.println("sb2 3nd char is: " + sb2.charAt(2));
		sb2.setCharAt(2,'t');
		System.out.println(sb2);

		//ex.append(String string); .append(int number); .append(Object object);
		String str1 = "Liverpool";
		int y = 1970;
		StringBuilder sb3 = new StringBuilder();
		sb3.append(str1).append(y);
		System.out.println(sb3);

		//ex.insert();
		StringBuilder sb4 = new StringBuilder("it is year now");
		sb4.insert(6, 2016);
		System.out.println(sb4);

		//ex.reverse();
		StringBuilder sb5 = new StringBuilder("login");
		sb5.reverse();
		System.out.println("reversed: " + sb5);

		//ex.delete(); .deleteCharAt();
		StringBuilder sb6 = new StringBuilder("it is 2016 year now");
		sb6.delete(6, 11);
		System.out.println("deleted 2016: " + sb6);
		sb6.deleteCharAt(0);
		System.out.println("deleted char 1: " + sb6);

		//ex.substring();
		StringBuilder sb7 = new StringBuilder("it is 2016 year now");
		String substr = sb7.substring(6, 11);
		System.out.println("substring of sb7 from 6 to 11 character: " + substr);


    }

}

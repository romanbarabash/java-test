package com.practise.lesson5;

import java.util.Arrays;
import java.util.Collections;

public class ExploreStringExercises {

	public static void main(String[] args) {

	//ex.concat
	String [] band = {"Nirvana" , "Beatles", "Massive Attack"};
	String [] songs = {"Man who sold the World", "Get back", "Five man army"};
	
	String join1 = band[0].concat(" plays ").concat(songs[0]).concat(" song");
	String join2 = band[1].concat(" plays ").concat(songs[1]).concat(" song");
	String join3 = band[2].concat(" plays ").concat(songs[2]).concat(" song");
	System.out.println(join1);
	System.out.println(join2);
	System.out.println(join3);

	//ex.length
	String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et";
	int stingLenght = str.length();
	System.out.println("str.length is: " + stingLenght);
		
	//ex.charAt();
	String str1 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";
	char ch = str1.charAt(13);
	System.out.println("char 13 of string = " + ch);

	//ex.toCharArray();
	String str2 = "1 000 000 000";
	char [] chArr = str2.toCharArray();
	System.out.println("1st symbol of chArr is " + chArr[0]);
	int chArrLength = chArr.length;
	System.out.println("show revert str2 on the next line:");
	for(int j = chArrLength - 1; j >= 0; j--){
		System.out.print(chArr[j]);
	}

	System.out.println();
	
	//ex.substring();
	String str3 = "https://github.com/romanbarabash/";
	String substr3 = str3.substring(8, str3.length());
	System.out.println(substr3);

	//ex.split();
	String path = "home/romabarabash/Documents/JAVA/JAVAProjects";
	String [] splited = path.split("/");
	for(int i = 0; i < splited.length; i++) {
		System.out.println(splited[i]);	
	}

	//ex.contains();
	String path1 = "home/romabarabash/Documents/JAVA/JAVAProjects";
	boolean pathPart = path1.contains("JAVA");
	System.out.println(pathPart);

	//ex.indexOf();
	String str4 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";
	int index = str4.indexOf("it", 20);
	System.out.println("index of 'it' starting from 20th character is: " + index);
	
	//ex.replace();
	String str5 = "home/romabarabash/Documents/JAVA/JAVAProjects";
	String replaced = str5.replace("/", "-");
	System.out.println(replaced);
	
	
	}

}

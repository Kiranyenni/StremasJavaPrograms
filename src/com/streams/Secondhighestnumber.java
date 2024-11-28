package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Secondhighestnumber {
	
	public static void main(String[] args) {
		
		List<Integer> secoundHighest = Arrays.asList(88,22,66,21,45,63,88,14);
		
		System.out.println(secoundHighest.stream().sorted().skip(1).findFirst());
		//ascending order 2 highest
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(secoundHighest.stream().sorted(Comparator.reverseOrder())
				.skip(1).findFirst());
		
		//descending order 2 height
		
	}



}

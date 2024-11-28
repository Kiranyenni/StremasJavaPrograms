package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reverseorderusingnumber {
	
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,5,9,2,3,4,7,6,8);
		
		num.stream().sorted().forEach(e->System.out.print(e));//ascending order
		
		
		num.stream().sorted(Comparator.reverseOrder())
		.forEach(e->System.out.print(e));//descending order
		
		
	}
}

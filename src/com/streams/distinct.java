package com.streams;

import java.util.Arrays;
import java.util.List;

public class distinct {
	
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("mani","sai","mani","mani","kumar","kumar","ganesh","mani");
		
		
		
				name.stream().distinct().forEach(e->System.out.println(e));
		
	}

}

package com.streams;

import java.util.Arrays;
import java.util.List;

public class count {
	
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("sai kiran","sai kumar","mani","ganesh","nagaraju");
		
		System.out.println(name.stream().count());
				
	}

}

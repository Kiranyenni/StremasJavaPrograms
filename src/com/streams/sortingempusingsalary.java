package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortingempusingsalary {
	
	public static void main(String[] args) {
		
		
		List<Emp> data = Arrays.asList(
				new Emp("sai","hr",2000),
				new Emp ("mani","it",10000),
				new Emp ("teja","admin",6000),
				new Emp("kumar","it",15000),
				new Emp ("rahul","admin",3000),
				new Emp("naveen","testing",4000));
		
	
		
	 data.stream().sorted(Comparator.comparingInt(Emp::getSal))
	 .forEach(e->System.out.println(e.getName()+"::"+e.getDep()+"::"+e.getSal()));
				
			
		
	}

}

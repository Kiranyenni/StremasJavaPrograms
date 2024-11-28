package com.streams;

import java.util.Arrays;
import java.util.List;

public class salgreterthan5k {
	
	public static void main(String[] args) {
		
		List<Emp> empdata = Arrays.asList(

				new Emp("sai", "hr", 1000), new Emp("kiran", "it", 3000), new Emp("kumar", "admin", 2000),
				new Emp("ganesh", "hr", 9000), new Emp("mani", "testing", 1000), new Emp("naveen", "testing", 3000),
				new Emp("rahul", "admin", 5000), new Emp("akhil", "it", 4000));
		
		
		empdata.stream().filter(e->e.getSal()>=5000)
		.forEach(e->System.out.println(e.getName()+" :: "+e.getSal()));
		
	}

}

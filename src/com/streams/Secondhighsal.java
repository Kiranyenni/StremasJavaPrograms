package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Secondhighsal {

	public static void main(String[] args) {
		
		
		List<Emp> empdata = Arrays.asList(

				new Emp("sai", "hr", 5000), new Emp("kiran", "it", 6000), new Emp("kumar", "admin", 2000),
				new Emp("ganesh", "hr", 9000), new Emp("mani", "testing", 15000), new Emp("naveen", "testing", 3000),
				new Emp("rahul", "admin", 5000), new Emp("akhil", "it", 7000));
		
		
	Optional<Emp> sal = empdata.stream().sorted(Comparator.comparingInt(Emp::getSal).reversed()).skip(1).findFirst();
		
		System.out.println(sal.get().getName()+": :"+sal.get().getSal());

	}

}

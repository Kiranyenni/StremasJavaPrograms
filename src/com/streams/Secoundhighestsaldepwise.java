package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secoundhighestsaldepwise {
	
public static void main(String[] args) {
		
		List<Emp> empdata = Arrays.asList(

				new Emp("sai", "hr", 1000), new Emp("kiran", "it", 3000), new Emp("kumar", "admin", 2000),
				new Emp("ganesh", "hr", 9000), new Emp("mani", "testing", 1000), new Emp("naveen", "testing", 3000),
				new Emp("rahul", "admin", 5000), new Emp("akhil", "it", 4000));
		
		
		
		Map<String, Optional<Emp>> obj = empdata.stream().collect(Collectors.groupingBy(Emp::getDep,
				Collectors.collectingAndThen(Collectors.toList(),
						list->list.stream().sorted(Comparator.comparingLong(Emp::getSal).reversed()).skip(1).findFirst())));
		
		obj.forEach((dept,e)->System.out.println(e.get().getName()+":"+e.get().getDep()+":"+e.get().getSal()));
		
}
		

}

package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortingusingstreams {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("sai", "kiran", "mani", "abc","zz");

		name.stream().sorted().forEach(e -> System.out.println(e));// ascending order
		System.out.println("----------------------------------------");

		name.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e)); // decending order

	}

}

package com.streams;

public class Emp {

	String name;
	String dep;
	int sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Emp(String name, String dep, int sal) {
		super();
		this.name = name;
		this.dep = dep;
		this.sal = sal;
	}

}

package com.ty.joops.myexperiments;

import java.util.Comparator;

public class SortbyId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.sid - o2.sid;
	}
	
	
	
	

}

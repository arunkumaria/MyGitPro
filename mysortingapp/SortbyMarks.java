package com.ty.joops.myexperiments;

import java.util.Comparator;

public class SortbyMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		
		return (int)o1.smarks - (int)o2.smarks;
	}
	
	
	
	

}




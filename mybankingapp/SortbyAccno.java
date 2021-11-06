package com.ty.joops.tasks;

import java.util.Comparator;

public class SortbyAccno implements Comparator<UserAcct>{

	@Override
	public int compare(UserAcct o1, UserAcct o2) {
		
		return (int)o1.accno - (int)o2.accno;
	}
	
	
	
	

}

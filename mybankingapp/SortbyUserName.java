package com.ty.joops.tasks;

import java.util.Comparator;

public class SortbyUserName implements Comparator<UserAcct>{

	@Override
	public int compare(UserAcct o1, UserAcct o2) {
		
		return o1.uname.compareTo(o2.uname);
	}


	
	
	

}

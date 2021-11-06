package com.ty.joops.myexperiments;

import java.util.Comparator;

public class Student{
	

	
	public int sid;
	public String sname;
	public double smarks;
	public int sage;
	
	

	
	public Student(int sid,String sname,double smarks,int sage){
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
	}
	

	
	@Override
	public boolean equals(Object obj) {
		
		Student obj1 = (Student)obj;
        return ((this.sid == obj1.sid)||(this.sid == obj1.sid && this.sname == obj1.sname && this.smarks == obj1.smarks && this.sage == obj1.sage));
    
	
	}
	
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sage=" + sage + "]";
	}

	

	






	
	

	
	
	
	
}


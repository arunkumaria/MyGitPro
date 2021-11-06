package com.ty.joops.tasks;

import com.ty.joops.myexperiments.Student;

public class UserAcct {
	
	
	private double bal = 500.00;
	String uname;
	private long uadar;
	public long accno;
	private static long asacc = 3456;
	

	
	public UserAcct(String uname,long uadar) {
		
		this.uname = uname;
		this.uadar = uadar;
		this.accno = asacc;
		System.out.println("account created successfully");
		System.out.println("your account no is: " + this.accno);
		asacc++;
		AdminAcct.noa++;
		System.out.println();
		
	}
	
	
	

	public String getUname() {
		return uname;
	}




	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public boolean equals(Object obj) {
		
		UserAcct obj1 = (UserAcct)obj;
        return ((this.accno == obj1.accno)||(this.accno == obj1.accno && this.uname == obj1.uname && this.uadar == obj1.uadar && this.accno == obj1.accno));
    
	
	}
	


	@Override
	public String toString() {
		return "user name: " + this.uname + "\n" + "user adar no: " + this.uadar + "\n" + "accno" + this.accno + "\n";
	}




	void withdraw(double i) {
		
		System.out.println("your previous balance was "+bal);
		if(i <= bal) {
			bal = bal - i;
			System.out.println("withdraw successful");
			
		}
		else {
			System.out.println("balance is not sufficient");
		}
		
		System.out.println("your new balance is "+bal);
		
		
	}
	void deposit(double j) {
		
		System.out.println("deposit successful");
		System.out.println("your previous balance was "+bal);
		bal = bal + j;	
		System.out.println("your new balance is "+bal);
		
	}
	void checkBal() {
		
		System.out.println("your account bal: "+bal);
		
		
	}
}

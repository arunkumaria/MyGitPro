package com.ty.joops.tasks;

class AdminAcct {

	private UserAcct acct;
	public static int noa = 0;

	
	
	public UserAcct addAcc(String uname,long uadar) {
		System.out.println();
		acct = new UserAcct(uname,uadar);
		return acct;
		
		
	}
	
	public void upAcc(long acctno) {
		String nme;
		int ch = 0;
		
		System.out.println();
		MyAccount.sc.nextLine();
		
		
		for(int i=0; i <  MyAccount.arrayList.size(); i++) {
			
			if(MyAccount.arrayList.get(i).accno == acctno) {
				
				System.out.println("enter your name to be modified ");
				nme = MyAccount.sc.nextLine();
				
				MyAccount.arrayList.get(i).setUname(nme);
				
				System.out.println("updated account successfully");
				System.out.println("updated information of the account are: ");
				System.out.println(MyAccount.arrayList.get(i));
				ch++;
				break;
				
				
			}
			
			
			
		}
		if(ch == 0) {
		
			System.out.println("account number not matching");
			System.out.println("sorry...can't update");
		}
		
	
	}
	
	public void delAcc(long acctno) {
		
		System.out.println();
		
		int check = 0;
		System.out.println("no of accounts before: "+noa);
		
		
		for(int i=0; i <  MyAccount.arrayList.size(); i++) {
			
			if(MyAccount.arrayList.get(i).accno == acctno) {
				
				MyAccount.arrayList.remove(i);
				i=noa--;
				System.out.println("deleted account successfully");
				
				
			}
			
			
			
		}
		if(check == noa)
		{
			System.out.println("deleting unsuccessful");
		}
		
		
		System.out.println("no of accounts at present: "+noa);
	}
	
	public void searchAcc(long acctno) {
		int ch=0;
		System.out.println();
		
		for(UserAcct obj : MyAccount.arrayList) {
			if(acctno == obj.accno) {
				System.out.println("searching successful");
				System.out.println("the details are: ");
				System.out.println(obj);
				ch++;
				break;
			}
		}
		if(ch == 0) {
			System.out.println("searching unsuccessful");
		}
		
		
	}
	public void disAcc() {
		
		System.out.println();
		if(noa == 0) {
			System.out.println("sorry..no accounts created");
		}else {
			System.out.println("no of accounts: "+noa);
			System.out.println();
			System.out.println("accounts at present are: ");
			System.out.println();
			for(UserAcct obj : MyAccount.arrayList) {
				System.out.println(obj);
			
			}
		}
		
	}

}


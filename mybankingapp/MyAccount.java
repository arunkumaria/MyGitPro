package com.ty.joops.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MyAccount {

	public static ArrayList<UserAcct> arrayList;
	public static AdminAcct adminAcct;
	public static Scanner sc = new Scanner(System.in);

	public static void dispAcct(ArrayList<UserAcct> arrayList, AdminAcct adminAcct) {

		int input, input1;

		System.out.println("### Welcome to Techno CRUD Bank ###");
		System.out.println();
		System.out.println("Press,");
		System.out.println(" 1. to Add new account");
		System.out.println(" 2. to Update existing account");
		System.out.println(" 3. to Delete existing account");
		System.out.println(" 4. to Searching particular account");
		System.out.println(" 5. to Display all accounts");
		System.out.println(" 6. to Deposit");
		System.out.println(" 7. to Withdraw");
		System.out.println(" 8. to sort by id or accno");
		System.out.println(" 9. to sort by name");
		System.out.println("10. to Exit");

		input = sc.nextInt();

		switch (input) {
		case 1:
			String name;
			long adar;

			System.out.println("enter your name");
			name = sc.next();

			System.out.println("enter your adar");
			adar = sc.nextLong();

			arrayList.add(adminAcct.addAcc(name, adar));
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 2:
			long uno;
			System.out.println();
			System.out.println("enter the account no you want to update");
			uno = sc.nextLong();

			adminAcct.upAcc(uno);
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {

				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 3:

			long ano;

			System.out.println();
			System.out.println("enter the account no you want to delete");
			ano = sc.nextLong();
			adminAcct.delAcc(ano);
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 4:

			long sno;

			System.out.println();
			System.out.println("enter the account no you want to search");
			sno = sc.nextLong();

			adminAcct.searchAcc(sno);
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {

				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 5:
			System.out.println();
			adminAcct.disAcc();
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 6:

			long dno;
			double damt;

			System.out.println("enter your account no to deposit");
			dno = sc.nextLong();
			for (UserAcct obj : arrayList) {
				if (obj.accno == dno) {
					System.out.println("enter the amount to deposit");
					damt = sc.nextDouble();
					obj.deposit(damt);
				}
			}
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 7:
			long wno;
			double wamt;

			System.out.println("enter your account no to withdraw");
			wno = sc.nextLong();
			for (UserAcct obj : arrayList) {
				if (obj.accno == wno) {
					System.out.println("enter the amount to withdraw");
					wamt = sc.nextDouble();
					obj.withdraw(wamt);
				}
			}
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 8:

			for (int i = 0; i < arrayList.size(); i++) {

				for (int j = i + 1; j < arrayList.size(); j++) {

					if (arrayList.get(i).equals(arrayList.get(j))) {
						arrayList.remove(j);
						j--;
					}

				}
			}
			Collections.sort(arrayList, new SortbyAccno());
			System.out.println("Group of Customers after sort by accno are: ");
			System.out.println();
			for (UserAcct user : arrayList) {
				System.out.println(user);

			}
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 9:
			for (int i = 0; i < arrayList.size(); i++) {

				for (int j = i + 1; j < arrayList.size(); j++) {

					if (arrayList.get(i).equals(arrayList.get(j))) {
						arrayList.remove(j);
						j--;
					}

				}
			}
			Collections.sort(arrayList, new SortbyUserName());
			System.out.println("Group of Customers after sort by name are: ");
			System.out.println();
			for (UserAcct user : arrayList) {
				System.out.println(user);

			}
			System.out.println();
			System.out.println("Press 1.continue 2.exit");
			input1 = sc.nextInt();

			if (input1 == 1) {
				MyAccount.dispAcct(arrayList, adminAcct);
			} else if (input1 == 2) {
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			} else {
				System.out.println("invalid entry");
				System.out.println("thank you...visit again..🙏");
				System.exit(0);
			}

		case 10:
			System.out.println("thank you...visit again..🙏");
			System.exit(0);

		default:
			System.out.println("invalid entry");
			System.out.println("thank you...visit again..🙏");
			System.exit(0);

		}

	}

	public static void main(String[] args) {

		MyAccount.arrayList = new ArrayList<UserAcct>();
		MyAccount.adminAcct = new AdminAcct();

		MyAccount.dispAcct(arrayList, adminAcct);

		sc.close();

	}

}

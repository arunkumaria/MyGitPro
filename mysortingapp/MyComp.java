package com.ty.joops.myexperiments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyComp {
	
	

	public static void main(String[] args) {
	
		int option1,option2;
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		
		arrayList.add(new Student(1,"Arun",90.5,30));
		arrayList.add(new Student(3,"Run",89.5,20));
		arrayList.add(new Student(2,"Bun",70.6,10));
		arrayList.add(new Student(2,"Cun",70.6,40));
		arrayList.add(new Student(2,"Cun",70.6,40));
		arrayList.add(new Student(4,"Cun",70.6,40));
		arrayList.add(new Student(5,"Cun",70.6,40));
		
		
		for(int i=0;i<arrayList.size();i++) {
			
			for(int j=i+1;j<arrayList.size();j++) {
				
				if(arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
					j--;
				}
				
				
			}
		}
		System.out.println("###Welcome to Techno sort###");
		System.out.println();
		System.out.println("Group of Students before sort");
		System.out.println();
		
		for(Student obj : arrayList) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Press 1.sort by ID 2.sort by name 3.sort by marks 3.sort by marks 4.sort by age 5.exit");
		option1 = sc.nextInt();
		
		switch(option1) {
			case 1:
				Collections.sort(arrayList,new SortbyId());
				System.out.println("Group of Students after sort by id");
				System.out.println();
				for (Student student : arrayList) {
					System.out.println(student);
					
				}
				System.out.println("press 1.continue 2.exit");
				option2 = sc.nextInt();
				if(option2 == 1) {
					main(null);
				}else if(option2 == 2){
					
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				else {
					System.out.println("invalid entry");
					System.out.println();
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				
			case 2:
				Collections.sort(arrayList,new SortbyName());
				System.out.println("Group of Students after sort by name");
				System.out.println();
				for (Student student : arrayList) {
					System.out.println(student);
					
				}
				System.out.println("press 1.continue 2.exit");
				option2 = sc.nextInt();
				if(option2 == 1) {
					main(null);
				}else if(option2 == 2){
					
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				else {
					System.out.println("invalid entry");
					System.out.println();
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				
			case 3:
				Collections.sort(arrayList,new SortbyMarks());
				System.out.println("Group of Students after sort by marks");
				System.out.println();
				for (Student student : arrayList) {
					System.out.println(student);
					
				}
				System.out.println("press 1.continue 2.exit");
				option2 = sc.nextInt();
				if(option2 == 1) {
					main(null);
				}else if(option2 == 2){
					
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				else {
					System.out.println("invalid entry");
					System.out.println();
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				
			case 4:
				Collections.sort(arrayList,new SortbyAge());
				System.out.println("Group of Students after sort by age");
				System.out.println();
				for (Student student : arrayList) {
					System.out.println(student);
					
				}
				System.out.println("press 1.continue 2.exit");
				option2 = sc.nextInt();
				if(option2 == 1) {
					main(null);
				}else if(option2 == 2){
					
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
				else {
					System.out.println("invalid entry");
					System.out.println();
					System.out.println("bye bye..have a nice day..🙏");
					System.exit(0);
				}
			case 5:
				System.out.println("bye bye..have a nice day..🙏");
				System.exit(0);
			
			default:
				System.out.println("invalid entry");
				System.out.println();
				System.out.println("bye bye..have a nice day..🙏");
				System.exit(0);
				
				
		}
		
		
		System.out.println("bye bye..have a nice day..🙏");
		sc.close();
		
	}



}

import java.util.*;
import java.util.Scanner;

class Cmini1{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of Employees");

int num=sc.nextInt();

ArrayList<String> fname=new ArrayList<String>();
ArrayList<String> lname=new ArrayList<String>();
ArrayList<Integer> mobile=new ArrayList<Integer>();
ArrayList<String> email=new ArrayList<String>();
ArrayList<String> addr=new ArrayList<String>();

    for(int i=0;i<num;i++){

		System.out.println("Enter the Employee "+(i+1)+" Details");
	
		System.out.println("Enter First Name");
		String s=sc.nextLine();
		s=sc.nextLine();
		fname.add(s);

		System.out.println("Enter Last Name");
		String r=sc.nextLine();
		r=sc.nextLine();
		lname.add(r);

		System.out.println("Enter Mobile No::");
		int m=sc.nextInt();
		m=sc.nextInt();
		mobile.add(m);

		System.out.println("Enter Email");
		String a=sc.nextLine();
		a=sc.nextLine();
		email.add(a);

		System.out.println("Enter Address");
		String b=sc.nextLine();
		b=sc.nextLine();
		addr.add(b);
	
         }

    System.out.println("Employee List::");

    System.out.format("%-15s %-15s %-15s %-30s %-15s\n","FirstName","LastName","Mobile No:","Email","Address");

    for(int i=0;i<fname.size();i++){
    	System.out.format("%-15s %-15s %-15s %-30s %-15s\n",fname.get(i),lname.get(i),mobile.get(i),email.get(i),addr.get(i));
    }

	}
}
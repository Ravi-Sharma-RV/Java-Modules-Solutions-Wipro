
import java.util.*;
class String8{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("ENter String1");
		String a=sc.nextLine();

		System.out.println("Enter String2");
		String b=sc.nextLine();

		System.out.println("Enter count");
		int n=sc.nextInt();

        String c="";
		for(int i=0;i<n-1;i++){
			c=c+a+b;
		}

		String output=c+a;
		System.out.println(output);
	}
}
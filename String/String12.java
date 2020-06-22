import java.util.*;
class String12{
	public static void main(String argbs[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String a=sc.nextLine();
		System.out.println("Enter repetition number");
		int n=sc.nextInt();

		String output="";
		String out="";

		for(int i=n-1;i<a.length();i++){
			out=out+a.charAt(i);
		}

		for(int i=0;i<n;i++){
			output=output+out;
		}

		System.out.println(output);
	}
}
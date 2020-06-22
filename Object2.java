import java.lang.*;
import java.util.*;

class Calculator{
	static double powerInt(int num1, int num2){
		return Math.pow(num1,num2);
	}

	static double powerDouble(double num1, int num2){
		double n=(double)num2;
		return Math.pow(num1,n);

	}

}

class Object2{
	public static void main(String[] args) {
		double ans1=Calculator.powerInt(12,10);
		System.out.println("PowerInt: "+ans1);
		double ans2=Calculator.powerDouble(12,10);
		System.out.println("Powwr Double: "+ans2);
		

	}
		
	}

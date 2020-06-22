public class Employee extends Person{
	double salary;
	int year;
	String number;
	


	public Employee(String name,double salary,int year,String number){
		super(name);
		this.salary=salary;
        this.year=year;
        this.number=number;
        

	}
     void displayEmployee(){
     	System.out.println(name+" "+salary+" "+year+" "+number);
     	
     }

}



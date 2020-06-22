import java.util.*;

class Mini1{

	public static void main(String args [])throws Exception{

		int input=Integer.parseInt(args[0]);

		ArrayList<Integer> emp_id=new ArrayList<Integer>();

		emp_id.add(1001);
		emp_id.add(1002);
		emp_id.add(1003);
		emp_id.add(1004);
		emp_id.add(1005);
		emp_id.add(1006);
		emp_id.add(1007);

		ArrayList<String> name=new ArrayList<String>();

		name.add("Ashish");
		name.add("Shusma");
		name.add("Rahul");
		name.add("Chahat");
		name.add("Ranjan");
		name.add("Suman");
		name.add("Tanmay");

		ArrayList<String> dcode=new ArrayList<String>();

		dcode.add("e");
		dcode.add("c");
		dcode.add("k");
		dcode.add("k");
		dcode.add("m");
		dcode.add("e");
		dcode.add("c");

		ArrayList<String> dept=new ArrayList<String>();

		dept.add("R&D");
		dept.add("PM");
		dept.add("Acct");
		dept.add("Front Desk");
		dept.add("Engg");
		dept.add("Manufacturing");
		dept.add("PM");

		ArrayList<Integer> basic=new ArrayList<Integer>();

		basic.add(20000);
		basic.add(30000);
		basic.add(10000);
		basic.add(12000);
		basic.add(50000);
		basic.add(23000);
		basic.add(29000);

		ArrayList<Integer> hra=new ArrayList<Integer>();

		hra.add(8000);
		hra.add(12000);
		hra.add(8000);
		hra.add(6000);
		hra.add(20000);
		hra.add(9000);
		hra.add(12000);

		ArrayList<Integer> it=new ArrayList<Integer>();

		it.add(3000);
		it.add(9000);
		it.add(1000);
		it.add(2000);
		it.add(20000);
		it.add(4400);
		it.add(10000);

		ArrayList<String> desg=new ArrayList<String>();
		ArrayList<Integer> da=new ArrayList<Integer>();

		for(int i=0;i<7;i++){
			if(dcode.get(i).equals("e")){
				desg.add("Engineer");
				da.add(20000);
			}

			if(dcode.get(i).equals("c")){
				desg.add("Consultant");
				da.add(32000);
			}

			if(dcode.get(i).equals("k")){
				desg.add("Clerk");
				da.add(12000);
			}

			if(dcode.get(i).equals("r")){
				desg.add("Receptionist");
				da.add(15000);
			}

			if(dcode.get(i).equals("m")){
				desg.add("Manager");
				da.add(40000);
			}

		}


		ArrayList<Integer> sal=new ArrayList<Integer>();

		for(int i=0;i<7;i++){
			sal.add(basic.get(i)+hra.get(i)+da.get(i)-it.get(i));
		}


		switch(input){
			case 1001:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(0)+"	"+name.get(0)+"			"+dept.get(0)+"		"+desg.get(0)+"			"+sal.get(0));
				break;

			case 1002:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(1)+"	"+name.get(1)+"			"+dept.get(1)+"		"+desg.get(1)+"			"+sal.get(1));
				break;

			case 1003:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(2)+"	"+name.get(2)+"			"+dept.get(2)+"		"+desg.get(2)+"			"+sal.get(2));
				break;
				
			case 1004:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(3)+"	"+name.get(3)+"			"+dept.get(3)+"		"+desg.get(3)+"			"+sal.get(3));
				break;
				
			case 1005:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(4)+"	"+name.get(4)+"			"+dept.get(4)+"		"+desg.get(4)+"			"+sal.get(4));
				break;
				
			case 1006:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(5)+"	"+name.get(5)+"			"+dept.get(5)+"		"+desg.get(5)+"			"+sal.get(5));
				break;
				
			case 1007:
				System.out.print("Emp No	Emp Name	Department		Designation		Salary");
				System.out.println();
				System.out.print(emp_id.get(6)+"	"+name.get(6)+"			"+dept.get(6)+"		"+desg.get(6)+"			"+sal.get(6));
				break;

			default:
				System.out.print("There is no emp with emp_id  "+input);							


		}







		
	}
}
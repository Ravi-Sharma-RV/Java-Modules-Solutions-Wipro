class Patient{
	String name;
	double weight,height;

	Patient(String name,double weight,double height){
		this.name=name;
		this.weight=weight;
		this.height=height;
	}

	double BMI(){
		double b=(weight/(height*height))*703;
		return b;
	}


}

class Object3{
	public static void main(String[] args) {
		Patient p1=new Patient("motu",100,30);
        Patient p2=new Patient("patlu",50,70);
        double x=p1.BMI();
        System.out.println("motu's BMI:"+x);
        double y=p2.BMI();
        System.out.println("patlu's BMI:"+y);
	}
}
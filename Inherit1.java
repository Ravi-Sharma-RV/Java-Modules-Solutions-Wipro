class Animal{
	void eat(){System.out.println("eat");}
	void sleep(){System.out.println("sleep");}
}

class Bird extends Animal{
   void fly(){System.out.println("fly");}
}

class Inherit1{
	public static void main(String[] args) {
		Bird b=new Bird();
		b.fly();
		b.eat();
		b.sleep();
	}
}
class Fruit{
	String name;
	String taste;
	int size;
	Fruit(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}

	Fruit(){}
	void eat(){
		System.out.println(name+" "+taste+" "+size);
	}
}

class Orange extends Fruit{
	void eat(){
		System.out.println("orange class is best");
	}

}

class Apple extends Fruit{
	void eat(){
        System.out.println("Apple class is best");
	}
}

class Poly1{
	public static void main(String[] args) {
		Fruit f=new Fruit("pineapple","Bitter",20);
		Orange o=new Orange();
		Apple a=new Apple();

		f.eat();
		o.eat();
		a.eat();
	}
}
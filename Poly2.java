class Shape{
	void draw(){
		System.out.println("Drawing shape");
	}

	void erase(){
		System.out.println("Erasing shape");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle Drawing Shape");
	}

	void erase(){
		System.out.println("Circle Erasing Shape");
	}
}

class Traingle extends Shape{
	void draw(){
		System.out.println("Traingle Drawing Shape");
	}

	void erase(){
		System.out.println("Traingle Erasing Shape");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square Drawing Shape");
	}

	void erase(){
		System.out.println("Square Erasing Shape");
	}
}

class Poly2{
	public static void main(String[] args) {
	   Shape c=new Circle();
       Shape t=new Traingle();
       Shape s=new Square();

       c.draw();
       c.erase();
       t.draw();
       t.erase();
       s.draw();
       s.erase();	
	}


}

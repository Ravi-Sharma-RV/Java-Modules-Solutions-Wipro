class Box{
	double width;
	double height;
	double depth;

	Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;}
	 
	double Volume(){
		double v;
		v=width*height*depth;
		return v;
	} 

}

class Object1{
	public static void main(String[] args){
     
     Box b1=new Box(2,2,2);
     double v=b1.Volume();
     System.out.println(v);
	}
}
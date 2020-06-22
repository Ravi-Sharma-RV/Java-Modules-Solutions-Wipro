class String2{
	public static void main(String args[]){
		String in1=args[0].toLowerCase();
		String in2=args[1].toLowerCase();
		if(in1.charAt(in1.length()-1)==in2.charAt(0)){
			String in3=in2.substring(1,in2.length());
			String out=in1+in3;
			System.out.println(out.toLowerCase());
		}
		else{
			String out2=in1+in2;
			System.out.println(out2.toLowerCase());
		}
	}
}
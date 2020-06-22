class String5{
	public static void main(String args[]){
		String input=args[0];
		if(input.length()>4){
			String output=input.substring(1,input.length()-1);
			System.out.println(output);
		}
		else{
			System.out.println("null");
		}
	}
}
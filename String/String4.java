class String4{
	public static void main(String args[]){
		String input=args[0];
		if(input.length()%2==0){
			String output=input.substring(0,input.length()/2);
			System.out.println(output);
		}
		else{
			System.out.println("null");
		}
	}
}
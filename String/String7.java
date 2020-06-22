class String7{
	public static void main(String args[]){
		String input=args[0];

		if(input.charAt(0)=='x'&&input.charAt(input.length()-1)=='x'){
			String output=input.substring(1,input.length()-1);
			System.out.println(output);
		}
		else{
			System.out.println(input);
		}
	}
}
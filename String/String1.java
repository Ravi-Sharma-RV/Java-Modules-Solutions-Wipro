class String1{
	public static void main(String args[]){
		String input=args[0];

		String sb=new StringBuffer(input).reverse().toString();
		if(input.equals(sb)){
			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("String is not a Palindrome");
		}
	}
}
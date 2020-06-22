class String9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String ");
		String a=sc.nextLine();

		for(int i=0;i<a.length;){
			if(a.charAt(i)=='*'){
				i++;
			}
			else{
				i++;
			}
		}
	}
}
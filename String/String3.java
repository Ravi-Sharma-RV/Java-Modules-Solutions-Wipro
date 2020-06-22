class String3{
	public static void main(String args[]){
		String in1=args[0];
		if(in1.length()<2){
			String out1=in1.substring(0,in1.length());
			for(int i=0;i<in1.length();i++){
				System.out.print(out1);
			}
		}
		else{
			String out2=in1.substring(0,2);
			for(int i=0;i<in1.length();i++){
				System.out.print(out2);
			}
		}
	}
}
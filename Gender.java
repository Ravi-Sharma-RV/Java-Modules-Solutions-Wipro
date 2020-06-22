class Gender{
  
	public static void main(String[] args){
                                     
        int age=Integer.parseInt(args[0]);
        String f="female"; 
        String m="male";
        if((age>=1)&&(age<=58)&&(args[1].equals(f))){
            
          System.out.print("interest is 8.2%");

            }

        else if((age>=59)&&(age<=120)&&(args[1].equals(f))){
            
          System.out.print("interest is 7.6%");

            }
         
        else if((age>=1)&&(age<=60)&&(args[1].equals(m))){
            
          System.out.print("interest is 9.2%");

            }

       else if((age>=61)&&(age<=120)&&(args[1].equals(m))){
            
          System.out.print("interest is 8.3%");

            }

           else {
            
          System.out.print("wrong entry");

            }









                                              }






             





              }
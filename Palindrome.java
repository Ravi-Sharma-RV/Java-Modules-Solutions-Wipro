class Palindrome{

public static void main(String[] args){
int n,s=0;
int num= Integer.parseInt(args[0]);
int orignum=num;
        while(num>0)
        {
         n=num%10;
         s=s*10 + n;
         num=num/10;
            
        }
    System.out.print("\n");
      if(orignum==s){
     System.out.print("palindrome");
           } 

      else{
     System.out.print("not palindrome");
           }
}


} 
class Reverse{

public static void main(String[] args){
int n;
int num= Integer.parseInt(args[0]);

        while(num>0)
        {
         n=num%10;
         System.out.print(n);
         num=num/10;
            
        }

       
}


} 
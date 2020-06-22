class Floyds{

public static void main(String[] args){

int num = Integer.parseInt(args[0]);

if((args.length)==0){
System.out.print("number daalo tbhi bnayenge");
}

for(int i=1;i<=num;i++)
{
for(int j=1;j<=i;j++){
System.out.print("*");

}
System.out.print("\n");
}


}


}
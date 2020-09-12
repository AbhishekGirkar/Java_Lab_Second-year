



/*fibbonacci series*/
import java.util.Scanner;
class fib
{
public static void main(String rg[ ])
{
int a,b=1,c=0,n,i=1;
Scanner sc= new Scanner(System.in);
System.out.println(" how many number want in fibonacci series?");
n=sc.nextInt();
System.out.printf(" fibonacci serie of first %d number\n",n);
while(i<=n)
{
System.out.print("  "+c);
a=b;
b=c;
c=a+b;
i++;
}
}
}
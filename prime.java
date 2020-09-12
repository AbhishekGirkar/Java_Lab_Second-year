
/*Prime Number*/
import java.util.Scanner;
class prime
{
public static void main (String args[])
{
int n,i,c=0;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<n;i++)
{
if(n%i==0)
c=1;
}
if(c==0)
System.out.println("It is a Prime");
else
System.out.println("It is not a Prime");
}
}
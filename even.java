import java.util.Scanner;
class even 
{
public static void main(String arg[ ])
{
int a,i=0,n,b;
Scanner sc= new Scanner(System.in);
System.out.println(" how many even number want? ");
n=sc.nextInt();
while(i<=n)
{
i+=2;
System.out.println(i);
}
}
}
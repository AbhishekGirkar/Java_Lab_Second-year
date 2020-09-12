import java.util.Scanner;
class even 
{
public static void main(String arg[ ])
{
int a,i=0,n;
Scanner sc= new Scanner(System.in);
System.out.println(" how many even number want? ");
n=sc.nextInt();
while(i<=n)
{

System.out.println(+(i+=2));
i++;
}
}
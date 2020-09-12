import java.util.Scanner;
class mth
{ 
 public static void main(String...arg)
{
void sqroot():
{
double n;
Scanner sc= new Scanner(System.in);
System.out.println(" enter  square number");
n=sc.nextInt();
m=Math.sqrt(n);
System.out.println(m);
}
void power();
{
System.out.println(" enter   number and power");
int n=sc.nextInt();
int m=sc.nextInt();
x=Math.pow(n,m);
System.out.println(x);
}
void max();
{ System.out.println(" enter  two number");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println(Math.max(x,,y));
System.out.println(Math.min(x,y));
}
void abs
{
double p
System.out.println(" enter  number");
 p=sc.nextInt();
System.out.println(Math.abs(p));
}
void log
{
double q;
System.out.println(" enter  number");
 q=sc.nextInt();
System.out.println(Math.log(q));
}
void  real
{
System.out.println(" enter  number");
double q=sc.nextInt();
System.out.println(Math.rint(q));
System.out.println(Math.round(q));
System.out.println(Math.exp(q));
System.out.println(Math.ceil(q));
System.out.println(Math.floor(q));
}
void angle()
{
System.out.println(" enter  angle");
double a=sc.nextInt();
System.out.println(Math.sin(q));
System.out.println(Math.cos(q));
System.out.println(Math.tan(q));
}
}
class math
{ 
 public static void main(String...arg)
{
mth b=new mth ();
      b.sqroot();
      b.power();
      b.max();
      b.abs();
      b.log();
      b.real();
      b.angle();
}
}

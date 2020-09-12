import java.util.Scanner;
class math
{ 
 public static void main(String...arg)
{
double n,m;
Scanner sc= new Scanner(System.in);
System.out.printf(" enter square number");
n=sc.nextFloat();
m=Math.sqrt(n);
System.out.printf("square root of %f is %f",n,m);
System.out.println(" \nenter   number and power");
n=sc.nextFloat();
m=sc.nextFloat();
double x=Math.pow(n,m);
System.out.println(x);
System.out.println(" enter  two number");
x=sc.nextFloat();
float y=sc.nextFloat();
System.out.println("largest number"+Math.max(x,y));
System.out.println("smallest number"+Math.min(x,y));
double p;
System.out.println(" enter  number");
 p=sc.nextFloat();
System.out.println(Math.abs(p));
double q;
System.out.println(" enter  number");
 q=sc.nextFloat();
System.out.printf("log of %f number;\n%f",q,Math.log(q));
System.out.println(" enter  number");
double b=sc.nextFloat();
System.out.println(Math.rint(b));
System.out.println(Math.round(b));
System.out.println(Math.ceil(b));
System.out.println(Math.floor(b));
System.out.println(Math.exp(b));
System.out.println(" enter  angle");
int a=sc.nextInt();
System.out.printf("sin of%d is%f\n",a,Math.sin(45));
System.out.printf("cos of%d is %f\n",a,Math.cos(q));
System.out.printf("tan of %dis %f\n",a,Math.tan(q));
}
}


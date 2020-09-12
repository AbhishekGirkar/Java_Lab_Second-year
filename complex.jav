class complex
{
int real;
int img;
complex();
{
System.out.println("********Complex Number operation *************");
}
complex(int r,int i)
{
real=r;
img=i;
}
complex( complex c1, complex c2)
{
r=c1.real+c2.real;
i= c1.img+c2.img;
System.out.prinf("Addition is  %d+%di",r,i);
r=c1.real-c2.real;
i= c1.img-c2.img;
System.out.prinf("\nSubtraction is  %d+%di",r,i);
r=(c1.real*c2.real)-(c1.img*c2.img);
i=(c1.real*c2.img)+(c2.real*c1.img)
System.out.prinf("\nMultipliction is  %d+%di",r,i);
}
public static void main(String arg[])
{ 
Scanner sc= new scanner(sytem.in);
complex c=new complex();
System.out.println("enter real and imaginary part of complex number 1");
n1= sc.nextnt();
System.out.prin(i);
n2=sc.nextInt();
System.out.println("enter real and imaginary part of complex number 2");
n3= sc.nextnt();
System.out.prin(i);
n4=sc.nextInt();
complex c1=new complex(n1,n2);
complex c2=new complex(n3,n4);
complex c3= new complex(c1,c2);
}


import java.util.Scanner; 
   class armstrong
{ 
public static void main( String arg[])    
    {
      int a, temp,r,b=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       a=sc.nextInt();
       temp=a;
      while(a>0)
      {
         r=a%10;
         a=a/10;
         b=b+(r*r*r);
        }
   if(temp==b)
     { 
       System.out.println("Armstrong Number");

       }
   else
    {
      System.out.println("Not ARMSTRONG");
       
    }
  }
}


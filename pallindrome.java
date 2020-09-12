import java.util.Scanner; 
   class pallindrome
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
         b=b*10+r;
        }
   if(temp==b)
     { 
       System.out.println("PALLINDROME");

       }
   else
    {
      System.out.println("NOT PALLINDROME");
       
    }
  }
}
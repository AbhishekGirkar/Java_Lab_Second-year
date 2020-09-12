import java.util.Scanner;
class shape
{
 int side;
 void get()
  {
System.out.println("enter the side of shape");
 Scanner sc=new Scanner(System.in);
 side=sc.nextInt();
  }
 void display()
  {
    System.out.println("side is="+side);
  }
 void area()
  {
    System.out.println("area of square="+(side*side));
  }

}

class demo
 { 
public static void main(String[] args)
  {
  shape sc=new shape();
  sc.get();
  sc.display();
  sc.area();
  }
 }

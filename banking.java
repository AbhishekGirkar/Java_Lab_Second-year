import java.util.Scanner;
class bank
{ int acc_no;
  float balance;
  String name;
  bank()
  {
    System.out.println("Constructor Executed");
    balance= 10000;
  }
  Scanner sc= new Scanner(System.in);

  void getdata()
 { 
   System.out.println("enter your name");
   name= sc.nextLine();
   System.out.println("enter account number");
   acc_no= sc.nextInt();
 }
  void displaydata()
 {
   System.out.println("Name="+ name);
   System.out.println("Accout number="+ acc_no);
   System.out.println("Balance="+ balance);
 }
  void withdraw()
 { 
  
   float x;
   System.out.println("Enter amount to withdraw\n");
   x= sc.nextFloat();
   balance= balance - x;
   System.out.println("Balance after withdrawal="+ balance);
 }
  void deposit()
 { 
    
   float y;
   System.out.println("Enter amount to deposit\n");
   y=sc.nextFloat();
   balance= balance + y;
   System.out.println("Balance after deposit="+ balance);
 }
  void interest()
 { float interest_rate=1.5f;
   balance = balance + balance*interest_rate;
   System.out.println("balance after adding interest="+ balance);
 }
}
 
 
class banking
{ public static void main(String args[])
  {  
    Scanner sc= new Scanner(System.in);
    int n;
    bank b1=new bank();
         b1.getdata();
         b1.displaydata();
    System.out.println("1-withdraw cash \n 2-deposit cash\n 3-interest balance ");
    System.out.println("Enter your choice");
    n= sc.nextInt();
       
    switch(n)
    {
      case 1: b1.withdraw();
              break;
      case 2: b1.deposit();
              break;
      case 3: b1.interest();
              break;
    }
  } 
}









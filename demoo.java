import java.util.Scanner;
class person
{
 int no;
public void get()
 {
System.out.println("enter you UID");
 Scanner sc=new Scanner(System.in);
 no=sc.nextInt();
System.out.println("enter you name ");
String  s2=sc.nextLine();
 }
void display( String s2, int no )
 {
System.out.println("name of person is" +s2);
System.out.println("person  UID No."+no);
 }
}
class student extends person
 {
 int stud_id;
void getdetail()
 { 
String stud_id;
System.out.println(" Student ID No:");
   Scanner st=new Scanner(System.in);
   stud_id=st.next();
 }
public void put()
 {
System.out.println("identification of student is"+stud_id);
 }
}

class demoo
 {
 public static void main(String[] args)
  {
   person s1=new person();
   s1.get();
   s1.display(String  , int  );
   
  }
 }

  


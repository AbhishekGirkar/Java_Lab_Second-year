import java.util.Scanner;
class Str
{
public static void main (String arg [])
{
Scanner sc= new Scanner(System.in);
String s1,s2,s3;
System.out.println("Enter the First name");
s1= sc.nextLine();
System.out.println("Enter the Last name");
s2= sc.nextLine();
System.out.println("Enter the Middle name");
s3= sc.nextLine();
System.out.printf("First name contained   %d   character\nLast name contained  %d   character\nMiddle  name contained   %d  character\n",s1.length(),s2.length(),s3.length());
System.out.println("You name is "+(s1.concat(s2)));
System.out.println("You Full name is "+(s2.concat(  s1.concat(  s3))));
String s4= "  "+s1+"  "+s3+"  "+s2+"    ";
System.out.println(s4);
System.out.println("Lower case:"+s4.toLowerCase());
System.out.println("Upper case:"+s4.toUpperCase());
System.out.println("Do you want to change your first name");
System.out.println("Press 1 to chaange your first name");
int ch=sc.nextInt();
if(ch==1){
System.out.println("enter the First name");
String s5= sc.next();
System.out.println(s4.replace(s1,s5));
s4=s4.replace(s1,s5); 
System.out.println("Lower case:"+s4.toLowerCase());
System.out.println("Upper case:"+s4.toUpperCase());
System.out.println("Trim :"+s4.trim());
}
String s6 ;
System.out.println("enter word to check pallindrome");
s6=sc.next();
String reverse;
reverse = new StringBuilder(s6).reverse().toString();
if( s6.equals(reverse))
System.out.printf("%s IS PALLINDROM",s6);
else
System.out.printf("%s isnot PallindroMe",s6);
}
}



import java.util.Scanner;

public class reverse{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
      String a= sc.next();
      char[] b= a.toCharArray();
      for (int i = b.length-1;i>=0;i--) 
     System.out.print(b[i]);
   }
}

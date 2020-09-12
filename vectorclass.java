import java.util.*;
import java.util.Vector;
class vectorclass
{
 public static void main(String args[])
 {
  Vector list = new Vector();
  int l = args.length;
  for (int i=0; i < l; i++)
  {
   list.addElement(args[i]);
  }
  list.insertElementAt("Bintu",2);
  int s = list.size();
  String larr[]=new String[s];
  list.copyInto(larr);
        
  System.out.println("List of Elements");
  for (int i=0; i < s; i++)
  {
   System.out.println(larr[i]);
  }
 }
} 
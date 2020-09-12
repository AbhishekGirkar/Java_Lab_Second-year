class sq
{
int side;
sq()
{
System.out.println("Constructor is exicuted");
side=5;
}
void display()
{
System.out.println("Side="+side);
}
void area()
{
System.out.println("Area="+(side*side));
}
}
class constructr
{
public static void main(String args[])
{
sq s=new sq();
s.display();
s.area();
}
}
class alpha extends Thread
{
public void run()
{
for(char i = 65; i<=74; i++)
{
System.out.println(i);
try{
Thread.sleep(1000);
//Change this Value if u don't get desired output
} catch(InterruptedException e){}
}
}
}
class digit extends Thread
{
public void run()
{
for(int i=1; i<=10; i++)
{
System.out.println(i);
try{
Thread.sleep(1000);
//Change this Value if u don't get desired output
} catch(InterruptedException e){}
}
}
}
public class multithreadpattern
{
public static void main(String[] args)
{
digit a = new digit();
alpha b = new alpha();
a.start();
b.start();
try
{
a.join();
b.join();
}catch(InterruptedException e){}
}
}
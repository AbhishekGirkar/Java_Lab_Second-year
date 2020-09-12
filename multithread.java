class A extends Thread
{
    public void run()
    {
        for(char i=65;i<=74;i++)
        {
            System.out.printf("%c",i);
         try
          {
            Thread.sleep(1000);
          }
         catch(InterruptedException e){}

        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d",i);
        try
          {
            Thread.sleep(1000);
          }
         catch(InterruptedException e){}
        }
    }
}

class multithread
{
    public static void main(String a[])
    { 
        A x= new A();
        B y= new B();

        x.start();
        y.start();

        try
        {
         x.join();
         y.join();
         }catch(InterruptedException e){}
    }
}
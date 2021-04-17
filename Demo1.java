class Mythread extends Thread
    {
  public void run()
    {     
    int i;
	System.out.println ("The first 10 natural numbers are:\n");
	for (i=1;i<=10;i++)
	{      
		System.out.println (i);
	}
System.out.println ("\n");
try
{
Thread.sleep(2000);
}
catch(InterruptedException ie)
{
ie.printStackTrace();
}
}
}
class Demo1
{
public static void main(String args[])
{
Mythread obj=new Mythread();
Thread t1=new Thread(obj);
t1.start();
}
}




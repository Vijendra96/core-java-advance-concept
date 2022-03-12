package pack2;
class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(1 + " : " + a1.getState());
		a1.start();
		System.out.println(2 + " : " + a1.getState());
		Util.sleep(10000);
		System.out.println(3 + " : " + a1.getState());
	}
}

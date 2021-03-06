package pack2;
class C extends Thread
{
	public synchronized void run()
	{
		System.out.println("run begin");
		try
		{
			wait();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("run end");
	}
}
public class M4 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.start();
		Util.sleep(5000);
		System.out.println(c1.getState());
		synchronized (c1) {
			c1.notify();
		}
	}
}

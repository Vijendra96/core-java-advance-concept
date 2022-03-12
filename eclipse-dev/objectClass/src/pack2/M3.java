package pack2;

class B extends Thread
{
	@Override
	public void run() {
		System.out.println("B thread started");
		Util.sleep(10000);
		System.out.println("B thread execution got over");
	}
}

public class M3 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		Util.sleep(5000);
		System.out.println(b1.getState());
	}
}

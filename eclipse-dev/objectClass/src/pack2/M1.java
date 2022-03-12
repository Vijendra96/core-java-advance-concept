package pack2;

public class M1 {
	public static void main(String[] args) {
		Thread.State[] states = Thread.State.values();
		for(Thread.State state : states)
		{
			System.out.println(state);
		}
	}
}

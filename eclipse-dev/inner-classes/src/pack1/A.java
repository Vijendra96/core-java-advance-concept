package pack1;

public class A { // outer class can not be static, outer class can be only default and public 
	
	
	class B
	{
		
	}
	static class C //but inner class can be static.
	{
		
	}
	private class D{ //outer class can not be private but inner class should be
		
	}
	protected class E
	{
		
	}
	public static void main(String[] args) {
		System.out.println("done..");
	}
}
 // 


//class inside class is called inner class
//inner class within any access level.inner class even static also

//	interview question: 
//outer class can not be static, private or protected.
//outer class can be only default and public
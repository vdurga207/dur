package pack1;

public class Outer {
	int a;
	private class Inner{
	void print()
	{
		System.out.println("hai");
	}
	}
	class Act
	{
		public void Durga()
		{
			System.out.println("Durga");
		}
	}
	void dispay_Ineer()
	{
		Inner x=new Inner();
		Act a=new Act();
		x.print();
		a.Durga();
	}
	
	public static void main(String[] args) {
	Outer y=new Outer();
y.dispay_Ineer();

	}

}

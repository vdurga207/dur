package pack1;
class Pack
{
	void sum(String x,String y)
	{
		System.out.println("sum="+(x+y));
	}
}
class Pack1
{
	void sub(int a, int b)
	{
		System.out.println("sub="+(a-b));
	}
}
public class F4 {

	public static void main(String[] args) {
		Pack i=new Pack();
		Pack1 j=new Pack1();
		i.sum("Durga", "Verrla");
		j.sub(50, 10);
	}

}

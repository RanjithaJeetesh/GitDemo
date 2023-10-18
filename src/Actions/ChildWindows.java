/*package Actions;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
class Sample1
{
	void test()
	{
		System.out.println("Inheritancce concept");
	}
	void test2()
	{
		System.out.println("Inheritancce concept2");
	}
	static void test3()
	{
		System.out.println("Inheritancce concept2");
	}
}
class Inheritance extends Sample1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample1 s1=new Sample1();
		s1.test();
		s1.test2();
		test3();
	}
}

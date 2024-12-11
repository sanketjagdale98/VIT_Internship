package sel3;

//
//abstract class  Test
//{
//
//	public static void main(String[] args)
//	{
//		System.out.println("Hi all, welcome to VITTech solution");
//	}
//
//}
//







interface It
{
	void test();
	interface It1
	{
		void test1();
	}
}

class Test implements It
{

	public void test()
	{
		System.out.println("test() method implt");
	}

	public static void main(String[] args)
	{
		It it = new Test();
		it.test();
	}
}


/*

1.4（打印表格）编写程序，显示以下表格：

	a     a^2     a^3
	1      1      1
	2      4      8
	3      9      27
	4      16     64

 */

public class Test4
{
	public static void main(String[] args)
	{
		System.out.println("a     a^2     a^3");

		int a;
		int a2;
		int a3;

		for(a=1;a<5;a++)
		{
			a2=a*a;
			a3=a*a*a;

			System.out.println(a+"     "+a2+"     "+a3);
		}
		
	}
}
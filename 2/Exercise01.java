public class Exercise01
{
	public static void main(String[] args)
	{
		long l=2147483648L;
		int i1=011;//八进制表示
		int i2=0xffff;//十六进制表示

		float f1=100.2f;
		double d1=100.2d;

		System.out.println(l);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(d1);

		System.out .println("1.0 / 3.0 is " + 1.0 / 3.0);
		System.out .println("1.0F / 3.0F is " + 1.0F / 3.0F);
	}
}
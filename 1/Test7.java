/*

1.7（近似求π）可以使用以下公式计算π
	π = 4 x (1-1/3+1/5-1/7+1/9-1/11+1/13+...)

	编写程序，显示4 x (1-1/3+1/5-1/7+1/9-1/11+1/13+...)的结果。在程序中用1.0代替1.

 */

public class Test7
{
	public static void main(String[] args)
	{
		double p=0;
		double sum=0;

		for(int n=0;n<2097483647;n++)
		{
			if(0==(n+1)%2)
			{
				p-=1.0/(2*n+1);
			}
			else
			{
				p+=1.0/(2*n+1);
			}
		}
		System.out.println(p);

		sum=4*p;

		System.out.println(sum);
	}
}
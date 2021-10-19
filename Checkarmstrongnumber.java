package oct19_21;

public class Checkarmstrongnumber {
	public static void main(String[] args)
	{
		int no=153;
		int no1 = no;
		int arm=0;
		do
		{
			int rem = no%10;
			arm = arm+(rem*rem*rem);
			no = no/10;
		}
		while(no>0);
		{
			System.out.println(arm);
		}
		if(no1==arm)
		{
			System.out.println("It is an armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
		}

}

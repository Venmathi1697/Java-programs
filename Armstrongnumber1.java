package oct19_21;

public class Armstrongnumber1 {
	public static void main(String[] args)
	{
		int no=153;
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
	}

}

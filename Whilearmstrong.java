package oct19_21;

public class Whilearmstrong {
	public static void main(String[] args)
	{
		int no=153;
		int arm=0;
		while(no>0);
		{
			int rem = no%10;
			arm = arm+(rem*rem*rem);
			no = no/10;
		}
			System.out.println(arm);
		
		
		
	}

}

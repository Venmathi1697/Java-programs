package Bank.icici.debit;

public class Printing1_3_4_8_15_27 {
	public static void main(String[] args)
	{
		
		Printing1_3_4_8_15_27 obj=new Printing1_3_4_8_15_27();
		obj.printing();
		
	}
	void printing()
	{
		int i=1;
		int j=3;
		int k=4;
		int sum;
		
		System.out.print(i+" ");
		System.out.print(j+" ");
		System.out.print(k+" ");
		while(k<=50)
		{
			sum=i+j+k;
		System.out.print(sum+ " ");
		i=j;
		j=k;
		k=sum;
		
		
		}
			
	}
}

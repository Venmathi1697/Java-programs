package LinearBinary;

public class Lb2 {
public static void main(String[] args)
{
	
	//to search 100
	int[] a= {10,20,30,40,50,60,67,68,80,90,100};
	//s=0,e=10,mid=5
	//here key is 100
	int key=100;
	int s=0,e=10;//if length is not known then e=a.length-1
	while(s<=e)//while(true) for(;s<=e;)
 {
	int mid=(s+e)/2;
	
	if(a[mid]==key)
	{
		System.out.println("The given number found");
		break;
	}
	else if(key>a[mid])
	{
		s=mid+1;
	}
	else
	{
		e=mid-1;
	}
	if(s>e)
	{
		System.out.println("the number not found");
	}
	}
}
}

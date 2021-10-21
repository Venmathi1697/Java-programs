public class Reverse
{
public static void main(String[] args)
{
int no =5678;
int rem=0;
while(no>0)
{
rem=(rem*10)+(no%10);

no=no/10;
}
System.out.println(rem);
	
}
}
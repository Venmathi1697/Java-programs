public class TV
{
String channelName;
int price;
public TV(String channelName,int price)
{
this.channelName = channelName;
this.price = price;
System.out.println(channelName);
System.out.println(price);	
}
public TV(int price,String channelName)
{
this.channelName = channelName;
this.price = price;
System.out.println(channelName);
System.out.println(price);	
	
}
public static void main(String[] args)
{
TV channel1 = new TV("sun Tv",100); //parameterised constructor
TV channel2 = new TV(150,"vijay Tv");
	
}
}
package lamda_expression;

import java.util.*;

public class Orders {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("Enter the order price");
		Scanner s=new Scanner(System.in);
		int  m=s.nextInt();
		
		if(m>10000) {
		OrdersSta a=()->System.out.println("COMPLETED");
		a.Status();}
		else {
			OrdersSta b=()->System.out.println("ACCEPTED");
			b.Status();
	}
		}
}
interface OrdersSta
{
void Status();	

}
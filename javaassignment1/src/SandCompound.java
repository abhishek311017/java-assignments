import java.lang.*;
import java.util.*;
public class SandCompound {
public static void main(String[] args)
{
	double  cInterest,sInterest, rate , principal ,year,c=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the rate");
	rate=sc.nextDouble();
	System.out.println("Enter the principal");
	principal=sc.nextDouble();
	System.out.println("Enter the year");
	year=sc.nextDouble();
	sInterest = (rate*principal*year)/100.0;
	c=(1+(rate/100.0));
	cInterest = principal*Math.pow(c,year);
	System.out.println("Simple interest :"+sInterest);
	System.out.println("Compound interest :"+cInterest);
	
	
}
}

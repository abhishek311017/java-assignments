import java.util.Scanner;

public class TaxIncome {
	public static void main(String[] args)
	{
		double ctc,tax;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your ctc :");
		ctc=sc.nextDouble();
		if(ctc>=0 && ctc<=180000)
			System.out.println("no need to pay the tax");
		else if(ctc>=181001 && ctc<=300000)
			System.out.println("your incometax :"+0.1*ctc);
		else if(ctc>=300001&&ctc<=500000)
			System.out.println("your incometax :"+0.2*ctc);
		else if(ctc>=500001&&ctc<=1000000)
			System.out.println("your incometax :"+ (0.3*ctc));
		
	}
	
}

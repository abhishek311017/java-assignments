import java.util.Scanner;

public class Great {
	public static void main(String[] args) {
		int hin,eng,ben;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the hindi marks");
		hin=sc.nextInt();
		System.out.println("Enter the english marks");
		eng=sc.nextInt();
		System.out.println("Enter the benagali marks");
		ben=sc.nextInt();
	if(hin>60&&eng>60&&ben>60)
		System.out.println("passed");
	else if((hin>60&&eng>60&&ben<60)||(hin>60&&ben>60&&eng<60)||(eng>60&&ben>60&&hin<60))
		System.out.println("promoted");
	else if((hin>60&&eng<60&&ben<60)||(hin>60&&ben<60&&eng<60)||(eng>60&&ben<60&&hin<60)||(eng<60&&ben<60&&hin<60))
		System.out.println("failed");
	}
	
}

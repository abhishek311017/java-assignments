import java.util.*;
public class Arms {
public static void main(String[] args) {
     int b=0, k, num ,sum=0;
     System.out.println("Enter a no.");
	Scanner sc = new Scanner(System.in) ;
	num=sc.nextInt();
	k = num;
	while(num>0)
	{
		b=num%10;
		sum=sum + b*b*b;
		num=num/10;
	}
	if(k==sum)
	{ 
		System.out.println("good");
	}
	else {
		System.out.println("not");	
	}
	
}

}


public class Armsrange {
public static void main(String[] args) {
     int b, k, num=0 ,sum=0;
	
	for(int i=100;i<999;i++) {
		num=i;
	while(num>0)
	{
		b=num%10;
		sum=sum + b*b*b;
		num=num/10;
	}
	if(sum==i)
	

		System.out.println(sum);
	
	
	sum=0;
	}
	
}

}

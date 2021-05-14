package lamda_expression;
import java.util.*;



public class Operations {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first no.:");
	    int	a=s.nextInt();
	
	    System.out.println("Enter the second no.:");
	     int b=s.nextInt();
	    
	     Arithmatic addition=(x,y)->x+y;
	     Arithmatic subtraction=(x,y)->x-y;
	     Arithmatic multiplication=(x,y)->x*y;
	     Arithmatic division=(x,y)->{if(y==0)
	    	   return 0;
	       else
	    	   return x/y;
	       };
	       System.out.println("1.addition");
	       System.out.println("2.subtraction");
	       System.out.println("3.multiplication");
	       System.out.println("4.division");
	       System.out.println("5.exit");
	       System.out.println("Enter your choice:");
		     int m=s.nextInt();
	       
	     switch(m) 
	     {
      case 1:
       System.out.println("Addition:"+addition.operation(a,b));
       break;
      case 2: 
       System.out.println("Subtraction:"+subtraction.operation(a,b));
       break;
      case 3: 
       System.out.println("Multiplication:"+multiplication.operation(a,b));
       break;
      case 4 : 
    	  
       System.out.println("Division:"+division.operation(a,b));
       break;
      case 5 : System.exit(0);
      
      default :
    	  System.out.println("ivalid input!!");
    	  break;
	     }
	
	}

}
interface Arithmatic{
	double operation(double a,double b);
}

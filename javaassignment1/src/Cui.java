import java.util.*;

public class Cui {
	public static void main(String[] args) {
    String  rid="Abhi2";
    String pass,id;
    String rpass="a1b2h8i9";
    int k=0, i=3;
    Scanner sc= new Scanner(System.in);
	//System.out.println("Enter the hindi marks");
	while (i>0)
	{
		System.out.println("Enter the id");
		id=sc.nextLine();
		System.out.println("Enter the password");
		pass=sc.nextLine();
	if(rid.equals(id)&&rpass.equals(pass))
		{
			k=1;
			break;
		}

			System.out.println("you have enter wrong password or id try again ");
			i--;
	}
	
	if(k==1)
	{
		System.out.println("Welcome!");
	}
	else if(i==0)
	{
		System.out.println("contact admin");
		System.exit(1);
	}
	}
	}

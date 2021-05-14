package Question4;

import java.util.ArrayList;

public class Lambdafour {

	public static void main(String[] args) {
		
	
	ArrayList<String>na=new ArrayList<String>();
	
	na.add("Sunita");
	na.add("Abhishek");
	na.add("Ankan");
	na.add("Suman");
	na.add("Nilima");
	na.add("Rima");
	
	System.out.println(na);
	
	na.removeIf(t->(t.length()%2==1));
	System.out.println(na);
	
	 na.stream()
	.filter(p->(p.length()%2==1))
	.forEach(p->System.out.println("\n"+p));

	
	}
	
}

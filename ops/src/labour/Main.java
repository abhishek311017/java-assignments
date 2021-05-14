package labour;

public class Main {
	 public static void main(String[] args) {
		 Manager m1=new Manager(1,"Amit" ,30000);
		 Manager m2=new Manager(2,"Ashwin" ,50000);
		 Labour l1=new Labour(1,"Arpit" ,20000);
		 Labour l2=new Labour(2,"John" ,15000);
		 System.out.println(l1.getSalary()+l2. getSalary()+m1.getSalary()+m2.getSalary());
	 }
	 

}

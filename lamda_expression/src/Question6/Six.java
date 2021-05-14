package Question6;

import java.util.ArrayList;
import java.util.List;

public class Six {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("abhi");
	l.add("babi");
	l.add("rohit");
	l.add("leena");
	l.add("suresh");
	l.add("ramesh");
	l.replaceAll(n->n.toUpperCase());
	l.forEach(System.out::println);
	
}
}

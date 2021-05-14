package collection_framework;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayL {
	public static  void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(4);
		a.add(5);
		a.add(3);
		a.add(253);
		a.add(523);
		ListIterator<Integer> it=a.listIterator(a.size());
	while(it.hasPrevious()) {
		
		System.out.println(it.previous());}
		
		
	}

}

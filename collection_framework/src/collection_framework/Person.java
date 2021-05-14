package collection_framework;
import java.util.*;

public class Person {
	String name;
	double weight;
	double height;
	public Person(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
}
class MyCom implements Comparator<Person>
{
	
public int  compare(Person a,Person b)
{
Person per1=(Person)a;
Person per2=(Person)b;
if(per1.getWeight()==per2.getWeight())
	return (int) (per1.getHeight()-per2.getHeight());
else if(per1.getWeight()<per2.getWeight())
	return (-1);
else
	return (1);
}
}

class Main
{
public static void main(String [] args)
{
Person p1,p2,p3;
p1=new Person("Rahul",56.2,5.6);
p2=new Person("Rahul",56.2,6.6);
p3=new Person("Rahul",50.0,5.8);
TreeSet<Person> t= new TreeSet<Person>(new MyCom());

t.add(p1);
t.add(p2);
t.add(p3);
Person p;
Iterator<Person> it=t.iterator();
while(it.hasNext())
{
	p=it.next();
	
	System.out.println( p.getName()+","+p.getWeight()+","+p.getHeight());
}
}
}
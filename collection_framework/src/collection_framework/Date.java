package collection_framework;
import java.util.*;


public class Date {
    private Integer day;
    private Integer month;
    private Integer year;
    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
           }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

 
        
    }

class Emp {
    private String name;
    public Emp(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) 
    {
        Emp e1 = new Emp("sima");
        Emp e2 = new Emp("sila");
        Emp e3 = new Emp("sikha");
        Date d1 = new Date(1, 11, 1998);
        Date d2 = new Date(1, 11, 2000);
        Date d3 = new Date(2, 12, 1998);
        Map<Date,Emp>  m1 = new HashMap<Date,Emp>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
      System.out.println(m1);
    }}
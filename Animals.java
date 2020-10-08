import java.util.ArrayList;
import java.util.List;

public class Animals implements Comparable<Animals>{
	String name;
	int age;
	String sex;
	String kind;
	public Animals(String name, String kind,int age,String sex) {
		this.age=age;
		this.name=name;
		this.sex=sex;
	}
	public int compareTo(Animals o) {
		if(this.age>o.age) {
			return 1;
		}else if(this.age<o.age) {
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
	}
}

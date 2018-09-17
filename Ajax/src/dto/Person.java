package dto;

public class Person {
	private String name = "Alice"; 
	private int age;
	
	String addr;
	public transient String phone; 
	 
	@Override
	public String toString() {
		return "Person(name="+name+ ", age="+age+", addr="+ addr+ ", phone="+ phone +")";
	}
}

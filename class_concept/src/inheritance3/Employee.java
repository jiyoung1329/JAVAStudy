package inheritance3;

public class Employee{
	/* PartTime, Permanent 두 클래스에 부모 클래스로 만들어주세요. */
	
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

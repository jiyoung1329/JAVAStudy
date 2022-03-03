package inheritance9;

// 추상 클래스 : 추상 메소드를 갖고 있는 클래스
public abstract class Employee{
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
	// 추상 메소드 : 메소드 내용이 없는 상태, 자식에게 강제로 구현이 되도록 만드는 효과를 갖음.
	public abstract int getSalary();
}

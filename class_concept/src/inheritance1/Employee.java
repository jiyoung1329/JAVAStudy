package inheritance1;

public class Employee extends Person{
	private String dept;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void info() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("부서 : " + getDept());
	}
}

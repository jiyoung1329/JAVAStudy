package constructor;

/*
 * Permanent
 * 멤버 변수 : 이름(name), 급여(salary)
 * 멤버 메소드 : getter
 * 2개의 멤버변수에 데이터 초기화를 위한 생성자
 */
public class Permanent {
	String name;
	int salary;
	
	public Permanent() {}
	
	public Permanent(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

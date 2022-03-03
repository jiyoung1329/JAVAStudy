package inheritance9;
/*
 * Permanent
 * 멤버 변수 : 이름(name), 급여(salary)
 * 멤버 메소드 : getter
 * 2개의 멤버변수에 데이터 초기화를 위한 생성자
 */
public class Permanent extends Employee{
	private int salary;
	
	public Permanent(String name, int salary) {
		super(name);
//		setName(name);
		this.salary = salary;
	}
	@Override
	public int getSalary() {
		return salary;
	}
}

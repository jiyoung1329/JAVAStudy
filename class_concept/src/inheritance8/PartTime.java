package inheritance8;

/*
 * PartTime 
 * 멤버 변수 : 이름(name), 시간(time), 시급(pay)
 * 멤버 메소드 : getter, getSalary(시간*시급)
 * 3개의 멤버변수에 데이터 초기화를 위한 생성자
 */
public class PartTime extends Employee{
	private int time;
	private int pay;

	public PartTime(String name, int time, int pay) {
		super(name);
//		super.setName(name);
		this.time = time;
		this.pay = pay;
	}

	@Override
	public int getSalary() {
		return time * pay;
	}

	public int getTime() {
		return time;
	}

	public int getPay() {
		return pay;
	}

}

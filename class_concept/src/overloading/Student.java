package overloading;

public class Student {
	private String name;
	private int kor, eng, math, total;
	private double average;
	/*
	 * 생성자 오버로딩(overloading)
	 *  - 같은 이름으로 여러 기능을 구현할 경우
	 *  - 같은 이름이기에 구분 짓는 요소
	 *    - 매개변수 개수
	 *    - 매개변수 개수가 한 개 이상 동일한 경우 자료형으로 구분
	 *    - 매개변수 개수가 두 개 이상 동일한 경우 자료형의 배치로 구분
	 */
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}
	public Student(int eng, String name) {
		this.name = name;
		this.eng = eng;
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		setTotal();
		return total;
	}
	private void setTotal() {
		total = kor + eng + math;
	}
	public double getAverage() {
		setAverage();
		return average;
	}
	private void setAverage() {
		this.average = total / 3.0;
	}
	
	
}

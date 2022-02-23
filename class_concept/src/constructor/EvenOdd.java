package constructor;

public class EvenOdd {
	private int data;
	/*
	 * 생성자 이름 : 클래스 이름과 동일하게 구성
	 * 메소드와 다른 점 : 반환자료형이 없다. 반환 데이터가 없다
	 * 생성자의 호출은 클래스를 인스턴스로 생성되면서 호출
	 * 기본 생성자 : 생성자를 명시하면 자동으로 만들지 않음
	 * 생성자를 명시하지 않으면 기본 생성자가 자동으로 생성됨.
	 */

	public EvenOdd(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}

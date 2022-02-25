package inheritance1;

public class Student extends Person{
	private String subject;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void info() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("과목 : " + getSubject());
	}
}

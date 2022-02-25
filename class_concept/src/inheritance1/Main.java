package inheritance1;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge(30);
		emp.setName("김변수");
		emp.setDept("교육부");
		emp.info();
		System.out.println();
		
		Professor pro = new Professor();
		pro.setAge(40);
		pro.setMajor("컴퓨터");
		pro.setName("이상수");
		pro.info();
		System.out.println();
		
		Student stu = new Student();
		stu.setAge(20);
		stu.setName("박참조");
		stu.setSubject("자바");
		stu.info();
	}
}

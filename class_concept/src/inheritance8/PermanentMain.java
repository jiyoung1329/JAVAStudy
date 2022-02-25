package inheritance8;

public class PermanentMain {
	public static void main(String[] args) {
		
		Department dept = new Department();
		
		Employee e1 = new Permanent("김변수", 3000000); // 업캐스팅
		Employee e2 = new Permanent("이상수", 4000000); // 업캐스팅
		Employee e3 = new Permanent("박참조", 5000000); // 업캐스팅
		Employee e4 = new PartTime("김파트", 160, 9000); // 업캐스팅
		Employee e5 = new PartTime("이파트", 160, 10000); // 업캐스팅
		Employee e6 = new PartTime("박파트", 160, 15000); // 업캐스팅

		dept.setEmp(e1);
		dept.setEmp(e2);
		dept.setEmp(e3);
		dept.setEmp(e4);
		dept.setEmp(e5);
		dept.setEmp(e6);
		
		dept.info();
	}
}














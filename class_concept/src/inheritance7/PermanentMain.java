package inheritance7;
import java.util.ArrayList;
public class PermanentMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Permanent("김변수", 3000000));
		emp.add(new Permanent("이상수", 4000000));
		emp.add(new Permanent("박참조", 5000000));
		emp.add( new PartTime("김파트", 160, 9000));
		emp.add( new PartTime("이파트", 160, 10000));
		emp.add( new PartTime("박파트", 160, 15000));

		PartTime pp = new PartTime("박파트", 160, 15000);
		Employee ee = new Employee("ddd");
		System.out.println(pp instanceof Employee);
		System.out.println(ee instanceof PartTime);
		for(Employee e : emp) {
			System.out.println("이름 : " + e.getName());
			// 여기서 e는 이미 업캐스팅 된 상태
			if(e instanceof Permanent) {
				Permanent p = (Permanent)e;
				System.out.println("급여 : " + p.getSalary()+"원");
			}else if(e instanceof PartTime){
				PartTime p = (PartTime)e;
				System.out.println("급여 : " + p.getSalary()+"원");
			}
		}
	}
}














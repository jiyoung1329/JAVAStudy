package constructor;

import java.util.Scanner;

public class PermanentMain {
	public static void main(String[] args) {
		// 3명의 이름, 급여 입/출력
		Scanner sc = new Scanner(System.in);
		PartTime[] permanents = new PartTime[3];
		
		int person = 3;
		String name;
		int time, pay;

		// 이름, 급여 입력
		for (int i=0; i<person; i++) {
			System.out.print("이름 : ");
			name = sc.next();
			time = inputSalary(sc, "시간 : ");
			pay = inputSalary(sc, "시급 : ");
			permanents[i] = new PartTime(name, time, pay);
			permanents[i].setSalary();
		}

		
		// 이름, 급여 출력
		for (int i=0; i<person; i++) {
			System.out.println((i+1) + ". 이름 : " + permanents[i].getName() + ",\t 급여 : " + permanents[i].getSalary() + "만 원");
			
		}
		
	}
	
	public static int inputSalary(Scanner sc, String inputPrint) {
		
		int num;
		
		while(true) {
			try {
				System.out.print(inputPrint);
				num = sc.nextInt();
				break;
				
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요.");
				sc.nextLine();
				continue;
			}
		}
		
		return num;
	}
}

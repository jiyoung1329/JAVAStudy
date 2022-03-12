package command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class CommandQuiz {
	private HashMap<String, String> map = new HashMap<String, String>();
	private Scanner sc = new Scanner(System.in);
	/*
	 * 1. 명령어 등록 : 한글 : 영어
	 * ex > 메모장 : notepad.exe
	 * 	 	계산기 : calc.exe
	 * 
	 */
	public void start() throws IOException {
		while(true) {
			System.out.println("1. 명령어 등록");
			System.out.println("2. 명령어 해재");
			System.out.println("3. 명령어 실행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			
			String menu = sc.next();
			sc.nextLine();
			switch(menu) {
			case "1" :
				commandRegist();
				break;
			case "2" :
				commandRelease();
				break;
			case "3" : 
				commandExecute();
				break;
			case "4" : 
				System.exit(0);
				break;
			default : 
				System.out.println("다시 입력해주세요");
			
			}
		}
	}
	
	public void commandRegist() {
		System.out.print("명령어를 입력하세요: ");
		String[] command = sc.nextLine().split(":");
		if (command.length == 2) {
			map.put(command[0].trim(), command[1].trim());
		} else {
			System.out.println("잘못입력하였습니다. ");
		}
		
	}
	public void commandRelease() {
		System.out.println("명령어를 입력해 주세요 : ");
		String command = sc.next();
		if (map.containsKey(command)) {
			map.remove(command);
			System.out.println(command + "명령어가 해제돠었습니다.");
		} else {
			System.out.println("없는 명령어입니다.");
		}
			
		}
	public void commandExecute() throws IOException {
		System.out.println("명령어를 입력해주세요 : ");
		String command = sc.next();
		if (map.containsKey(command)) {
			String cmd = map.get(command);
			ProcessBuilder pb = new ProcessBuilder(cmd);
			pb.start();
		} else {
			System.out.println("없는 명령어 입니다.");
		}
		
	}

}

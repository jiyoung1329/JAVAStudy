package command;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("명령어 : ");
		String command = sc.next();
		
		ProcessBuilder pb = new ProcessBuilder(command);
		pb.start();
	}
}

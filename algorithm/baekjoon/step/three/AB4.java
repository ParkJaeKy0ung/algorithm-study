package step.three;

import java.util.Scanner;

public class AB4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			
			System.out.println(sum);
		}
		sc.close();
	}
}
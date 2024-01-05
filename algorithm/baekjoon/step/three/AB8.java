package step.three;

import java.util.Scanner;

public class AB8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a, b;
		int sum = 0;
		
		for(int i=1; i<=t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a+b;
			
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, sum);
		}
		sc.close();
	}
}
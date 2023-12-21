package step.two;

import java.util.Scanner;

public class 오븐시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int M = 60 * A + B;
		M += C;
		
		int H = (M / 60) % 24;
		int min = M % 60;
		
		System.out.println(H + " " + min);
	}
}

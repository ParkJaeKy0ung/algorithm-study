package step.six;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int K = 1 - sc.nextInt();
		int Q = 1 - sc.nextInt();
		int R = 2 - sc.nextInt();
		int B = 2 - sc.nextInt();
		int N = 2 - sc.nextInt();
		int P = 8 - sc.nextInt();
		
		System.out.println(K + " " + Q + " " + R + " " + B + " " + N + " " + P);
	}
}
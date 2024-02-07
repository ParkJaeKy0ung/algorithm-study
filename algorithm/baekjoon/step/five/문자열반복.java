package step.five;

import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt(); // 각 문자를 R번 반복해
			String S = sc.next(); // 문자열 S를 입력받은 후
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
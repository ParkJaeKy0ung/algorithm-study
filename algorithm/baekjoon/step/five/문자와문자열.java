package step.five;

import java.util.Scanner;

public class 문자와문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int i = sc.nextInt() - 1;
		
		sc.close();
		System.out.println(st.charAt(i));
	}
}

package step.six;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		int len = str.length();
		int syso = 1; // 출력 기본값
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse(); // 문자열 역순으로 
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != sb.charAt(i)) { // 정방향 문자열과 역방향 문자열이 다르면
				syso = 0; // 출력 0
			}
		}
		
		System.out.println(syso);
	}
}
package step.eight;

import java.util.Scanner;

public class 진법변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int b = sc.nextInt();
		
		long result = 0;
		int idx = 0; 
		int num = 0;
		
		for(int i=n.length()-1; i>=0; i--) {
			char ch = n.charAt(i);
			
			if(ch>='0' && ch<='9') {
				num = ch - '0'; // 0~9 사이는 그대로 출력
			}
			else {
				num = ch - 55; // A~Z는 숫자로 변경
			}
			
			result += num * Math.pow(b, idx++);
		}
		System.out.println(result);
	}
}

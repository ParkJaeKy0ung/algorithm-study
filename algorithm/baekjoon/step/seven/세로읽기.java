package step.seven;

import java.util.Scanner;

public class 세로읽기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 5줄 총 15개 2차원 배열 선언
		char[][] str = new char[5][15];
		
		// 입력받은 문자들 그대로 출력
		String input = "";
		for(int i=0; i<str.length; i++) {
			input = sc.next();
			
			// 15개 문자 넣기
			for(int j=0; j<input.length(); j++) {
				str[i][j] = input.charAt(j);
			}
		}
		
		// 세로로 출력
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(str[j][i] == '\0') { // 빈 문자열이면 출력하지 않음
					continue;
				}
				System.out.print(str[j][i]);
			}
		}
	}
}

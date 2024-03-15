package step.seven;

import java.util.Scanner;

public class 세로읽기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 5줄 총 15개 2차원 배열 선언
		char[][] charArr = new char[5][15];
		
		// 입력받은 문자들 그대로 출력
		for(int i=0; i<5; i++) {
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++) {
				charArr[i][j] = str.charAt(j);
			}
		}
		
		// 세로로 출력
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(charArr[j][i] == ' ' || charArr[j][i] == '\0') {
					continue;
				}
				System.out.println(charArr[j][i]);
			}
		}
	}
}

package step.nine;

import java.util.Scanner;

public class 소수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			
			// 소수인 경우 true, 아닌 경우 false
			boolean sosu = true;
			
			int num = sc.nextInt();
			
			// 1은 소수가 아니므로 다음 반복문으로
			if(num == 1) continue;
			
			// 약수인지 확인
			for(int j=2; j<num; j++) {
				if(num%j == 0) {
					sosu = false; // 소수가 아닌 경우 false로 바꿔줌
					break;
				}
			}
			
			// 소수인 경우 count 값 1 증가
			if(sosu) count++; 
		}
		
		System.out.println(count);
	}
}

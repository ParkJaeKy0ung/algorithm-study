package step.nine;

import java.util.Scanner;

public class 소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // M 이상
		int N = sc.nextInt(); // N 이하의 자연수 중
		
		int sum = 0; // 소수의 합
		int min = N; // 소수 중 최솟값
		
		for(int i=M; i<=N; i++) {
			
			// 소수인지 판별
			boolean sosu = true;
			
			// 1은 소수가 아님
			if(i == 1) sosu = false;
			
			// 소수가 아니라면 반복 종료
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					sosu = false;
					break;
				}
			}
			
			// 소수라면 sum에 합하고, 최솟값 저장
			if(sosu) {
				if(min>i) min = i;
				sum += i;
			}
		}
		
		if(sum == 0) { // 소수가 없을 경우 -1 출력
			System.out.println(-1);
			
		}else { // 첫째 줄에 합, 둘째 줄에 최솟값 출력
			System.out.println(sum + "\n" + min);
		}
	}
}

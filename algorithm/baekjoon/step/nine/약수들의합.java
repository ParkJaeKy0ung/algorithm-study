package step.nine;

import java.util.Scanner;

public class 약수들의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			/* 입력의 마지막엔 -1이 주어진다. */
			if(n == -1) break;
			
			int[] arr = new int[n]; // 약수 담는 배열
			int sum = 0;
			
			/* 완전수일 경우 */
			for(int i=1; i<=n; i++) {
				if(n%i == 0) {
					arr[i-1] = i;
					sum += i;
				}
			}
			
			/* 완전수가 아닐 경우 */
			if(sum == n) {
				for(int i=0; i<n; i++) {

				}
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}

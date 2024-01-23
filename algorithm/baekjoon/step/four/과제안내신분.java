package step.four;

import java.util.Scanner;

public class 과제안내신분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31]; // 0~30 (31개)
		 
		for(int i=1; i<29; i++) { // 1~28 과제 제출
			int n = sc.nextInt();
			arr[n] = 1;
		}
		
		for(int i=1; i<arr.length; i++) { // 전체 1~30 중에
			if(arr[i] != 1) System.out.println(i); // 1이 아닌 경우 출력
		}
		
		sc.close();
	}
}
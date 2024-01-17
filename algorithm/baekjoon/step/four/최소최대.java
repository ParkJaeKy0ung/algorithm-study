package step.four;

import java.util.Scanner;

public class 최소최대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N]; // 배열 생성
		
		for(int i=0; i<N; i++) { // 배열 초기화
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int j=0; j<arr.length; j++) { // 배열 길이만큼 반복문 돌면서
			if(arr[j] < min) { // 현재 min보다 작은 값이 있으면
				min = arr[j];  // 그 값을 min에 대입
			}

			if(arr[j] > max) { // 현재 max보다 큰 값이 있으면
				max = arr[j];  // 그 값을 max에 대입
			}
		}
		System.out.println(min + " " + max);
	}
}
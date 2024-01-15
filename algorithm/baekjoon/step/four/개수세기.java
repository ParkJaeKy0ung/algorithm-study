package step.four;

import java.util.Scanner;

public class 개수세기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int count = 0; // 정수 v 몇 개?
//		int v = sc.nextInt(); // 입력한 정수 v (위치에 따라 결과 바뀌는 이유***)
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt(); // arr 배열에 N개의 정수 입력
		}
		int v = sc.nextInt(); // 입력한 정수 v
		
		for(int j=0; j<arr.length; j++) { // arr 배열의 길이만큼 반복문 돌려서
			if(v==arr[j]) { // 변수 v와 같은 수 찾으면
				count++; // 변수 count 값 1씩 증가
			}
		}
		
		System.out.println(count);
	}
}
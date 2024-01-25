package step.four;

import java.util.Scanner;

public class 바구니뒤집기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 총 N개
		int M = sc.nextInt(); // M번 바구니 순서 역순으로 변경
		int[] arr = new int[N]; // 바구니 배열
		
		for(int i=0; i<N; i++) { // 바구니 1번부터 N번까지 번호 부여
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			int I = sc.nextInt() - 1; // i번째 바구니부터
			int J = sc.nextInt() - 1; // j번째 바구니까지
			
			while(I < J) { // ~~~ 공부 다시 ~~~
				int temp = arr[I];
				arr[I++] = arr[J];
				arr[J--] = temp;
			}
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) { // 바구니 번호 출력
			System.out.print(arr[i] + " ");
		}
	}
}
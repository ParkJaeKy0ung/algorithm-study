package step.four;

import java.util.Scanner;

public class 공넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니, 공 여러개 // 바구니에는 공이 하나씩만
		int M = sc.nextInt(); // 공 넣는 횟수
		int[] arr = new int[N]; // N개 만큼의 바구니에 들어있는 숫자 배열
		
		for(int i=0; i<M; i++) {
			int I = sc.nextInt(); // I번 바구니부터
			int J = sc.nextInt(); // J번 바구니까지에
			int K = sc.nextInt(); // K번 번호가 적혀있는 공을 넣는다
			
			for(int j=I-1; j<J; j++) { // I번 바구니부터 J번 바구니까지에
				arr[j] = K; // K번 번호가 적혀있는 공을 넣는다
			}
		}
		sc.close();
		
		for(int k=0; k<arr.length; k++) { // 바구니에 들어있는 숫자 출력
			System.out.print(arr[k] + " ");
		}
	}
}
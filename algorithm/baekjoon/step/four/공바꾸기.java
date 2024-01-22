package step.four;

import java.util.Scanner;

public class 공바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 갯수
		int M = sc.nextInt(); // 공 변경 횟수
		int[] arr = new int[N]; // 바구니 속 공 숫자 배열
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) { // M번 공 교환
			int I = sc.nextInt(); // I번 바구니
			int J = sc.nextInt(); // J번 바구니
			
			int temp = arr[I-1]; // 임의의 상자에 I번 공 옮기기
			arr[I-1] = arr[J-1]; // J번 공은 I번으로
			arr[J-1] = temp; // 임의의 상자에 들어있던 I번 공은 J번으로
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

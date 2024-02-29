package step.seven;

import java.util.Scanner;

public class 최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9]; // 배열 생성
		int max = 0; // 최댓값
		int x = 1; // 행 
		int y = 1; // 행
		
		for(int i=0; i<9; i++) { // 배열 초기화
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
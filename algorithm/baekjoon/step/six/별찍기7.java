package step.six;

import java.util.Scanner;

public class 별찍기7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		/* 1~5번째 줄 (" " 감소, "*" 증가) */
		for(int i=1; i<n+1; i++) { // (i=1,2,3,4,5)
//			for(int j=n-1; j<0; j--) {
//				System.out.print(" ");
//			}
			for(int j=0; j<n-i; j++) { // " " 출력 (j=4,3,2,1,0)
				System.out.print(" ");
			}
			for(int j=1; j<i*2; j++) { // "*" 출력 (j=1,3,5,7,9)
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* 6~9번째 줄 (" " 증가, "*" 감소) */
		for(int i=n-1; i>0; i--) { // (i=4,3,2,1)
			for(int j=1; j<=n-i; j++) { // " " 출력 (j=1,2,3,4)
				System.out.print(" ");
			}
			for(int j=1; j<i*2; j++) { // "*" 출력 (j=7,5,3,1)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
package step.three;

import java.util.Scanner;

public class forPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
//		int a, b;
//		int sum = 0;
//		
//		for(int i=1; i<=T; i++) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			sum = a+b;
			
			// A+B - 3
//			System.out.println(sum);
			
			// A+B - 7
//			System.out.printf("Case #%d: %d\n", i, sum);
			
			// A+B - 8
//			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, sum);
//		}
		
		
		// 일차원 배열 - 개수 세기
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		int count = 0;
//		
//		for(int i=0; i<N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int v = sc.nextInt();
//		
//		for(int j=0; j<N; j++) {
//			if(v==arr[j]) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		// 일차원 배열 - 최댓값
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int j=0; j<arr.length; j++) {
			count++;
			
			if(max < arr[j]) {
				max = arr[j];
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}
}


// A+B - 5
//int a = sc.nextInt();
//int b = sc.nextInt();
//int sum = 0;
//
//while(a!=0 && b!=0) {
//	sum = a+b;
//	System.out.println(sum);
//	
//	if(a==0 && b==0) {
//		System.out.println("finish");
//		break;
//	}
//}
//System.out.println();
//}

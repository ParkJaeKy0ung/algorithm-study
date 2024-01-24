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
//		int[] arr = new int[9];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		int max = 0;
//		int index = 0;
//		int count = 0;
//		
//		for(int j=0; j<arr.length; j++) {
//			count++;
//			
//			if(max < arr[j]) {
//				max = arr[j];
//				index = count;
//			}
//		}
//		System.out.println(max + "\n" + index);
		
		
		// 일차원 배열 - 공 넣기
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int[] arr = new int[N];
//		
//		for(int i=0; i<M; i++) {
//			int I = sc.nextInt();
//			int J = sc.nextInt();
//			int K = sc.nextInt();
//			
//			for(int j=I-1; j<J; j++) {
//				arr[j] = K;
//			}
//		}
//		sc.close();
//		
//		for(int k=0; k<arr.length; k++) {
//			System.out.print(arr[k] + " ");
//		}
		
		
		// 일차원 배열 - 공 바꾸기
//		int N = sc.nextInt(); // 바구니 총 N개
//		int M = sc.nextInt(); // M번 공 교환
//		int[] arr = new int[N]; // 바구니 공 배열
//		
//		for(int i=0; i<arr.length; i++) { // 바구니에 공 1개씩, 바구니 번호 = 공 번호
//			arr[i] = i+1;
//		}
//		
//		for(int i=0; i<M; i++) { // M번 공 교환
//			int I = sc.nextInt();
//			int J = sc.nextInt();
//			
//			int temp = arr[I-1]; 
//			arr[I-1] = arr[J-1];
//			arr[J-1] = temp;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		// 일차원 배열 - 과제 안 내신 분
		int[] arr = new int[31];
		
		for(int i=1; i<29; i++) {
			int n = sc.nextInt();
			arr[n] = 1;
		}
		
		for(int i=1; i<31; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		sc.close();
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

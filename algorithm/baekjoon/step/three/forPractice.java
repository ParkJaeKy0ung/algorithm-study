package step.three;

import java.util.Scanner;

public class forPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int a, b;
		int sum = 0;
		
		for(int i=1; i<=T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a+b;
			
			// A+B - 3
//			System.out.println(sum);
			
			// A+B - 7
//			System.out.printf("Case #%d: %d\n", i, sum);
			
			// A+B - 8
			System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, sum);
		}
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

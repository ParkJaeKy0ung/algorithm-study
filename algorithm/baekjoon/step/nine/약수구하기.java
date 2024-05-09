package step.nine;

import java.util.Scanner;

public class 약수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=p; i++) {
			if(p%i == 0) count++;
			
			if(count == q) {
				System.out.println(i);
				break;
			}
		}
		if(count < q) System.out.println(0);
	}
}

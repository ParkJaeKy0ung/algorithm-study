package step.four;

import java.util.Scanner;

public class X보다작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int j=0; j<N; j++) {
			if(X > arr[j]) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
package step.five;

import java.util.Scanner;

public class 문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			arr[i] = str.substring(0, 1) + str.substring(str.length()-1, str.length());
		}
		sc.close();
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
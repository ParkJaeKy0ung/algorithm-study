package step.ten;

import java.util.Scanner;

public class 대지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int xMin = x[0];
		int xMax = x[0];
		int yMin = y[0];
		int yMax = y[0];
		
		for(int i=0; i<n; i++) {
			if(xMin > x[i]) xMin = x[i];
			if(xMax < x[i]) xMax = x[i];
			
			if(yMin > y[i]) yMin = y[i];
			if(yMax < y[i]) yMax = y[i];
		}
		
		if(n==1) {
			System.out.println(0);
		}
		else {
			System.out.println((xMax-xMin) * (yMax-yMin));
		}
	}
}

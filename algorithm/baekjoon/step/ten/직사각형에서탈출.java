package step.ten;

import java.util.Scanner;

public class 직사각형에서탈출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int xMin = Math.min(x, w-x); // x축 최소거리
		int yMin = Math.min(y, h-y); // y축 최소거리
		
		// x축과 y축 최소거리 중 작은 값
		System.out.println(Math.min(xMin, yMin));
	}
}

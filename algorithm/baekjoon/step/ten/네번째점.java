package step.ten;

import java.util.Scanner;

public class 네번째점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 세 개의 점
		int[] a = {sc.nextInt(), sc.nextInt()};
		int[] b = {sc.nextInt(), sc.nextInt()};
		int[] c = {sc.nextInt(), sc.nextInt()};

		// 네 번째 점 x좌표, y좌표 변수
		int x;
		int y;
		
		/* x좌표 비교 */
		if(a[0] == b[0]) x = c[0]; 
		else if(a[0] == c[0]) x = b[0];
		else x = a[0];
			
		/* y좌표 비교 */
		if(a[1] == b[1]) y = c[1];
		else if(a[1] == c[1]) y = b[1];
		else y = a[1];
		
		System.out.println(x + " " + y);
	}
}

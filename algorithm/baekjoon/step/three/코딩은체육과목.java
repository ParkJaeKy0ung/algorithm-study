package step.three;

import java.util.Scanner;

public class 코딩은체육과목 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = "";
		
		for(int i=1;i<=n/4;i++) {
			str += "long ";
		}
		System.out.println(str + "int");
	}
}

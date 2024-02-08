package step.five;

import java.util.Scanner;

public class 상수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		a = Integer.parseInt(new StringBuffer().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuffer().append(b).reverse().toString());
		
		// StringBuffer().append(str) : str 데이터를 현재 문자열 끝에 추가
		// StringBuffer().append(str).reverse() : 역순으로 된 문자열 반환
		// StringBuffer().append(str).reverse().toString() : StringBuffer 타입 -> String 타입으로 변환
		
		System.out.println(a>b?a:b);
	}
}
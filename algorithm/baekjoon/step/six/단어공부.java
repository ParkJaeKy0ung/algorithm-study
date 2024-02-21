package step.six;

import java.util.Scanner;

public class 단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 영문자 26개
		String str = sc.next();
		
		sc.close();
		
		for(int i=0; i<str.length(); i++) {
			
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { // 대문자 범위
				arr[str.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가
				
			} else { // 소문자 범위
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+65); // 대문자로 출력해야 하므로 65를 더해준다.
				
			} else if(arr[i] == max) {
				ch = '?';
			} 
		}
		
		System.out.println(ch);
	}
}

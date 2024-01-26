package step.four;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지 {
	/* HashSet
	 * 1. 중복원소 허용하지 않음
	 * 2. 순서가 없음 (정렬 X)
	 *  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(sc.nextInt() % 42);
			// 입력받은 값의 나머지 값을 add메서드를 통해 HashSet에 저장
		}
		sc.close();
		System.out.println(hs.size());
		
//		int[] arr = new int[10];
//		int count = 0; // 서로 다른 값 개수
//		boolean bl; // n번째 나머지와 n+1번째 나머지 비교하기 위한 변수
//		
//		for(int i=0; i<arr.length; i++) { // 나머지값 배열에 초기화
//			arr[i] = sc.nextInt() % 42;
//		}
//		
//		for(int i=0; i<arr.length; i++) { // n번째 나머지와 n+1번째 나머지 비교
//			bl = false; // 기본값
//			
//			for(int k=i+1; k<arr.length; k++) {
//				if(arr[i] == arr[k]) {
//					bl = true;
//					break;
//				}
//			}
//			
//			if(bl == false) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}
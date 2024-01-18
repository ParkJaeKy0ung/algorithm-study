package step.four;

import java.util.Scanner;

public class 최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int max = arr[0];
		int count = 0;
		int index = 0;
		
		for(int j=0; j<arr.length; j++) {
			count++;
			
			if(max < arr[j]) {
				max = arr[j];
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}
}

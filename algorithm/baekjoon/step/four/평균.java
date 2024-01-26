package step.four;

import java.util.Scanner;

public class 평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 과목 개수
		double[] arr = new double[N]; // 각 과목 점수 배열
		
		double M = 0; // 최댓값
		double sum = 0; 
		double avg = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt(); // 과목 성적 입력

			if(M < arr[i])	M = arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (arr[i]/M) * 100;
			sum += arr[i];
		}
		sc.close();
		
		avg = sum / N;
		System.out.println(avg);
	}
}

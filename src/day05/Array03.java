package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열 생성 
		// 5명의 점수 입력받기 (0~100)
		// 합계와 평균을 출력
		// 입력 값의 범위가 벗어나면 다시 입력받기
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int score=0;
		
		for(int i=0; i<arr.length; i++) {
				System.out.println("점수 입력 >");
				int sum = scan.nextInt();
				// if를 쓰면 안되는 이유 > if는 조건을 한번만 확인
				while(sum < 0 || sum > 100) {
					System.out.println("점수가 벗어났습니다 다시 입력해주세요. >");
					sum = scan.nextInt();
				}
				arr[i] = sum;
				// System.out.println(arr[i]);
				score +=arr[i];
			}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총합계 : " +score);
		System.out.println("평균 :"+ (score / (double)arr.length));
		
		
		
		
		
		
		
		
		scan.close();

	}

}

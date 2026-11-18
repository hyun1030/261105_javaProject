package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤 0~100까지 숫자 입력
		// 합계 출력
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*101); 
			sum+=arr[i];
		}
		// 전체보기 비교, 연산 X
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum);
		
		// 비교, 연산 O
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------");
		// 향상된 for문
		// for(출력할리스트의자료형 임의변수값 : 리스트){ }
		// 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 처리문 실행
		// 원본 자체를 변경 X
		sum = 0;
		for(int tmp : arr) {
			System.out.println(tmp);
			if(tmp>=60) {
				sum+= tmp;
			}
		}
		
		scan.close();

	}

}

package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100까지 랜덤수를 배열에 저장 => 출력
		// 합계, 평균, 최대값, 최소값 출력 max/min/for문(향상된)
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*101);
			sum +=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : " + +(sum/(double)arr.length));
		
		int max = arr[0]; // 배열의 값 중 가장 큰 값을 찾기
		int min = arr[0]; // 배열의 값 중 가장 작은값을 찾기 위한 초기값
		
		for(int tmp : arr) {
			System.out.println(tmp);
			if(max<tmp) {
				max=tmp;
			}
			if(min>tmp) {
				min=tmp;
			}
			// max = Math.max(tmp, max);
			// min = Math.min(tmp, min);
			
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		scan.close();

	}

}

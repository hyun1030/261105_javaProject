package day08;

import java.util.Random;

public class Method04 {
	
	// 멤버변수 
	Random r = new Random();
	
	// 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	/* 매개변수 : 없음.
	 * 메서드명 : makeRandom
	 * 리턴타입 : 정수배열 => int[]
	 * */
	public int[] makeRandom() {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			//arr[i] = (int)(Math.random()*101);
			arr[i] = r.nextInt(101);
		}
		return arr;
	}
	
	// 정수 배열을 받아 평균값을 리턴하는 메서드
	// - 단 정수 배열이 없거나, 갯수가 0이면 처리불가
	/* 매개변수 : 정수배열 =>  int[] arr
	 * 메서드명 : average
	 * 리턴타입 : 평균값 => double
	 * */
	public double average(int[] arr) {
		if(arr == null || arr.length <=0) {
			return -999999;
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum / (double)arr.length;
	}
	
	// 정수 배열을 받아 출력하는 메서드
	/* 매개변수 : 정수 배열 => int[] arr
	 * 메서드명 : print
	 * 리턴타입 : 출력 => void
	 * */
	public void print(int[] arr) {
		if(arr == null) {
			return;
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println(); // 줄바꿈
		//System.out.print();
		
	}

	
	
	public static void main(String[] args) {
		// 메서드 활용
		/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
		 * 2. 정수 배열을 받아 평균값을 리턴하는 메서드
		 *   - 단 정수 배열이 없거나, 갯수가 0이면 처리불가 (평균을 처리할 수 없습니다.)
		 * 3. 정수 배열을 받아 출력하는 메서드
		 *    78 96 85 48 58
		 *    
		 *    배열 생성 => 배열 출력 => 평균출력
		 * */
		
		Method04 m = new Method04();
		int[] arr = m.makeRandom();
		
		m.print(arr);
		double avg = m.average(arr);
		
		if(avg == -999999) {
			System.out.println("평균을 구할 수 없습니다.");
		}else {
			System.out.println("평균:"+avg);
		}

	}

}
package day08;

import java.util.Arrays;

import day07.Exam01;

public class Method05 {
	
	// 배열을 받아 출력하는 메서드 (다른 메서드 호출 가능)
	/* 매개변수 : 정수 배열 => int[] arr
	 * 메서드명 : print
	 * 리턴타입 : 출력 => void
	 * */
	public void print(int[] arr) {
		if(arr==null) {
			return;
		}
		for(int num:arr) {
			System.out.println(" "+num);
		}
		System.out.println();
	}
	
	// 배열을 받아 오름차순 정렬하는 메서드
	/* 매개변수 : 정수배열 =>  int[] arr
	 * 메서드명 : order
	 * 리턴타입 : void
	 * */
	public void order(int[] arr) {
		if(arr==null) {
			return;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int o = arr[i];
					arr[i] = arr[j];
					arr[j] = o;
							
				}
			} 
		} 
		
	}
	
	
	// 배열을 받아 최대값을 리턴하는 메서드
	/* 매개변수 : 정수배열 =>  int[] arr
	 * 메서드명 : max
	 * 리턴타입 : 최대값 => int
	 * */
	public int max(int[] arr) {
		if(arr==null) {
			return -999999;
		}
		int max = arr[0];
		
		for(int tmp:arr) {
			if(max<tmp) {
				max=tmp;
				
			}

		} 
		return max;
			
	}
	
	// 배열을 받아 최소값을 리턴하는 메서드
	/* 매개변수 : 정수배열 =>  int[] arr
	 * 메서드명 : min
	 * 리턴타입 : 최소값 => int
	 * */
	public int min(int[] arr) {
		if(arr==null) {
			return -999999;
		}
		
		int min = arr[0];
		
		for(int tmp:arr) {
			if(min>tmp) {
				min=tmp;
				
			}

		} 
		return min;
				
	}
	
	// 메서드는 같은 이름의 메서드 가능 => 메서드오버로딩
	// 오버로딩 조건
	// 매개변수가 달라야함 (타입이 달라야 함, 개수가 달아야 함)
	
	

	public static void main(String[] args) {
		/* 메서드 생성
		 * 1. 배열을 받아 출력하는 메서드
		 * 2. 배열을 받아 오름차순 정렬하는 메서드
		 * 3. 배열을 받아 합계, 평균, 최대, 최소 출력 메서드
		 * 	  - 합계와 평균은 다른 메서드를 호출 Exam01
		 *    - 최대, 최소 return 각각 하나씩
		 * */
		
		
		int[] arr = {78,89,85,84,96,56,59,81,52,62,87,46,39,65};
		
		Method04 m4 = new Method04();
		m4.print(arr);
		
		Method05 m5 = new Method05();
		m5.order(arr);
		
		int max = m5.max(arr);
		int min = m5.min(arr);

		if(max == -999999) {
			System.out.println("배열 오류!!");	
		}
		
		if (min == -999999) {
			System.out.println("배열 오류!!");
		}
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
		
		
		
		Exam01 e01 = new Exam01();
		int sum = e01.sum(arr);
		System.out.println("합계 : " +sum);
		double avg = e01.avg(arr);
		System.out.println("평균 : " +avg);
		
		
		
		Arrays.sort(arr); // 오름차순
		System.out.println(Arrays.toString(arr));
		
		
	}

}

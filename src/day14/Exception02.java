package day14;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// 자주 발생하는 런타임 예외들
		/* - ArithmeticException : 0으로 나누었을 때 발생
		 * - ArrayIndexOutOfBoundsException : 배열의 범위가 넘어갔을 때 발생
		 * - NullPointerException : 객체의 값이 null 일 때 발생
		 * - ClassCaseException : 다운 캐스팅이 잘못되었을 경우
		 * - InputMismatchException : 입력값의 타입이 맞지 않을 경우 발생 => 콘솔 입력
		 * 
		 * */
		int arr[] = new int[5];
		//System.out.println(arr[5]);
		
		int arr2[] = null;
		//System.out.println(arr2[0]);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력 > ");
		try {
			int num = scan.nextInt();
		} catch (Exception e) {
			System.out.println("입력값이 잘못 되었습니다.");
			//System.out.println(e.getMessage());
		}
		
		scan.close();

	}
	

}

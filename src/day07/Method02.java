package day07;

public class Method02 {
	/* 메서드 => 기능을 정의하는 역할 (정수)
	 * 접근제어자 리턴타입 메서드명(매개변수) {
	 * 구현;
	 * (return;)
	 * }
	 * - 리턴타입 : 기능을 구현 후 결과로 반환하는 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명 : 의미있게 소문자로 작성
	 * */
	
	// 메서드 생성 영역
	// + - * / % 
	// /(double) %(int) 값이0이면 어떻게 할것인지..if 
	// 두 정수를 주고 (매개변수) 각 연산의 결과를 리턴하는 메서드
	
	/* 매개변수 : int
	 * 매서드명 : sum1
	 * 리턴타입 : int a, int b
	 * */
	// +
	public int sum1(int a, int b)  {
		return a+b;
		
	}
	
	// -
	public int sum2(int a, int b)  {
		return a-b;
		
	}
	
	// *
	public int sum3(int a, int b)  {
		return a*b;
		
	}
	
	public double sum4(int a, int b)  {
		if(b==0) {
			return -999999;
		} 
		return a / b;
		
	}
	public int sum5(int a, int b)  {
		if (b==0) {
			return -999999;
		}
		return a%b;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// 메서드 호출 영역
		Method02 m = new Method02();
		int num1 = 100;
		int num2 = 80;
		
		int sum1 = m.sum1(num1, num2);
		System.out.println(sum1);
		
		int sum2 = m.sum2(num1, num2);
		System.out.println(sum2);
		
		int sum3 = m.sum3(num1, num2);
		System.out.println(sum3);
		
		double sum4 = m.sum4(num1, num2);
		if(sum4 == -9999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(sum4);
		}
		
		int sum5 = m.sum5(num1,num2);
		if(sum5 == -9999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(sum5);
		}
		


		
		
		
	}

}

package day08;

import java.util.Scanner;

public class Method03 {
	/* 변수의 종류
	 * 지역변수 : 메서드 안에서 사용 (일반변수)
	 * 매개변수 : 메서드에서 전달받는 변수
	 * 멤버변수 : 클래스의 속성 (클래스 안에서 사용)
	 * 
	 * 모든 변수의 스코프는 {  }
	 * 
	 * --------------------------
	 * 변수가 어떤것을 저장하느냐에 따라 분류
	 * 일반변수 : 값을 저장 => 기본 8 자료형
	 * 참조변수 : 주소를 저장 => 그외
	 * 
	 * */
	int a; // 멤버변수
	
	/* 정수 하나를 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : 메서드에 줘야 하는 값 (정수하나) int a
	 * 메서드명 : print
	 * 리턴타입 : 출력 => 없음 => (void)
	 * 
	 * */
	
	public void dan(int a) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + "*" + i + " = " + (a * i));
		}
	}

	public static void main(String[] args) { // 매개변수

		/**/
		int number = 3; // 지역변수

		System.out.println("숫자를 입력해주세요. >");

		// 구구단 출력하는 메서드
		// 호출 => 객체 생성
		Method03 m = new Method03();
		m.dan(number);
		m.dan(5);
		
		
		System.out.println("----------");
		// 구구단 메서드를 활용하여 전체 구구단 출력
		for (int i = 2; i <= 9; i++) {
			m.dan(i);
		}

	}

}

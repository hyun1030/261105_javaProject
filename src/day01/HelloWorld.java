package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) = 함수(function)
		// 실행을 담당 (콘솔 실행)
		// 주석 : 실행과 상관없는 영역
		/* 여러줄 주석
		 * 주석 : ctrl + / => 한번 더 누르면 풀림
		 * 
		 * java 
		 * package => class라는 공간 안에 method가 있어야 실행이됨
		 * 
		 * main : 실행을 담당
		 * println() : 괄호안의 값을 콘솔 출력해라 (줄바꿈 포함) 다음 출력문이 옆에 붙지않도록
		 * print() : 괄호안의 값을 콘솔 출력해라 (줄바꿈 x)
		 * 
		 * 마지막 끝처리 세미콜론(;)
		 * 
		 * 문자 : String 클래스를 사용
		 * 
		 * 
		 * */

		// println()
		System.out.println(123*45);
		/* 숫자 : +, - (부호), 사칙연산
		 * 문자 : "문자는 모두 큰따옴표로 묶기"
		 * 한글자의 문자 : 'a' : char
		 * */
		
		System.out.println("HelloWorld");
		System.out.println('a');
		
		// = (대입) : 오른쪽의 리터럴값을 왼쪽의 변수에 넣는다.
		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		
		//-----------------------------
		
		byte b = 20;
		short s = 100;
		long l = 100L; // 접미사 l/L 선택(대문자L은 붙이나 소문자l은 잘 안붙임)
		float f = 1.1f; // 접미사 f/F 필수
		double d = 1.1;
		char ch = 'a';
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

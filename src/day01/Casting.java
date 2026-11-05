package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		// a = b; 두 변수의 자료형이 맞지 않다면 오류
		// 자동 자료형 변환 : auto casting
		// byte < short < int < long
		// float > double
		// 명시적 자료형 변환 : 변수 값 앞에 (타입)변수
		
		byte b = 11;
		int a = b; // auto casting
		
		int aa= 111;
		byte c = (byte)aa; // 명시적 캐스팅
		
		System.out.println(c);
		
		long l = a;
		
		double d = 3.14159;
		int pi = (int)d; // 소수점 버림
		
		System.out.println(d);
		System.out.println(pi);
		
		int number = 100;
		double num = number;
		System.out.println(num); // .0 소수점 생김
		
		
		//------------------------------------------
		
		// 문자를 숫자로 변환 : String -> int
		// "123" = 연산이 가능한 숫자123으로 바꿔주세요
		String str = "123";
		System.out.println(str + 10);
		
		// 기본 8가지 자료형도 클래스 타입의 타입이 존재
		// 추가 기능을 제공 (래퍼 클래스 : wrapper class)
		// int -> integer / char -> Character
		// float -> Float / double -> Double / boolean -> Boolean
		// long -> Long / byte -> Byte / short -> Short
		
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber + 10);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

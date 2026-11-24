package day14;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// 예외처리 연습
		// 두 정수와 연산자를 입력받아
		// + = * / % 의 연산결과를 리턴하는 메서드
		// / % 연산자일 경우 피연산자가 0이면 Exception 오류처리
		
		// 예외처리는 메서드에서 해도 됨
		
		Exception03 e = new Exception03();
//		double result = e.calc(3, 0, "/");
//		System.out.println(result);
//		
		System.out.println(e.calc2(3, 0, "+"));
		
		try {
			double result = e.calc2(3, 0, "/");
			System.out.println(result);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			
		}
		
		System.out.println(e.calc2(3, 0, "-"));
		

	}
	// 메서드는 직접 예외처리를 안하고, 그 예외를 나를 호출하는 호출자에게 넘겨줄 수 있음
	// 예외 떠넘기기 : throws => 메서드 선언문에 위치
	// method 자체에서 예외처리를 하지 않고,
	// 나는 호출하는 대상에게 예외처리를 넘기는 상태
	// 해당 조건에 예외를 발생 시킬 수 있음 : throw new => 예외를 발생시키기
	
	// throws runtimeException => 내 메서드에 존재하는 예외 선언 => runtime은 안해도 됨 
	public double calc2(int num1, int num2, String op) throws RuntimeException {
		double result = 0;
		
		if(op.equals("/") || op.equals("%") && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		
		switch(op) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : result = num1 / num2; break;
		case "%" : result = num1 % num2; break;
		default : 
			throw new RuntimeException(op + "는 산술 연산자가 아닙니다.");
		
		
		}
		
		return result;
	}
	
	
	
	// 두 정수와 연산자를 입력받아
	// + = * / % 의 연산결과를 리턴하는 메서드
	// 매개변수 : 두 정수 => int num1, int num2, string op
	// 리턴타입 : 연산결과 => double
	
	// 예외를 매서드에서 직접 처리한 케이스
	public double calc(int num1, int num2, String op) {
		double result = 0;

		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			try {
				result = num1 / num2;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case "%":
			try {
				result = num1 % num2;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		default:
			result = -999999;
		}

		return result;
	}
}
		
		

	



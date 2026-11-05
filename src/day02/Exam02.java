package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력받아서 두 정수의 연산 결과를 출력
		// 2 3 + => 2+3=5
		// 2 3 - => 2-3=-1
		// 입력 가능한 연산자는 + - * / %
		// 이 외의 연산자가 나온다면 계산하지 않습니다
		// 연산자 입력은 String(equals) char도 가능 swtich
		// "+".equals("+");
		// String s = "-";
		// s.equals("-")

		Scanner scan = new Scanner(System.in);

		System.out.println("정수 2개를 입력해주세요 > ");
		int number = scan.nextInt();
		int number2 = scan.nextInt();

		System.out.println("연산자를 입력해주세요 > ");

		char ch = scan.next().charAt(0); // '+'

		switch (ch) {
		case '+':
			System.out.println(number + number2);
			break;
		case '-':
			System.out.println(number - number2);
			break;
		case '*':
			System.out.println(number * number2);
			break;
		case '/':
			System.out.println(number / number2);
			break;
		case '%':
			System.out.println(number % number2);
			break;
		default:
			System.out.println("이 외의 연산자가 나온다면 계산하지 않습니다.");

		}

		// 2
		System.out.println("두 정수를 띄어쓰기하여 입력 > ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		System.out.println(n1);
		System.out.println(n2);

		// 연산자 string
		String op = scan.next(); // "+"

		// 연산자 char 형태
		// char opChar = scan.next().charAt(0); //'+'
		switch (op) {
		case "+":
			System.out.println(n1 + op + n2 + "=" + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + op + n2 + "=" + (n1 - n2));
			break;
		case "/":
			if (n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(n1 + op + n2 + "=" + (n1 / n2));
			}

			break;
		case "*":
			System.out.println(n1 + op + n2 + "=" + (n1 * n2));
			break;
		case "%":
			System.out.println(n1 + op + n2 + "="+(n1%n2));
			break;
			default:
				System.out.println("잘못된 연산자");
			break;
	

		}
		int result=0;
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		case "%":
			result = n1 % n2;
			break;
		default:
			System.out.println("잘못된 연산자");
		}
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
			System.out.println(n1 + op + n2 + "=" + result);

		}
		
		if(op.equals("+")) {
			System.out.println();
		}

		
		scan.close();

	}
}

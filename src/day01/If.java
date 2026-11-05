package day01;

public class If {

	public static void main(String[] args) {
		// 조건문 : if, switch
		// 삼항연산자 : 조건 선택 연산자
		// if (조건식) {...}조건식이 참이면 실행
		// 처리문이 1줄이면 {} 생략가능

		int number = 0;

		if (number % 2 == 0) {

			System.out.println("짝수");

			// 조건식이 참 일때 실행하는 구문
			System.out.println("짝수");
		}

		if (number % 2 == 0) {
			int a = 10;
			System.out.println("짝수");
			System.out.println(number + a);
		} else {
			System.out.println("홀수");
		}

		// number가 0보다 크면 양수
		// number가 0보다 작으면 음수
		// 나머지는 0
		// else if(조건식)

		if (number > 0) {
			// int a = 20; //scope가 겹치기 때문에 쓸 수 없음
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

		{
			// scope(스코프) : 해당 값이 영향을 미치는 범위 { }
			// 자동정렬 : ctrl + shift + f
		}

	}

}

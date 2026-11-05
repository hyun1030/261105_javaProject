package day02;

import java.util.Scanner;
public class Input01 {

	public static void main(String[] args) {
		// input class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// scanner 클래스 : 입력받는 값의 형식 변환을 편리하게 해주는 클래스
		// 클래스 객체를 생성해야 사용할 수 있다. => new 키워드를 사용
		
		// 기본 자료형 => 타입 변수명 = 값; int number = 1;
		// 클래스 자료형 => 클래스명 객체명 = new 클래스명(값);
		
		Scanner scan = new Scanner(System.in);
		
		// scanner를 이용해서 입력을 받을 때 scan.메서드(기능)
		// scan.next() : 한 문자만 입력(한단어) 공백미포함 => String
		// scan.nextLine() : 여러 단어를 입력 공백포함 => String
		// scan.nextInt() : 정수입력 => int
		// scan.next자료형() : 해당 자료형으로 입력 => 자료형
		
		System.out.println("이름을 입력해주세요 > ");
		String name = scan.next();
		System.out.println("이름: "+name);
		
		// 나머지 데이터를 버리는 작업 ex) qqq rrr ppp를 입력하면 qqq만 쓰고 나머지는 버린다
		scan.nextLine();
		
		System.out.println("점수를 입력해주세요 > "); 
		/*소수점을 포함한다면 
		 * double number = scan.nextDouble()*/
		int number = scan.nextInt();
		System.out.println("점수: "+number);
		
		// 숫자를 입력받아 짝수인지 홀수인지 출력
		System.out.println("짝수 홀수 판단 >");
		/*int numb = scan.nextInt();
		int modu = numb%2;
		System.out.println(modu);
		System.out.println(modu == 1 ? "홀수":"짝수");*/
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// char : 아스키코드의 한글자 입력
		// scan.next().charAt(위치) : 입력받은 단어의 첫글자만 아스키 코드로 변환 => char 
		// 항상 모든 시작위치는 0부터
		System.out.println("한글자만 입력 >");
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 글자 > " +ch);
				
		
		scan.close();

	}

}

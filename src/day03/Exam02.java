package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13), 청소년(19), 성인으로 구분
		// 어린이 요금5,000 청소년 7,000 성인 10,000 입장료 출력
		// ex) 2017 => 9살 어린이입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026 - 2017 => 나이 
		// 생년의 유효한 값을 1900 ~ 2026 이외의 연도는 유효하지 않은 연도입니다
		// 기준에 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시 입력해주세요 (1900~2026) > 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력해주세요 > ");
		
		int age = scan.nextInt();
				
		while(true) {
			if(age >= 1900 && age <= 2026) {
				System.out.println("정상 입력");
				break;
			} else {
				System.out.println("이외의 연도는 유효하지 않은 연도 입니다.");
				age = scan.nextInt();
			}
				
		}
		
		int age2 = 2026 - age;
		
		if(age2 <= 13) {
			System.out.println("어린이입니다. 요금 5000원");
		} else if (age2 <=19){
			System.out.println("청소년입니다. 요금 7000원");
		} else {
			System.out.println("성인입니다. 요금 10000원");
			
		}
		
		
		
		
	
		
		
		scan.close();

	}

}

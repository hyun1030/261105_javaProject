package cafe;

import java.util.Scanner;

import day10.Product;

public class CafeMain {
	
	public static void main(String[] args) {
	// Cafe Main
	/* 프로그램 설계서
	 * kiosk
	 * - 메뉴명, 가격, 옵션, 옵션 가격, 수량
	 * ----------------------------------
	 * - 1. Coffee (에스프레소) => 2000 => 부모클래스 
	 * - 2. Americano => Coffee + water(500) => 2500
	 * - 3. Latte => Coffee + milk(1000) => 3000
	 * - 4. Mocha => Coffee + chocolate(1500) => 3500
	 * 
	 * 주문을 받아 Coffee[] 주문 정보 저장 = 영수증 출력
	 * 
	 * 1. 아메리카노(2000)
	 * 2. 라떼(2000) + 우유(1000)
	 * 3. 모카 + 초콜릿(3500)
	 * 0. 주문완료(영수증출력)
	 * */
	
	
	Scanner scan = new Scanner(System.in);
	
	CafeMenu[] order = new CafeMenu[10];
	int menu = 0; 
	int cnt = 0; 

	
	do {
		System.out.println("--키오스크메뉴--");
		System.out.println("1. 아메리카노 2. 라떼 3. 모카 0. 종료");
		
		int coffee = scan.nextInt();
		
		
		if (coffee == 0) {
			System.out.println("종료");
			break;
		} else if (coffee < 1 || coffee > 3) {
			System.out.println("잘못 선택했습니다. 다른 번호를 선택해주세요.");
			continue;
		} 
		
		// 옵션 추가
		System.out.println("옵션을 추가하시겠습니까? (y/n)");
		String yn = scan.next();
		
		boolean opt = false;
		if (yn.equals("y") || yn.equals("Y")) {
			System.out.println("옵션 추가."); // 어떤 옵션 추가할껀데....
			opt = true;
			break;

		} else if (yn.equals("n") || yn.equals("N")) {
			System.out.println("옵션 추가를 종료합니다.");
			opt = false;
			break;

		} else {
			System.out.println("잘못 입력했습니다. y 또는 n만 입력해주세요.");
		}
		
		
		
		switch (coffee) {
		case 1:
			order[cnt] = new Americano(cnt, true);
			cnt++;
			break;

		case 2:
			order[cnt] = new Latte(cnt, true);
			cnt++;
			break;

		case 3:
			order[cnt] = new Mocha(cnt, true);
			cnt++;
			break;

		default:
			System.out.println("잘못된 선택입니다.");
			break;
		}		
		

//		System.out.print("수량을 입력하세요 : ");
//		int qty = scan.nextInt();
//		
		
		
		
		
	} while(menu !=0);
	
	scan.close();
	
	}
}

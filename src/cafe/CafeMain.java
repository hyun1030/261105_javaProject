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
	CafeController cc = new CafeController(scan);
	
	cc.run();
	scan.close();
	
	}
}

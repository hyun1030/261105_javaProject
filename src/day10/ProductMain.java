package day10;

import java.util.Scanner;



public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/* product(상품) class : 상품명, 가격(판매금액)
		 * order(주문) class : 상품명, 개수, 가격(판매금액), 금액(개수*가격)
		 * */

		// Product[] menu = new Product[5]; // => 상품리스트
		// 임의의 상품등록
		// 주문 => order 객체 발생 => Order[] order = new Order[5];
		/* 1. 전체 제품 보여주기
		 * 2. 주문 > 제품명, 수량 입력받기 
		 * 3. order 객체 생성 => 추가
		 * 4. 반복 주문 => 종료 키워드 생성 반복 주문이 가능하도록 
		 * 5. order => 배열이 다 차면 배열 증가 (배열 복사)
		 * 6. 주문 완료시 => 영수증 출력 (전체 주문내역 / 총지불금액)
		 * 
		 * ex) 
		 * 김밥 	2	3000 => 6000
		 * 라면  3	5000 => 15000
		 * 사이다 2   500  => 1000
		 * ----------------------
		 * 총 지불금액  22000
		 * */

        Scanner scan = new Scanner(System.in);

        // 1. 상품 리스트(메뉴) 등록
        Product[] menu = new Product[5];
        menu[0] = new Product("김밥", 3000);
        menu[1] = new Product("라면", 5000);
        menu[2] = new Product("사이다", 500);
        menu[3] = new Product("떡볶이", 4000);
        menu[4] = new Product("돈까스", 8000);
        
        Order[] orderList = new Order[5];
        int orderIndex=0;
 
        int choice=0;

        do {

			System.out.println("--키오스크메뉴--");
			System.out.println("1. 전체 제품 보기 | 2. 주문하기 | 3. 주문 완료 (영수증 출력 및 종료) ");
			//System.out.println("메뉴를 선택해주세요 > ");
			
			choice = scan.nextInt();
			if (choice == 1) {
				for (int i = 0; i < menu.length; i++) {
					System.out.println((i + 1) + ". " + menu[i].getProduct() + " " + menu[i].getPrice() + "원");
				}
				System.out.println();

			} else if(choice == 2) {
				for(int i = 0; i < menu.length; i++) {
					System.out.println((i + 1) + ". " + menu[i].getProduct() + " " + menu[i].getPrice() + "원");
				} 
				
				System.out.println("주문할 메뉴 선택해주세요 > ");
				int number = scan.nextInt();
				if(number < 1 || number > menu.length) {
					System.out.println("잘못된 번호입니다.");
					continue;
				}
				
				System.out.println("수량을 입력해주세요.");
				int ea = scan.nextInt();
				if(ea <= 0) {
					System.out.println("1개 이상 선택해주세요.");
					continue;
				}
				
				String name = menu[number-1].getProduct();
				int price = menu[number-1].getPrice();
				Order o = new Order(name, ea, price);
				System.out.println(o);
				
				orderList[orderIndex]=o;
				orderIndex++;
						

			} else if (choice == 3) {
				System.out.println("--영수증--");
				if(orderIndex == 0) {
					System.out.println("주문한 내역이 없습니다.");
					
				} else {
					int total = 0;
					
				}
			}
			
			
			
		} while(choice !=3);
        int sum = 0;
        	for(int i=0; i<orderIndex; i++) {
        		sum+=orderList[i].getTotal();
        		System.out.println(orderList[i]);
        	}
        	System.out.println("총금액 : " +sum + "원");

        

	        

		

        scan.close();

	}



}

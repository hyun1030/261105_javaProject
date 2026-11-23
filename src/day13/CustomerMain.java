package day13;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점 고객 등급
		/* - 일반 고객(적립) / 골드 고객(할인+적립) / VIP고객(할인+적립)
		 * 
		 * 고객 => Customer(부모클래스)
		 * - 멤버변수 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
		 * 
		 * - 일반고객(기본등급) : Silver
		 * - 기본 적립 비율 : 구매 금액의 1% 적립
		 * 
		 * - 등급체계
		 * Silver / Gold / VIP
		 * - Silver : 제품 구매 시 할인 0% / 구매 금액의 1% 적립
		 * - Gold : 제품 구매 시 할인 5% / 구매 금액의 3% 적립
		 * - VIP : 제품 구매 시 할인 10% / 구매 금액의 5% 적립
		 * - VIP : 전담 상담사 멤버변수 추가 (agentNum, agentName)
		 * 
		 * 1. 포인트 적립 계산 메서드
		 * - 구매 금액을 기준으로 포인트 계산 => 포인트 누적 적립
		 * - 할인 여부도 체크하여 구매 금액 리턴
		 * 
		 * 2. 출력 메서드
		 * - 홍길동 님은 Gold 고객이며, 현재 포인트는 5000점 입니다.
		 * - 짱구님은 VIP고객이며, 현재 포인트는 5000점 입니다.
		 * - 전담상담사는 짱아이고, 번호는 1111입니다. <- VIP만 추가
		 * 
		 * */

		VIPCustomer c = new VIPCustomer ("111", "홍길동", "1", "짱아");
		int price = c.calcPrice(10000);
		System.out.println("지불금액 : "+price);
		c.customerInfo();
		System.out.println("-----------------------");

		Customer[] customers = new Customer[10];
		customers[0] = c;
		customers[1] = new Customer("111", "최순자");
		customers[2] = new GoldCustomer("222", "김철수");
		customers[3] = new GoldCustomer("333", "최영이");
		customers[4] = new Customer("444", "최말순");
		customers[5] = new GoldCustomer("555", "김미영");
		customers[6] = new VIPCustomer("666", "장보고", "1", "짱아");
		customers[7] = new Customer("777", "신말자");
		customers[8] = new Customer("888", "박혁거");
		customers[9] = new VIPCustomer("999", "이진수", "2", "짱구");
		
		System.out.println("--지불금액과 포인트 금액 계산--");
		int price1 = 100000;
		
		for(int i=0; i<customers.length; i++) {
			int salePrice = customers[i].calcPrice(price1);
			System.out.println("지불금액 : "+salePrice);
			customers[i].customerInfo();
			System.out.println();
		}
		
		price1 = 500000;
		for(int i=0; i<customers.length; i++) {
			int salePrice = customers[i].calcPrice(price1);
			System.out.println("지불금액 : "+salePrice);
			customers[i].customerInfo();
			System.out.println();
		}
		
		// 다운캐스팅
		// 상담사 짱아(1) => 청이(3)
		for(int i=0; i<customers.length; i++) {
			if(customers[i] instanceof VIPCustomer) {
				// VIPCustomer == true
				VIPCustomer vip = ((VIPCustomer)customers[i]);
				if(vip.getAgentName().equals("짱아")) {
					vip.setAgentName("청이");
					vip.setAgentNum("3");
				}
			}
		}
		System.out.println("------------");
		System.out.println("--VIP 리스트--");
		
		// Vip 고객 리스트 출력
		for(int i=0; i<customers.length; i++) {
			if(customers[i] instanceof VIPCustomer) {
				customers[i].customerInfo();
			}
		}
		
		
		
		
	}

}

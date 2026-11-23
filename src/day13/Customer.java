package day13;

public class Customer {
	// 멤버변수 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
	protected String customerId;
	protected String customerName;
	protected String grade; // 등급
	protected int point; // 포인트
	protected double ratio; // 적립비율
	

	public Customer() {}
	public Customer(String customerId, String customerName) {
		/*Silver : 제품 구매 시 할인 0% / 구매 금액의 1% 적립
		 * - Gold : 제품 구매 시 할인 5% / 구매 금액의 3% 적립
		 * - VIP : 제품 구매 시 할인 10% / 구매 금액의 5% 적립
		 * - VIP : 전담 상담사 멤버변수 추가 (agentNum, agentName)*/
	
		this.customerId = customerId;
		this.customerName = customerName;
		
		this.grade = "Silver";
		this.ratio = 0.01;
		
	}	
	
	
	// 구매금액, 포인트계산
	// 매개변수 : 가격 / 리턴타입 : int
//	public int calcPrice(int price, double dc) {
//		/*- 구매 금액을 기준으로 포인트 계산 => 포인트 누적 적립
//		 * - 할인 여부도 체크하여 구매 금액 리턴 */
//		price = price - (int)(price * dc);
//		this.point += (int)(price * ratio);
//		return price;
//	}
	
	// 구매금액, 포인트계산(silver)
	public int calcPrice(int price) {
		/*- 구매 금액을 기준으로 포인트 계산 => 포인트 누적 적립
		 * - 할인 여부도 체크하여 구매 금액 리턴 */
		this.point += (int)(price * ratio);
		return price;
	}
	
	
	// 출력
	public void customerInfo () {
		/* 홍길동 님은 Gold 고객이며, 현재 포인트는 5000점 입니다.
		 * - 짱구님은 VIP고객이며, 현재 포인트는 5000점 입니다.
		 * - 전담상담사는 짱아이고, 번호는 1111입니다. <- VIP만 추가 */
		System.out.print(customerName + "님은" + grade + "고객이며, ");
		System.out.println("현재 포인트는 " + point + "점 입니다.");
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", grade=" + grade + ", point="
				+ point + ", ratio=" + ratio + "]";
	}

	
	
}


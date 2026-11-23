package day13;

public class GoldCustomer extends Customer{
	// customer의 멤버변수를 가지고 있는 상황
	
	private double saleRatio;
	
	public GoldCustomer(String customerId, String customerName) {
		super(customerId, customerName);
		super.grade = "Gold";
		super.ratio = 0.03;
		this.saleRatio = 0.05;
		
	}

	@Override
	public int calcPrice(int price) {
		// 부모 메서드 오버라이딩
		// 금액을 그대로 리턴
		super.calcPrice(price);
		return price - (int)(price * saleRatio);
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + "]";
	}
	

}

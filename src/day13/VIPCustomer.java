package day13;

public class VIPCustomer extends Customer {
	// - saleRatio, agentNum, agentName
	private double saleRatio;
	private String agentNum;
	private String agentName;
	
	public VIPCustomer(String customerId, String customerName, String agentNum, String agentName) {
		super(customerId, customerName); // customer 기본 생성자
		grade = "VIP";
		ratio = 0.05;
		this.saleRatio =  0.1;
		this.agentNum = agentNum;
		this.agentName = agentName;


	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		super.calcPrice(price);
		return price - (int)(price * saleRatio);
	}

	
	@Override
	public void customerInfo() {
		// 부모 클래스에서 작성한 출력 내용
		super.customerInfo();
		System.out.println("전담 상담사는 " + agentName + "이고, 번호는 " + agentNum + "입니다.");
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentNum=" + agentNum + ", agentName=" + agentName + "]";
	}

	


	
	
}

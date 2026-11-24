package cafe;

public abstract class CafeMenu {
	// - 메뉴명, 가격, 옵션, 옵션가격, 수량
	protected String name;
	protected int basePrice;
	protected int quantity;
	
	public CafeMenu() {}
	public CafeMenu(String name, int price, int cnt) {
		this.name= name;
		this.basePrice = price;
		this.quantity = cnt;
	}
	
	// 자식들의 가격 계산
	public abstract int getPrice();
	
	// 옵션 설명 내용
	public abstract String getDescription();
	
}

// 아메리카노
class Americano extends CafeMenu{
	
	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano(int cnt, boolean extraWater) {
		super("아메리카노", 2000, cnt);
		this.extraWater = extraWater;
		
	}

	@Override
	public int getPrice() {
		// 추가 옵션 여부에 따라 추가 가격을 더해서 * 수량
		extra_price = extraWater ? extra_price : 0;
		return (basePrice + extra_price) * quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraWater ? name + "+(물추가)" : name;
	}
}

// 라떼
class Latte extends CafeMenu {
	private final int extra_Price = 1000;
	private boolean extraMilk;

	public Latte(int cnt, boolean extraMilk) {
		super("라떼", 3500, cnt);
		this.extraMilk = extraMilk;
	}

	@Override
	public int getPrice() {
		//int add = extraMilk ? extraPrice : 0;
		return (basePrice + ( extraMilk ? extra_Price : 0)) * quantity;
	}

	@Override
	public String getDescription() {
		return extraMilk ? name + " + 우유추가(1000)" : name;
	}
}

// 모카
class Mocha extends CafeMenu {
	private final int extra_Price = 1500;
	private boolean extraChocolate;

	public Mocha(int cnt, boolean extraChocolate) {
		super("모카", 2000, cnt);
		this.extraChocolate = extraChocolate;
	}

	@Override
	public int getPrice() {
		//int add = extraChocolate ? extraPrice : 0;
		return (basePrice + ( extraChocolate ? extra_Price : 0)) * quantity;
	}

	@Override
	public String getDescription() {
		return extraChocolate ? name + " + 초코추가(1500)" : name;
	}
}

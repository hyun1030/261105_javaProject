package GenericsProduct;

public class Order<K, V extends Number> extends Product<K, V> {

	private int count;
	private int total;
	
	public Order(K menu, V price, int count) {
		super(menu, price);
		this.count = count;
		totalPrice();
	}
	public Order(Product<K, V> p, int count) {
		super(p.getMenu(), p.getPrice());
		this.count = count;
		totalPrice();
	}
	
	
	// 출력 print() menu, count, total
	public void OrderList() {
		System.out.println(super.getMenu()+"   "+ super.getPrice()
			+ "  " + this.count + "  " +this.total);
		
	}
	
	public void totalPrice() {
		this.total = super.getPrice().intValue() * this.count;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Order [count=" + count + ", total=" + total + "]";
	}
	
	
	

}

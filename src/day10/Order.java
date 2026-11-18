package day10;

public class Order {
	// 주문 클래스
	// 상품명, 개수, 가격(판매금액), 금액(개수*가격)
	
	// 주문추가
	private String name;
	private int count;
	private int price;
	private int total;

	

	// 생성자
    public Order(String name, int count, int price) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = count * price; 

    }



	public String getName() {
		return name;

	}



	public void setName(String name) {
		this.name = name;

	}



	public int getCount() {
		return count;

	}


	public void setCount(int count) {
        this.count = count;
        this.total = this.count * this.price; // 개수가 바뀌면 총금액도 재계산

    }


	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
        this.price = price;
        this.total = this.count * this.price; // 가격이 바뀌면 총금액도 재계산

    }



	public int getTotal() {
		return total;

	}



	public void setTotal(int total) {
		this.total = total;

	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", count=" + count + ", price=" + price + ", total=" + total + "]";

	}
	

}

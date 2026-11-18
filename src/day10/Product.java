package day10;


public class Product {
	// 제품 클래스
	// 판매제품명, 가격 (생성자)

	private String product;
	private int price;


	public Product(String product, int price) {
		this.product = product;
		this.price = price;



	}

	public String getProduct() {
		return product;

	}

	public void setProduct(String product) {
		this.product = product;

	}

	public int getPrice() {
		return price;

	}


	public void setPrice(int price) {
		this.price = price;

	}


	@Override
	public String toString() {
		return "Product [product=" + product + ", price=" + price + "]";
	}








	



}
package GenericsProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
	//1. 메뉴추가 | 2. 메뉴보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료 
	
	// 메뉴 저장 리스트
	private List<Product<String, Integer>> menu = new ArrayList<>();
	
	// 주문 저장 리스트
	private List<Order<String, Integer>> order = new ArrayList<>();

	public ProductController() {
		menu.add(new Product("김밥", 2000));
		menu.add(new Product("라면", 3000));
	}
	
	// 1. 메뉴추가
	public void insertMenu(Scanner scan) {
		System.out.println("메뉴를 등록해주세요 > ");
		String name = scan.next();
		
		System.out.println("가격을 등록해주세요 > ");
		int price = scan.nextInt();
		
		if(menu.contains(new Product(name))) {
			System.out.println("이미 등록된 메뉴입니다.");
			return;
		}
		
		menu.add(new Product(name, price));
		
		
	}
	
	// 2. 메뉴보기
	public void productInfo() {
		System.out.println("--메뉴 보기--");
		for(Product pd : menu) {
			pd.productInfo();
		}
	}
	
	// 3. 메뉴주문 
	public void printOrder(Scanner scan) {
		productInfo();
		
		
		System.out.println("주문할 메뉴 선택 >");
		String name = scan.next();
		
		int index = menu.indexOf(new Product(name));
		
		if(index == -1) {
			System.out.println("메뉴가 없습니다.");
			return;
		}
		
		Product p = menu.get(index);
		int count = scan.nextInt();
		order.add(new Order(p,count));
		
		System.out.println(p);
		
	}
	
	// 4. 주문내역보기
	public void searchOrder (Scanner scan) {
		System.out.println("---주문내역---");
		int sum = 0 ;
		for(Order o : order) {
			o.OrderList();
			sum += o.getTotal();
		}
		//총금액
		System.out.println(sum);
		
		
	}

}



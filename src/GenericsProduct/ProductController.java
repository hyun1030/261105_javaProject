package GenericsProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
	//1. 메뉴추가 | 2. 메뉴보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료 
	
	// 메뉴 저장 리스트
	private List<Product<String, Integer>> menuList = new ArrayList<>();
	
	// 주문 저장 리스트
	private List<Order<String, Integer>> orderList = new ArrayList<>();

	public ProductController() {
		menuList.add(new Product<String, Integer>("김밥", 2000));
		menuList.add(new Product<String, Integer>("라면", 3000));
	}
	
	// 1. 메뉴추가
	public void insertMenu(Scanner scan) {
		System.out.println("메뉴를 등록해주세요 > ");
		String menu = scan.next();
		
		System.out.println("가격을 등록해주세요 > ");
		int price = scan.nextInt();
		
		if(menuList.contains(new Product(menu))) {
			System.out.println("이미 등록된 메뉴입니다.");
			return;
		}
		
		menuList.add(new Product(menu, price));
		System.out.println("메뉴 추가가 완료되었습니다!");
		
		
	}
	
	// 2. 메뉴보기
	public void productInfo() {
		int cnt = 0;
		System.out.println("--메뉴 보기--");
		
		for(Product pd : menuList) {
			cnt++;
			System.out.println(cnt+". " +pd);
			
		}
	}
	
	// 3. 메뉴주문 
	public void printOrder(Scanner scan) {
		productInfo();
	
//		System.out.println("주문할 메뉴 선택 >");
//		String name = scan.next();
//		
//		int index = menuList.indexOf(new Product(name));
//		
//		if(index == -1) {
//			System.out.println("메뉴가 없습니다.");
//			return;
//		}
//		
//		Product p = menuList.get(index);
//		int count = scan.nextInt();
//		orderList.add(new Order(p,count));
//		
//		System.out.println(p);
		
		
		System.out.println("주문번호 > ");
		int no=scan.nextInt();
		System.out.println("수량 > ");
		int count = scan.nextInt();
		
		// 기존에 메뉴가 존재한다면... 수량만 추가
		Product<String, Integer> p2 = new Order<String, Integer>(menuList.get(no-1).getMenu());
		
		int orderIndex = this.orderList.indexOf(p2);
		if(orderIndex != -1) {
			// 기존 메뉴 가져오기 => 수량을 가져와서 => 추가수량을 더하고 => 다시 수량을 set(계산)
			int addCount = orderList.get(orderIndex).getCount() + count;
			orderList.get(orderIndex).setCount(addCount);
			System.out.println("추가 주문을 완료했습니다.");
			return;
		}
		
		// 없다면 다 추가
		Product<String, Integer> p = menuList.get(no-1); // 내가 주문한 메뉴, 가격
		Order<String, Integer> o = new Order<String, Integer> (p, count);
		orderList.add(o);
		System.out.println("주문완료");
		
	}
	
	// 4. 주문내역보기
	public void searchOrder (Scanner scan) {
		System.out.println("---주문내역보기---");
		int sum = 0 ;
		for(Order o : orderList) {
			sum++;
			System.out.print(sum + ". ");
			o.print();
			sum += o.getTotal();
		}
		//총금액
		//System.out.println(sum);
		
		
	}

	
		
	

}



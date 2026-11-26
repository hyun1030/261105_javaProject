package GenericsProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ProductController pc = new ProductController();
		
		int menu = 0;
		do {
			System.out.println("--선택--");
			System.out.println("1. 메뉴추가 | 2. 메뉴보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료");
			System.out.println("메뉴를 선택해 주세요 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pc.insertMenu(scan);
				break;
			case 2: pc.productInfo();
				break;
			case 3: pc.printOrder(scan);
				break;
			case 4: pc.searchOrder(scan);
				break;
			case 5:
				break;
				default : System.out.println("잘못된 메뉴입니다!");
			}
			
			
			
		} while(menu != 5);
		
		scan.close();

	}

}

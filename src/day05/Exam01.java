package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* ---menu---
		 * 1. 과자(2000원) | 2. 라면(3000원) | 3. 사탕(500원) | 4. 젤리(500원) | 5. 종료
		 * menu > 1
		 * 과자 1개를 선택 했습니다. 2000원
		 * menu > 2
		 * 라면 1개를 선택했습니다. 3000원
		 * menu > 1
		 * 과자 1개를 선택 했습니다. 2000원
		 * ...
		 * menu > 5
		 * 과자2개 4000원
		 * 라면1개 3000원
		 * ------
		 * 총금액 7000원
		 * 종료를 누를때까지 반복
		 * 1~5를 벗어난 메뉴는 다시 입력
		 * 각 배열의 같은 번지는 같은 값
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		
		String menu[] = {"과자","라면","사탕","젤리"}; // menu
		int price[] = {2000,3000,500,500}; // menu의 가격
		int count[] = new int[menu.length]; // menu의 갯수
		int sum = 0;
		
		
		//while
		//System.out.println(menu[0]+"("+(price[0] + "원)"));
		
		int snack = 0;
		do {
			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3.사탕(500원) | 4. 젤리(500원) | 5. 종료");
			System.out.println("---menu---");
			
			System.out.println("menu를 선택해주세요 > ");
			snack=scan.nextInt();
			
			if (snack<1 || snack>5) {
				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
				continue;
				
			} else if (snack == 5) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println(menu[snack-1] +"1개선택 (" + price[snack-1] +"원 )");
				count[snack-1]++;
			}
			
			
			
			
			
			
		} while(snack !=5);
			for(int i=0; i<menu.length; i++) {
				System.out.println(menu[i] + "(" + price[i] +"원) * " + count[i] + "=" + price[i]*count[i]);
				sum += (price[i]*count[i]);
			
			};
			
			System.out.println("---------------");
			System.out.println("총합계: " + "   " + sum + "원");
		
	
		
		scan.close();

	}

}

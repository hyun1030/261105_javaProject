package day04;

import java.util.Scanner;

public class Exam02 {

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
		 * 
		 * 과자, 라면, 사탕, 젤리를 선택할 수 있는 변수 필요함
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int cnt1 = 0 ;
		int cnt2 = 0 ;
		int cnt3 = 0 ;
		int cnt4 = 0 ;
		int sum = 0;
		
		int menu = 0;
		do {
			System.out.println("1. 과자(2000원) | 2. 라면(3000원) | 3.사탕(500원) | 4. 젤리(500원) | 5. 종료");
			System.out.println("---menu---");
			
			System.out.println("menu를 선택해주세요 > ");
			menu=scan.nextInt();
			
			if (menu<1 || menu>5) {
				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
				continue;
			}
			
			//System.out.println("1111");
			
			switch (menu) {
			case 1: 
				System.out.println("과자 1개를 선택 했습니다. 2000원");
				cnt1++;
				sum=sum+2000;
				break;
			case 2:
				System.out.println("라면 1개를 선택했습니다. 3000원");
				cnt2++;
				sum=sum+3000;
				break;
			case 3:
				System.out.println("사탕 1개를 선택했습니다. 500원");
				cnt3++;
				sum=sum+500;
				break;
			case 4:
				System.out.println("젤리 1개를 선택했습니다. 500원");
				cnt4++;
				sum=sum+500;
				break;
				default: 
				
			}
			
			
					
		}while(menu != 5);
		
		
		System.out.println("---------");
		System.out.println("과자 :"+ cnt1 +"개" + "    " + cnt1*2000 + "원");
		System.out.println("라면 :"+ cnt2 +"개" + "    " + cnt2*3000 + "원");
		System.out.println("사탕 :"+ cnt3 +"개" + "    " + cnt3*500 + "원");
		System.out.println("젤리 :"+ cnt4 +"개" + "    " + cnt4*500 + "원");
		System.out.println("총 금액 : "+sum + "원");
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}

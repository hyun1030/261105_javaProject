package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* ---menu---
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 
		 * menu > 1
		 * 두 수를 입력 > 2 3
		 * 결과 => 2+3 = 5
		 * 
		 * 종료를 누를때 까지 반복
		 * 
		 * 두번째 값이 0인 경우 /와 %연산자는 연산할 수 없습니다 (0으로 나눌 수 없습니다.)
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int menu= 0;
		
		do{
			System.out.println("1. + 2. - 3. * 4. / 5. % 6. 종료");
			System.out.println("---menu---");
			
			menu=scan.nextInt();
			
			if(menu == 6) {
				System.out.println("종료합니다.");
				break;
			}
			
			while(menu<1 || menu>6) {
				System.out.println("메뉴를 잘못 선택했습니다. 다시 입력해주세요.");
				menu=scan.nextInt();
			}
			
			System.out.println("숫자 2개를 입력해주세요 > ");
			int num = scan.nextInt();
			int num2 = scan.nextInt();
			
//			System.out.println("연산자를 입력해주세요 > ");
//
//			char ch = scan.next().charAt(0); // '+'


			switch (menu) {
			case 1:
				System.out.println(num + num2);
				break;
			case 2:
				System.out.println(num - num2);
				break;
			case 3:
				System.out.println(num * num2);
				break;
			case 4:
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(num + "/" + num2 + "=" + (num / num2));
				}
				break;
			case 5:
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(num + "/" + num2 + "=" + (num % num2));
				}
				break;
			default:
				System.out.println("이 외의 연산자가 나온다면 계산하지 않습니다.");

			}
			
		}	while(menu !=6);
		
		

		
		scan.close();

	}

}

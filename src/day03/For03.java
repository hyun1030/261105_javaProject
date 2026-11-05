package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/* 2*1 = 2
		 * 2*2 = 4
		 * 2*3 = 6
		 * ...
		 * 2*9 = 18
		 * */
		
		//int dan = 2;
		//for (int i=1; i<=9; i++ ) {
		//	System.out.println(dan + "*" + i + "=" + (dan*i));
			
		//}
		
		// 단을 콘솔에서 입력받고 싶어요
		// Scanner scan = new Scanner(System.in);
		
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("단을 입력하세요 > ");
		//int dan = scan.nextInt();
		
		//for (int i=1; i<=9; i++ ) {
		//	System.out.println(dan + "*" + i + "=" + (dan*i));
			
		//}
		
		int i=1;
		for(; i<=9; i++) { // 구역을 정리하는 것이어서 ;은 반드시 필요
			System.out.println(i);
		}
		
		
		
		scan.close();

	}

}

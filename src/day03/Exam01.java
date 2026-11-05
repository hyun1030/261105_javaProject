package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 랜덤수를 맞추는 게임
		/* 출력 예시)
		 * 컴퓨터가 랜덤수를 생성했습니다. (38)
		 * 입력 > 30 => UP
		 * 입력 > 40 => DOWN
		 * 입력 > 38 => 정답!! (몇회) => 종료
		 * while
		 * 랜덤수 > 유저수 UP!!
		 * 랜덤수 < 유저수 DOWN!!
		 * 랜덤수 == 유저수 정답!!
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		
		int q = (int) (Math.random() * 50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		
		int counter = 0;
		while(true) {
		int u = scan.nextInt();
		counter++;
		if(q>u) {
			System.out.println("UP");
			
		} else if (q<u){
			System.out.println("DOWN");
		} else if (q==u){
			System.out.println("정답입니다");
			System.out.println(counter + "회 만의 정답입니다");
			break;
		}
		
		}
		
		scan.close();
		
	}

}

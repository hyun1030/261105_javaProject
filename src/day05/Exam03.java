package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		 /* 가위 바위 보 게임 경우의수 컴퓨터(3개), me(3개)
	       * 컴퓨터와 유저가 가위바위보 게임을 진행
	       * 컴퓨터는 랜덤으로 지정 0 1 2 중 선택 /
	       * 가위 = 0, 바위 = 1, 보 = 2
	       * 
	       * 유저도 input 0 1 2 중 선택
	       * 누가 이겼는지 출력
	       * ex) com = 0 / me = 0
	       * com(가위) / me(가위) => 무승부
	       * com = 0 / me = 1
	       * com(가위) / me(바위) => me 승리 / me 패배
	       * 
	       * 유저의 입력값 중 0 1 2 외의 다른 값이 입력되면 입력오류 => 다시 입력
	       * */

		Scanner scan = new Scanner(System.in);
		
//		String[] choice = {"가위","바위","보"};
//		
//		int comNum = (int)(Math.random()*3); // 0~2까지 3개
//		System.out.println("가위바위보 시작");
//		System.out.println(comNum + " / " + choice[comNum]);
//		System.out.println("가위(0), 바위(1), 보(2) 중 선택 > ");
//		
//		int myNum = scan.nextInt();
//		System.out.println(myNum + " / " + choice[myNum]);


		while (true) {
			System.out.println("숫자를 입력해주세요 > ");
			int user = scan.nextInt();
			
			if (user < 0 || user > 3) {
				System.out.println("입력 오류 입니다. 다시 입력하세요 > ");
				continue;
			} if (user == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			int com = (int) (Math.random() * 3);
			System.out.println("컴퓨터 : " + com);
			
			
			if (com == 0 && user == 0 || com == 1 && user == 1 || com == 2 && user == 2) { //com == user
				System.out.println("무승부입니다");
			} else if (user == 0) {
				System.out.println(com == 2 ? "승" : "패");

			} else if (user == 1) {
				System.out.println(com == 0 ? "승" : "패");

			} else if (user == 2) {
				System.out.println(com == 1 ? "승" : "패");
			}
		}

		scan.close();

	}

}
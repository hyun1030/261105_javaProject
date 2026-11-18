package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

   public static void main(String[] args) {
      // 야구게임
      /* 컴퓨터가 랜덤으로 3자리의 숫자를 생성
       * 각 자리의 숫자는 0~9 중 랜덤 숫자로 구성 => 중복 불가능
       * 배열로 저장 (int 배열)
       * 
       * 유저는 3자리를 맞추는 게임
       * 위치와 숫자가 맞으면 strike
       * 숫자만 맞으면 ball (위치는 맞지 않을 때)
       * 
       * ex) com : 1 2 3 > 한번만 생성 
       * user : 1 9 8 => 1s
       * user : 2 3 8 => 2b
       * user : 1 3 2 => 1s 2b
       * user : 1 2 5 => 2s
       * user : 7 8 9 => out!
       * user : 1 2 3 => 정답! break;
       * 
       * */
      
		Scanner scan = new Scanner(System.in);

		int comNum[] = new int[3]; // 컴퓨터의 랜덤 숫자 3개를 저장할 배열
		int userNum[] = new int[3]; // 사용자가 입력한 숫자 3개를 저장할 배열

		//System.out.println("숫자3개를 입력해주세요. > ");
		//String num = scan.next();
		
		// 컴퓨터 숫자 생성(0~9 사이의 랜덤 숫자/중복불가)
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 10);
			
			// 앞에서 뽑은 숫자들과 비교하여 중복이 있다면 다시 뽑기 (i를 하나 감소 시킴)
			for (int j = 0; j < i; j++) {
				if (comNum[i] == comNum[j]) {
					i--;
					break;

				}

			}
		}
		System.out.println(Arrays.toString(comNum));
		
		System.out.println("---야구 게임을 시작합니다!---");
	      
		// 야구게임 시작
		while (true) {
			System.out.println("숫자 3개를 입력해주세요 > ");
			// 사용자가 입력한 3개의 숫자를 배열에 저장
			for(int i=0; i<userNum.length; i++) {
				userNum[i] = scan.nextInt();
			}
			
			int strike = 0;
			int ball = 0;
			
			
			// 1. 스트라이크 개수 구하기 (위치와 숫자가 모두 같은 경우)
			for (int i = 0; i < comNum.length; i++) {
			    if (comNum[i] == userNum[i]) {
			        strike++;
			    }
			}

			// 2. 볼 개수 구하기 (숫자는 같지만, 자리는 다른 경우)
			for (int i = 0; i < comNum.length; i++) {
			    for (int j = 0; j < userNum.length; j++) {
			        
			        if (comNum[i] == userNum[j] && i != j) {
			            ball++;
			        }
			    }
			}
			
			
			System.out.println("strike : "+strike);
			System.out.println("ball : "+ball);
			
			//결과
			if(strike > 0 || ball > 0) {
				System.out.println(strike + "s " + ball + "b");
				
			} else {
				System.out.println("out!");
				
			}
			if(strike == 3) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				break;
			}
			
			
		}
		

		
      
      
      scan.close();

   }

}



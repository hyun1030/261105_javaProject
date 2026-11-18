package day08;

import java.util.Arrays;

public class Exam01 {

	// 1. 랜덤수를 리턴하는 메서드 (1~45)
	public int random() {
		return (int)(Math.random()*45)+1;

	}



	// 2. 중복확인메서드 : 배열에 정수가 있는지 확인 
	//	  - 매개변수 (배열, 정수)
	/* 매개변수 : int[] arr, int a
	 * 메서드명 : over
	 * 리턴타입 : boolean
	 * */

	public boolean isContains(int[] arr, int a) {
		//int ao = 0;


		for(int i=0; i<arr.length; i++) {

			if(arr[i]==a) {
				return true;

			}

		} 

		

		return false;

	}

	

	

	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 중복X(2번메서드호출)채워주는 메서드

	/* 매개변수 : int[] arr
	 * 메서드명 : bo
	 * 리턴타입 : void

	 * */

	public void bo(int[]arr) {

		for(int i=0; i<arr.length; i++) {
			int r = random();
			if(!isContains(arr, r)) {
				arr[i] = r;
			}else {
				i--;

			}

		}

	}

	// 4. 배열을 출력하는 메서드
	// 	  - 사용자 번호 1 2 3 4 5 6
	//    - 당첨 번호 1 2 3 4 5 6 [7]
	/* 매개변수 : int[]
	 * 메서드명 : printArray
	 * 리턴타입 : void

	 * */

	public void printArray(int[] arr) {

		for(int i=0; i<6; i++) {
			System.out.print(arr[i] + " ");

		} 

		if(arr.length==7) {
			System.out.print("["+ arr[arr.length-1]+"]");


		}
		System.out.println();


	}

	

	

	// 5. 당첨을 확인하는 메서드 (바로 출력 해도됨)
	//    - 사용자번호, 당첨번호 받아서 등수를 리턴하는 메서드
	/*    - 6개가 일치하면 1등 (순서는 상관없음, 보너스는 제외)
	 *    - 5개 일치 + 보너스 번호 = 2등
	 *    - 5개 일치 = 3등
	 *    - 4개 일치 = 4등
	 *    - 3개 일치 = 5등
	 *    - 나머지는 꽝

	 * */
	public int ranking(int[] user, int[] lotto) {
		if(user == null || lotto ==null || 
				user.length <=0 || lotto.length<=0) {
			//System.out.println("배열오류!!");
			return -999999;
		}
		// user / lotto 배열 위치가 바뀌어서 들어올 때
		if(user.length >= lotto.length) {
			return -999999;
		}
		int count=0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0; i<user.length; i++) {
			if(isContains(user, lotto[i])) {
				count++;
			}
		}
		
		// 순위 확인
		switch(count) {
		case 6: return 1;
		case 5: return isContains(user, lotto[lotto.length-1]) ? 2: 3;
//			if(isContains(user, lotto[lotto.length-1])) {
//				return 2;
//			}else {
//				return 3;
//			}
		case 4: return 4;
		case 3: return 5;
		default : return 0;
			
		}
	
	}


	public static void main(String[] args) {

		/* 로또 만들기 자동만 가능
		 * - 사용자 번호 (6자리) 
		 * - 당첨 번호 (7자리)
		 * */ 

		int user[] = new int[6];
		int lotto[] = new int[7];

			

		Exam01 e =  new Exam01();
		e.bo(user);
		//System.out.println(Arrays.toString(user));
		e.bo(lotto);
		//System.out.println(Arrays.toString(lotto));
		
		System.out.println("--유저번호--");
		e.printArray(user);
		System.out.println("--당첨번호--");
		e.printArray(lotto);
		
		int ranking = e.ranking(user, lotto);
		if(ranking == -999999) {
			System.out.println("배열오류!!");
		}else if(ranking == 0) {
			System.out.println("꽝!!");
		}else {
			System.out.println(ranking+"등 당점!!!");
		}



	}



}
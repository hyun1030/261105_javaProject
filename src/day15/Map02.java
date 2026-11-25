package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목 / 점수 를 저장하는 map을 생성
		// 과목, 점수 => 입력 받아 map 추가
		// 종료키워드가 나올 때까지 반복(1=계속, 0=종료)
		// 출력, 합계, 평균 출력
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		while(true) {
			System.out.print("과목을 입력하세요 > ");
            String subject = scan.next();
            
            System.out.print("점수를 입력하세요 > ");
            int score = scan.nextInt();
            
            map.put(subject, score);
            System.out.println(map);
            System.out.print("계속 입력하시겠습니까? (1=계속, 0=종료)");
            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            }
		}
		
		System.out.println(map.entrySet());
		int sum = 0; 
		for(int score : map.values()) {
			sum += score;
		}
		
		double avg = (double) sum / map.size(); 
		
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
	
		
		scan.close();

	}

}

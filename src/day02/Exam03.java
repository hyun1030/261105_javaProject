package day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성 (0~100)
		// 각 점수를 출력 합계, 평균, pass
		// pass 평균이 80이상이면 상 / 60점 이상이면 중 / 나머지는 하

		// 5명의 값을 출력 (for문을 이용)

		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		// (int)(Math.random()*count)+start
		// random Class 사용시 -> random.nextInt(count)+start
		int kor = (int) (Math.random() * 100); // 0~100
		int eng = (int) (Math.random() * 100);
		int math = (int) (Math.random() * 100);

		// 국어,영어,수학 점수를 랜덤으로 생성(0~100)
		//System.out.println("국어 점수 랜덤 생성 >");
		//System.out.println(kor);

		//System.out.println("영어 점수 랜덤 생성 >");
		//System.out.println(eng);

		//System.out.println("수학 점수 랜덤 생성 >");
		//System.out.println(math);

		// 합계, 평균
		int total = kor + eng + math;
		double avg = (double) total / 3;

		String pass = "";

		// 상 중 하 확인
		if (avg >= 80) {
			pass="상";
		} else if (avg >= 60) {
			pass="중";
		} else {
			pass="하";
		}
		System.out.println((i+1)+".학생");
		System.out.println("국어"+kor+ "영어"+eng+ "수학"+math);
		System.out.println("합계 : " + total+"평균 :" + avg + "pass: "+pass);
		System.out.println("-------------------");
		
		
		//for문 사용 5명의 데이터 출력
		
		
		
		
		
		
		
		

		// System.out.println("합계 : " + total);
		// System.out.println("평균 : " + avg);

	}

	}
	}

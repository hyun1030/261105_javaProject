package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// Report class 객체 생성 => 실행
		// 성적 산출 인원 > 3 (입력) scanner 사용
		// 이름, 국어, 영어, 수학 (입력)
		/* 이름 국어 영어 수학 합계 평균 등수 \t
		 * hong 89  85  78  00  00  00
		 * kim  89  85  78  00  00  00
		 * lee  89  85  78  00  00  00
		 * 
		 * 
		 * */
		// Report[] = new Report[count];
		// Report 객체가 들어가는 배열 
		// Report r = new Report ("이름", 78,89,85);
		// report[0] = r;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 산출 인원 > ");
		int count = scan.nextInt();

		Report[] report= new Report[count];
		for (int i=0; i<count; i++) {
			System.out.println((i+1)+"번 이름, 국어, 영어, 수학 순으로 입력 > ");
			String name =scan.next();
			int kor = (int)(Math.random()*70)+30;
			int eng = (int)(Math.random()*70)+30;
			int math = (int)(Math.random()*70)+30;
			report[i] = new Report(name, kor, eng, math);
			
		}
		
		//순위
		for(int i=0; i<count; i++) { // 내꺼
			int rank = 1;
			for(int j=0; j<count; j++) { // 비교대상
				if(report[i].getAvg() < report[j].getAvg() ) {
					rank++;
				}
			}
			// 내 순위 저장
			report[i].setRank(rank);
		}
		
		// 출력
		System.out.println("이름\t 국어\t 영어 \t수학\t 합계\t 평균\t 등수\t");
		System.out.println("-----------------------------------------");
		for(Report tmp:report) {
			System.out.println(tmp);
		}
		
//		
		
		
		
//		Report r = new Report("hong", 78,89,85);
		
		
//		System.out.println(r); // r.toString();
//		
//		Report r1 = new Report();
//		r1.setName("kim");
//		r1.setKor(78);
//		r1.setEng(89);
//		r1.setMath(85);
//		r1.sum();
//		r1.avg();
//		System.out.println(r1);
//		
//		
//		report[0] = r;
//		report[1] = r1;
		//System.out.println(Arrays.toString(report));
		
		

		
		
		scan.close();

	}

}

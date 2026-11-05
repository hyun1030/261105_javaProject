package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 합계, 평균, pass 출력
		// 입력받은 점수는 0~100 범위 안에 있어야함
		// return; 해당 메서드를 빠져나오는 키워드
		
		Scanner scan = new Scanner(System.in);
		//과목입력
		System.out.println("국어점수를 입력해주세요 > ");
		int kor = scan.nextInt();
		System.out.println("점수: "+kor);
		
		if(kor>100 || kor <0) {
			System.out.println();
			return;
		} 
		
		
		System.out.println("영어점수를 입력해주세요 > ");
		int eng = scan.nextInt();
		System.out.println("점수: "+eng);
		
		if(eng>100 || eng <0) {
			System.out.println(); 
			return;
		} 
		
		
		System.out.println("수학점수를 입력해주세요 > ");
		int math = scan.nextInt();
		System.out.println("점수: "+math);
		
		if(math>100 || math <0) {
			System.out.println();
			return;
		} 
		
		System.out.println("합계 : " + (kor + eng + math));
		System.out.println("평균 : " + (double)(kor + eng + math)/3);
		
		
	
		scan.close();
		
		
		
		

	}

}

package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고 합계와 평균을 출력
		// 각 점수는 0~100 => 점수가 잘못 입력되었습니다. 문구 출력
		// pass : 평균이 60점 이상이면 합격 아니면 불합격 if문 이용 
		
		int kor = 60;
		int eng = 85;
		int math = 105;
		// 같은 자료형일 때 같이 묶어서 사용 가능함 int kor = 60, eng = 85, math = 105;
		
		if(kor <= 100 && kor >=0 ) {
			if (eng <= 100 && eng >=0) {
				if (math <=100 && math >=0) {
					int total = kor + eng + math;
					
					double avg = total / (double)3;
					
					System.out.println(total);
					System.out.println(avg);
					
					String pass = avg >= 60 ? "합격":"불합격";
					System.out.println(pass);
				} else {
					System.out.println("math점수가 잘못되었습니다.");
				}
			} else {
				System.out.println("eng점수가 잘못되었습니다.");
			}
			
		} else {
			System.out.println("kor점수가 잘못되었습니다.");
		}
		
		
		//2. 각 점수의 조건이 맞지 않으면 계산하지 마시오.
		if((kor>100 || kor<0) || (eng>100 || eng<0) || (math>100 || math<0)) {
			//계산불가
			System.out.println("점수가 잘못되었습니다.");
		}else {
			int total = kor + eng + math;
			double avg =(double)total/3;
			
			System.out.println("total :" +total + "average :" +avg);
			
			if(avg >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
			// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
			System.out.println(avg>=60 ? "합격":"불합격");
			
			String pass = avg >=60 ? "합격" : "불합격";
			}
		}
				
		
		
		
		
	}



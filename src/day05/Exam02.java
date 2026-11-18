package day05;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성별, 나이를 출력
		//String regNum = "990101-1234567"; // 1999년생 => 1(남), 2(여)
		 String regNum = "010101-4234567"; // 2000년생 => 3(남), 4(여)
		
		// 출력결과
		/* 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28
		 * */
		
		int today = 2026;
		int year = Integer.parseInt(regNum.substring(0,2));
		String gen = regNum.substring(7,8);
		
		System.out.println("생년월일 : " + regNum.substring(0,regNum.indexOf("-")));

		// System.out.println(regNum.substring(7,8)); // 주민번호 뒷자리 맨 처음
		
		if(gen.equals("1") || gen.equals("2") ) {
			year = year+1900;
			
		} else {
			year = year+2000;
			
			
		}
		int age= today-year;
		System.out.println("나이 : " + age);
		
		System.out.println(gen.equals("1")|| gen.equals("3")? "성별 : 남 ":"성별 : 여");
		
		
		
		


	}

}

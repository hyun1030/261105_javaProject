package day10;

public class StudentMain {

	public static void main(String[] args) {
		/* 학생 정보를 관리하기 위한 클래스 생성
		 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
		 * 학원정보 : 학원명(final) = "더조은", 지점
		 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
		 * 			수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
		 * 			같은 번지는 같은 값으로 인지
		 * 
		 * ex) 홍길동, 010-1111-1111, 인천, 000505
		 * 	   더조은, 인천지점
		 *     AI풀스택, 26.11.02 ~ 27.05.17
		 *     JAVA,   26.10.01 ~ 26.11,01
		 * */
		
		Student s = new Student("홍길동","010-111-1111");
		Student s1 = new Student("김영이","010-111-2222", "인천", "000505", "부평");
		Student s2 = new Student("김영석","010-111-3333", "부천", "000505", "부천");
		Student s3 = new Student("김영철","010-111-4444", "인천", "000505", "부평");
		Student s4 = new Student("김영수","010-111-5555", "서울", "000505", "신촌");
		Student s5 = new Student("김철수","010-111-6666", "인천", "000505", "부평");
		
		s.printInfo();
		s.printCompany();
		s.printCourse();
		
		System.out.println();
		s1.printInfo();
		s1.printCompany();
		
		s1.insertCourse("AI풀스텍", "26.11.02 ~ 27.05.17");
		s1.insertCourse("Java", "26.10.01 ~ 26.11,01");
		s1.printCourse();
		
		s2.insertCourse("AI풀스텍", "26.11.02 ~ 27.05.17");
		s2.insertCourse("Java", "26.10.01 ~ 26.11,01");
		
		s3.insertCourse("AI풀스텍", "26.11.02 ~ 27.05.17");
		s3.insertCourse("Java", "26.10.01 ~ 26.11,01");
		
		Student[] student = new Student[6];
		student[0] = s;
		student[1] = s1;
		student[2] = s2;
		student[3] = s3;
		student[4] = s4;
		student[5] = s5;
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		
		//인천 사는 학생만 출력 - 학원정보, 학생정보, 수강정보
		for(int i=0; i<student.length; i++) {
			if(student[i].getAddress() != null && student[i].getAddress().equals("인천")) {
				student[i].printCompany();
				student[i].printInfo();
				
			}
		}
		System.out.println("----------------------------");
		
		//AI 풀스텍 과정을 수강하는 학생만 출력
		int cnt = 0; // i
		while(cnt < student.length) {
			//System.out.println(student[cnt]);
			for(int i=0; i<student[cnt].getIndex(); i++) {
				//System.out.println("1");
				if(student[cnt].getCourse()[i].equals("AI풀스텍")) {
					//System.out.println("2");
					student[cnt].printInfo();
					student[cnt].printCourse();
					
				}
			}
			cnt++;
		}
		
	
		
		

	}

}

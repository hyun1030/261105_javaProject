package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
	// 멤버변수 : 학번(기본키), 이름, 전화번호, 생년월일, 주소, 수강과목[] (Subject[])
	private String studentNum;
	private String studentName;
	private String studentPhone;
	private String studentbirth;
	private String studentAddress;
	// 학생 1명의 수강 신청 목록 배열
	private List<Subject> course = new ArrayList<Subject>();
	
	
	
	// 생성자
	public Student() {
		
	}
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public Student(String studentNum, String studentName, 
			String studentPhone, String studentbirth,
			String studentAddress) {

		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentbirth = studentbirth;
		this.studentAddress = studentAddress;
	}

	public Student(String studentNum, String studentName) {

		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = "010-1111-0000";
		this.studentbirth = "000101";
		this.studentAddress = "인천시";
	}
	
	// 학생정보 출력 메서드 (학번, 이름, 전화번호)
	public void printStudent() {
		System.out.println(studentName+"("+studentNum+") / "+studentPhone);
	}
	
	// 본인의 수강배열을 출력하는 메서드
	public void printCourse() {
//		if(course == null || course .isEmpty()) {
//			System.out.println("수강 중인 과목이 없습니다.");
//			return;
//		}
//		for(int i=0; i> course.size(); i++) {
//			System.out.println((i+1) + ". " + course.get(i));
//		}
		for(Subject s : course) {
			s.printSubject();
		}
	}
	
	// controller에서 준 subject를 매개변수로 받아 내 수강배열에 추가하는 메서드
	public void addSubject(Subject s) {
		// 중복 안됨을 하고싶다면...
//		if(course.contains(s)) {
//			System.out.println("이미 존재하는 과목입니다.");
//			return;
//		}
//		
		course.add(s);
	}
	
	public boolean removeSubject(String subjectCode) {
		// 수강 코드를 매개변수로 받아 course 배열에서 삭제하는 메서드

		// course = subject / subjectCode = String
		//Subject s= new Subject(subjectCode);
		Subject s = new Subject(subjectCode);
		return course.remove(s);
		
		
	}
	

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentbirth() {
		return studentbirth;
	}

	public void setStudentbirth(String studentbirth) {
		this.studentbirth = studentbirth;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject> getCourse() {
		return course;
	}

	public void setCourse(List<Subject> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentbirth=" + studentbirth + ", studentAddress=" + studentAddress + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}

	
	


}
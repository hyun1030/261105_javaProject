package StudertManager;

import java.util.Arrays;
import java.util.Scanner;

import day12.Order;

public class StudentController implements StudentProgram{
	
	private Subject[] subjectList = new Subject[5]; // 강의목록
	private Student[] studentList = new Student[5]; // 학생목록
	private int stdIndex;
	
	public StudentController () {
		subjectList[0] = new Subject("java", "1강의장", "9:00~12:00", "월,수,금");
		subjectList[1] = new Subject("DB", "2강의장", "13:00~18:00", "월,수,금");
		subjectList[2] = new Subject("HTML", "3강의장", "9:00~16:00", "월,수,금");
		subjectList[3] = new Subject("CSS", "4강의장", "15:00~18:00", "월,수,금");
		subjectList[4] = new Subject("JS", "5강의장", "19:00~22:00", "월,수,금");

		studentList[0] = new Student("홍길동", "000101", "010-1111-1111", "인천");
		stdIndex = 1;
	}
	
	
	// 학생 등록
	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생이름을 입력해주세요");
		String name = scan.next();
		
		System.out.println("생년월일을 입력해주세요.");
		String birth = scan.next();
		
		System.out.println("전화번호를 입력해주세요.");
		String phone = scan.next();
		
		System.out.println("주소를 입력해주세요.");
		String address = scan.next();
		
		System.out.println("과목을 입력해주세요.");
		String course = scan.next();
		
		studentList[stdIndex] = new Student(name, birth, phone, address);
		stdIndex++;
		
		System.out.println("학생 등록이 완료되었습니다.");
		System.out.println(name + " (" + birth+ ") " + phone);
		
		
		
	
	}
		
		
	

	// 학생 리스트 출력
	@Override
	public void printStudentList() {
		// TODO Auto-generated method stub
		System.out.println("학생 리스트 보기");
		if(stdIndex == 0) {
			System.out.println("등록된 학생이 없습니다.");
		}
		for(int i=0; i<stdIndex; i++) {
			System.out.println((i+1) + "." + studentList[i]);
			
		}
		if(stdIndex == this.subjectList.length) {
			String[] courseTemp = new String[this.subjectList.length+5];
			
		}
	}
	
	// 학생 검색(학생정보, 수강정보)
	@Override
	public void SearchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("검색할 이름을 입력해주세요");
		String name = scan.next();
		
		boolean lost = false;
		for(int i=0; i<stdIndex; i++) {
			if(studentList[i].getName().equals(name)) {
				
				System.out.println(studentList[i]);
				if(studentList[i].getCourse() == null) {
					System.out.println("수강정보가 없습니다.");
					
				} else 
				System.out.println(Arrays.toString(studentList[i].getCourse() ));
				
				lost = true;
			}
		}
		if(!lost) {
			System.out.println("일치하는 학생이 없습니다.");
		}
		
		
	}
	
	// 학생 선택 => 수강신청(한 학생에 대한 수강 등록)
	@Override
	public void insertSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("수강신청");
		String name = scan.next();
		
		
		Subject s = subjectList[0-1];
		//studentList[i].add(s);
		
		
		
		
		
//		if(studentList.length == stdIndex) {
//			Student[] tmp = new Student[studentList.length+3];
//			System.arraycopy(studentList, 0, tmp.length, 0,studentList.length);
//			studentList = tmp;
//		}
		
		
	}

	// 학생 선택 => 수강취소(한 학생이 등록한 수강 취소)
	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("수강취소");
		
	}
	
}

package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentController implements StudentProgram{ 
	// 학생목록을 저장하는 리스트
	private List<Student> studentList = new ArrayList<>();
	
	// 수강신청을 위한 과목 목록 리스트
	private List<Subject> subjectList = new ArrayList<>();
	

	public StudentController () {
		subjectList.add(new Subject("111", "JAVA", "1강의장", "4", "월수금"));
		subjectList.add(new Subject("222", "DB", "2강의장", "4", "화목"));
		subjectList.add(new Subject("333", "HTML", "3강의장", "4", "월수금"));
		subjectList.add(new Subject("444", "javascript", "4강의장", "4", "월수금"));
		subjectList.add(new Subject("555", "C언어", "5강의장", "4", "화목"));
		
		studentList.add(new Student("1","홍길동"));
		studentList.add(new Student("2","김영이"));
		
	}
	
	// 학생등록
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학번을 등록해주세요.");
		String num = scan.next();
		
		System.out.println("이름을 등록해주세요.");
		String name = scan.next();
		
		// 학번을 이용하여 이미 등록된 학생인지 검색
		if(studentList.contains(new Student(num))) {
			System.out.println("이미 등록된 학생입니다.");
			return;
		}
		
		studentList.add(new Student(num, name));
		
		
	}
	
	// 수강과목 리스트 출력
	public void printSubject() {
		System.out.println("--과목 목록--");
		for(Subject s : subjectList) {
			s.printSubject();
		}
	}

	// 학생 리스트
	@Override
	public void printStudentList() {
		// 전체 학생 리스트 출력
		System.out.println("--학생명단--");
		for(Student s : studentList) {
			s.printStudent();
		}
		System.out.println("-------------");
	}

	// 학생 조회
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("학번 >");
		String num = scan.next();
		
		// contains (있는지 여부) / indexOf(번지를 리턴)
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		// 학생 기본정보
		studentList.get(index).printStudent();
		// 학생 수강정보
		studentList.get(index).printCourse();
	}

	// 수강신청
	@Override
	public void insertSubject(Scanner scan) {
		// 학번을 입력받아 있는 학생인지 확인 => 그 학생에게 수강 정보를 입력받아 전달
		System.out.println("학번 >");
		String num = scan.next();
		
		// contains (있는지 여부) / indexOf(번지를 리턴)
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		
		// 수강 신청 리스트 출력
		printSubject();
		System.out.println("수강신청할 과목번호 > ");
		String subjectNum = scan.next();
		Subject s = new Subject(subjectNum);
		int subIndex = subjectList.indexOf(s);
		
		if(subIndex == -1) {
			System.out.println("해당 과목코드는 존재하지 않습니다.");
			return;
		}
		studentList.get(index).addSubject(subjectList.get(subIndex));
		
		// addSubject를 Student 객체에 안만들었다면...
		//studentList.get(index).getCourse().add(subjectList.get(subIndex));
	}

	// 수강취소
	@Override
	public void deleteSubject(Scanner scan) {
		// 학번 검색 후 => 나의 수강신청 목록 => 삭제할 수강번호 선택 => 삭제
		System.out.println("학번 >");
		String num = scan.next();
		
		// contains (있는지 여부) / indexOf(번지를 리턴)
		int index = studentList.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		
		studentList.get(index).printCourse();
		System.out.println("삭제할 과목 번호 > ");
		String subjectCode = scan.next();
		boolean ok = studentList.get(index).removeSubject(subjectCode);
		
		System.out.println(ok ? "취소완료!" : "해당과목이없습니다.");
		
		
	}

}

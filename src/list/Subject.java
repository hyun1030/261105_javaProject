package list;

import java.util.List;
import java.util.Objects;

public class Subject {
	private String subjectCode;
	private String subjectName;
	private String subjectRoom;
	private String subjectTime;
	private String subjectWeek;
	
	public Subject(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	 
	
	public Subject(String subjectCode, String subjectName, String subjectRoom, String subjectTime, String subjectWeek) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectRoom = subjectRoom;
		this.subjectTime = subjectTime;
		this.subjectWeek = subjectWeek;
	}
	
	// toString : 모든 멤버변수와 값을 확인하기 위한 용도
	// 과목정보 출력 메서드
	public void printSubject() {
		System.out.println(subjectCode + "." + subjectName + "(" + subjectTime +"/" + subjectWeek+ ") =>"  + subjectRoom);
	}
	
	public Subject() {}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectWeek() {
		return subjectWeek;
	}

	public void setSubjectWeek(String subjectWeek) {
		this.subjectWeek = subjectWeek;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectRoom=" + subjectRoom
				+ ", subjectTime=" + subjectTime + ", subjectWeek=" + subjectWeek + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(subjectCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(subjectCode, other.subjectCode);
	}
	
	
	
	
}

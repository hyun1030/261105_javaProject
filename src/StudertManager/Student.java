package StudertManager;

import java.util.Arrays;

public class Student {
	
	private String name;
	private String birth;
	private String phone;
	private String address;
	private Subject course[];
	
	public Student() {}

	public Student(String name, String birth, String phone, String address) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.address = address;
		this.course = new Subject[5];
		
	}
	
	public void add (Subject s) {
		int index = 0;
		course[index] = s;
		index++;

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public Subject[] getCourse() {
		return course;
	}

	public void setCourse(Subject[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return  name +" " + birth +" " + phone + " " + address;
	}



}

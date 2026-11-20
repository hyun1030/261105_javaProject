package StudertManager;

public class Subject {

	private String name;
	private String place;
	private String time;
	private String week;
	
	//생성자
	public Subject() {
		
	}
	
	public Subject(String name, String place, String time, String week) {
		this.name = name;
		this.place = place;
		this.time = time;
		this.week = week;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", place=" + place + ", time=" + time + ", week=" + week + "]";
	}
	
	

}

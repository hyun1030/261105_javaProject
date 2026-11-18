package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성 (string)
		// 학생이름, 국어점수, 영어점수, 수학점수 를 객체로 하는 클래스 생성 (int)
		// 이름 (국어, 영어, 수학) => 출력메서드
		// 메서드를 호출하면 국어+영어+수학 리턴되는 => 합계메서드
		// 메서드를 호출하면 합계 / 3 평균이 리턴되는 => 평균메서드
		// 각각 멤버변수의 getter/setter 생성 setter에 if...
		
		StudentClass s = new StudentClass();
		s.print();
		
		int kor=s.getKor();
		System.out.println(kor);
		
		s.setName("kim");
		s.setKor(90);
		s.setEng(50);
		s.setMath(60);
		s.print(); 
		int sum = s.sum();
		System.out.println("합계 :"+sum);
		double avg = s.avg();
		System.out.println("평균 :"+s.avg());
		
	
	}

}

class StudentClass {
	
	private String name;
	private int kor; // 점수가 있다고 생각해야함
	private int eng;
	private int math;
	
	public void print() {
		System.out.println
		(this.name+"("+this.kor+","+this.eng+","+this.math+")");
	}
	
	//메서드를 호출하면 국어+영어+수학 리턴되는 => 합계메서드
	/* 매개변수 : x
	 * 메서드명 : sum
	 * 리턴타입 : int (합계)
	 * */
	public int sum() {
		return kor+eng+math;
	} 
	public double avg () {
		return sum()/(double)3;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
	// setter
	public void setName(String name) {
		this.name=name;
	}
	public void setKor(int kor) {
		if(kor<0 || kor>100) {
			return;
		}
		this.kor=kor;
		
	}
	public void setEng(int eng) {
		if(eng<0 || eng>100) {
			return;
		}
		this.eng=eng;
		
	}
	public void setMath(int math) {
		if(math<0 || math>100) {
			return;
		}
		this.math=math;
		
	}
	
	
}
package day10;

import java.text.DecimalFormat;

public class Report {

	// 한사람 성적 클래스
	// 멤버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	// 생성자 : 이름, 국어, 영어, 수학 => 매개변수로 등록
	// 기본생성자도 같이 오버로딩 해서 생성
	// 합계, 평균 계산
	// # : 선택 해당 자리수가 있으면 출력 없으면 안함
	// 0 : 필수 해당 자리수가 없으면 0으로 맞춰서 출력
	// 출력 => 평균은 소수점 2자리 DecimalFormat("##.00")
	// DecimalFormat("##.00") => 객체명.format(avg)
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	public Report() {}
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum();
		avg();
		//this.rank = rank;
		
		
	}
	
	public void print() {
		System.out.println
		(this.name+"("+this.kor+","+this.eng+","+this.math+")");
	}
	
	
	
	public void sum() {
		this.sum = kor+eng+math;
		//return kor+eng+math;
	}
	
	public void avg() {
		this.avg = (double)(kor+eng+math) / 3;
		 
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor<0 || kor>100) {
			return;
		}
		this.kor=kor;
	}
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(eng<0 || eng>100) {
			return;
		}
		this.eng=eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(math<0 || math>100) {
			return;
		}
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		DecimalFormat d= new DecimalFormat("##.00");
		return "Report [name=" + name + ", \t kor=" + kor + ", \t eng=" + eng + ", \t math=" + math + ",\t sum=" + sum + ",\t avg="
				+ d.format(avg)+ ",\t rank=" + rank + "]";
	}
	
	
	
	
	
}




package day01;

public class Exam01 {

	public static void main(String[] args) {
		// % 나눈 나머지를 나타내는 연산자 // 삼항연산자
		// number의 수가 짝수인지 홀수인지 출력
		
		int number= 8;
		int mod = number % 2;
		System.out.println(mod);
		System.out.println(mod == 1 ? "홀수" : "짝수");
	}

}

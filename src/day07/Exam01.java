package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {
	
	// 합계를 메서드로 분리
	// 숫자배열을 입력받아서 배열의 합계를 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 메서드명 : sum
	 * 리턴타입 : 합계 => int
	 * 
	 * */
	public int sum(int[] arr){
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		return sum;
	}
	
	// 평균
	// 숫자배열을 입력받아서, 배열의 평균을 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 메서드명 : avg
	 * 리턴타입 : double
	 * 
	 * */
	public double avg(int[] arr) {
		// 합계 / arr.length;
		if(arr == null) {
			System.out.println("처리할 수 없습니다.");
			return -999999;
		}
		if(arr.length <=0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -999999;
		}
		return sum(arr) / (double)arr.length; 
	}
	
	// 문자배열을 입력받아서, 숫자배열로 리턴하는 메서드
	/* 매개변수 : 문자배열 : String[] arr
	 * 메서드명 : changeArr
	 * 리턴타입 : 숫자배열 : int[]
	 * */
	public int[] changeArr(String[] arr){
		int num[] = new int[arr.length]; // 새로운 배열 만들기
		for(int i=0; i<arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			
		}
		return num;
		
	}
	
	// 문자배열, 숫자 배열을 입력받아서 문자배열의 값을 숫자배열로 채우는 메서드
	/* 매개변수 : 문자배열: String[]arr, 숫자배열: int[] arr2
	 * 메서드명 : changeArr2
	 * 리턴타입 : void : 없음
	 * */
	
	public void changeArr2(String[]arr, int[] arr2) {
		if(arr==null || arr[0] == null || arr.length <=0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		// 문자 배열보다 숫자배열의 길이가 작을 때
		if(arr.length !=arr2.length){
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			
		}
	}

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 =>1+2+3+4+5 => 합계 / 평균 출력
		 * 입력을 String으로 받아 한자리 수로 분해 (배열 사용)
		 * 789456 => 7+8+9+4+5+6 => 합계 / 평균
		 * 
		 * 반복 (0 또는 음수를 입력하면 종료) break
		 * 
		 * ex) 숫자를 입력하세요(0 또는 음수는 종료) > 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력(0 또는 음수면 종료) >");
			String number = scan.next();
			
			if(Integer.parseInt(number) <= 0) {
				System.out.println("종료");
				break;
			}
			
			if(number.equals("0")  || number.charAt(0) == '-') {}
			
			String[] str = number.split(""); // 한글자씩 분리 => 배열
			int[] num = new int[str.length];
			
			//int sum=0;
			//for(int i=0; i<str.length; i++) {
			//	num[i] = Integer.parseInt(str[i]);
			//	sum += num[i];
			//}
			
			// 메서드 호출
			Exam01 e = new Exam01();
			
			// 문자 배열을 주고, 새로운 숫자 배열로 리턴
			//int[] num = e.changeArr(str);
			e.changeArr2(str,num);
			int sum = e.sum(num);
			System.out.println(sum);
			double avg=e.avg(num);
			if(avg== -999999) {
				System.out.println();
			}
			
			
			//출력
//			for(int i=0; i<num.length-1; i++) {
//				System.out.print(num[i]+" + ");
//			}
//			System.out.println(num[num.length-1]); // 마지막 값 별도 출력
			
			// split : 나누기 / join : 배열 => String
			// String.join("구분자", 배열);
			
			String p = String.join(" + ",str);
			System.out.println(p);
			
			System.out.println();
			System.out.println("합계: "+sum +" / 평균: "+ (sum/(double)num.length));
			
			
			
		}while(true);
		
		scan.close();

	}

}
package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아(scan) 리스트로 출력
		 * 출력 => 전체 합계 출력
		 * 입력 형식 String => String[] => list<Integer>
		 * 47,85,96,45,69,85,63,26,15 enter
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요. > ");
		String num = scan.next(); // 공백없음 / nextLine() 공백O
		
		List<String> list = new ArrayList<>();
		System.out.println(list);
 
		System.out.println(Arrays.toString(num.split(",")));
		
		int sum = 0;
		for(int i=0; i<num.split(",").length; i++) {
			sum += Integer.parseInt(num.split(",")[i]);
			list.add((num.split(",")[i]));
			
		}
		
		System.out.println("총합계 : "+sum);
		System.out.println(list);
		

		
		
		scan.close();

	}

}

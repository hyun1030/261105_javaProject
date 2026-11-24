package day14;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		// list를 생성하여 1~10까지 반복문을 이용하여 추가하고 출력 add
		// syso(list) 말고 반복문으로 돌려서 출력
		
		// 1. index = 4 값을 11로 변경 => set
		
		// 2. list에 1의 값이 있는지 확인 => contains
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(list.get(i));
		}
		
		list.set(4, 11);
		
		System.out.println(list);
		System.out.println(list.contains(1));
		
		

	}

}

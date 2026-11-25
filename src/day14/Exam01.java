package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		// list를 생성하여 1~10까지 반복문을 이용하여 추가하고(add) => 출력(get)
		// syso(list) 말고 반복문으로 돌려서 출력
		
		// 1. index = 4 값을 11로 변경 => set
		
		// 2. list에 1의 값이 있는지 확인 => contains
		// list 배열과 다르게 미리 칸을 준비하지 않음
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list); // =>toString
		
		// list, set, map => index를 가지는 건 list 뿐
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------향상된 for문 출력-------");
		// 향상된 for 문
		int sum = 0;
		for(int temp : list) {
			sum += temp;
			System.out.println(temp);
			
		}
		System.out.println("sum : "+sum);
		
		
		
		// Iterator (반복자) : index가 없는 구조를 출력하기 위한 객체
		// set, map 같은 index가 없는 구조에서 사용
		// 순서와 상관없이 값을 가져올 수 있는 구문
		// 향상된 for문과 동일하게 동작
		
		System.out.println("----Iterator출력----");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // 요소가 있는지 확인
			int tmp = it.next(); // 요소 값 가져오기
			System.out.println(tmp);
		}
		
		// set, contains
		//list.set(4, 11); // 변경
		
		//System.out.println(list); 
		System.out.println(list.set(4, 11)); // 변경 => 변경 전 값을 리턴
		System.out.println(list.contains(1)); // true / false
		
		// indexOf(값) : 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(44);
		list.add(62);
		list.add(88);
		list.add(21);
		System.out.println(list);
		
		// 정렬
		Collections.sort(list); // 오름차순만 가능
		System.out.println(list);
		

	}

}

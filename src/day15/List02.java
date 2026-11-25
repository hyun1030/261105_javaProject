package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가지 정도 저장하고 => 출력 (향상된 for문 / Iterator) list.add
		
		// 1. 내 리스트에 '사과'가 있으면 '사과판매' / 없으면 '재고없음' 출력
		
		List<String> list = new ArrayList<>();
		
		list.add("메론");
		list.add("복숭아");
		list.add("포도");
		list.add("자두");
		list.add("수박");
		
		System.out.println(list);
		
		// 향상된 for문
		for(String fruit : list) {
			System.out.println(fruit);
		}
		
		// Iterator
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { 
			String fruit = it.next(); // String fruit = (String)it.next(); 형변환 가능
			System.out.println(fruit);
		}
		
		// 내 리스트에 '사과'가 있으면 '사과판매' / 없으면 '재고없음' 출력
		if(list.contains("사과")) {
			System.out.println("사과판매");
			
		} else {
			System.out.println("재고없음");
		}
		
		// 삼항연산자
		String fruit = list.contains("사과") ? "사과판매" : "재고없음";
		System.out.println(fruit);
		
		// indexOf
		if(list.indexOf("사과") != -1) {
			System.out.println("사과판매");
		} else {
			System.out.println("재고없음");
		}
		

	}

}

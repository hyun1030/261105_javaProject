package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnnoymousClass02 {

	public static void main(String[] args) {
		/* 리스트 생성
		 * 1~100까지 랜덤수 10개 저장하는 리스트 만들기 => 출력
		 * 
		 * 
		 * */
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<10; i++) {
			//System.out.println((int)(Math.random()*100));
			list.add((int)(Math.random()*100)+1);
		}
		System.out.println(list);
		
		// 정렬 Collections.sort() : 오름차순정렬
//		Collections.sort(list);
//		System.out.println(list);
		
		// list.sort(Comparator 구현한 구현객체) : 정렬
		
		list.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// String => compareTo 사전순으로 비교하며 앞에 있으면 -, 뒤에있으면 + 같으면, 0
				// 숫자 크기로 크고 작음을 알 수 있음
				// - 빼보면 앞으 수가 작으면 - / 앞의 수가 크면 +
				// 오름차순 o1 - o2
				// 내림차순 o2 - o1
				// 문자의 경우 o1.compareTo(o2) / o2.compareTo(o1) 
				return o2 - o1;
			}
			
		});
		System.out.println(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("kiwi");
		list2.add("apple");
		list2.add("grape");
		list2.add("banana");
		list2.add("orange");
		System.out.println(list2);
		
		list2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 문자의 경우 o1.compareTo(o2) : 오름차순 / o2.compareTo(o1) : 내림차순
				return o2.compareTo(o1);
			}
			
			
		});
		System.out.println(list2);
		
		
		
		

	}

}

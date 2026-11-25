package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// Set : index가 없음 (순서보장x, 정렬불가능)
		// 정렬이 안됨
		// HashSet / TreeSet
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(8);
		set.add(1); // 중복은 덮어씀
		set.add(9);
		set.add(3);
		System.out.println(set);
		
		
		// get() : index의 값을 가져오기, set(index, 값) : 변경
		// list에 있는 메서드는 같은 의미로 사용
		set.contains(8);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// set은 중복제거를 위해 사용 =>list로 변환하여 사용
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		list.add(6);
		System.out.println(list);

	}

}

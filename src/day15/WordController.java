package day15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController implements Word {
//	Map<String, List<String>> voca = new HashMap<>();
//	하나의 단어에 뜻이 여러개인 값을 저장하기 위한 클래스
//	private int no;
//	private String word;
//	private List<String> mean = new ArrayList<>();
//	List<클래스>
	
	
	// 1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
	private Map<String, String> map = new HashMap<>();
	
	public WordController() {
		map.put("사과", "apple");
		map.put("엄마", "mom");
		map.put("아빠", "dad");
		map.put("컵", "cup");
		map.put("강아지", "dog");
		
		//System.out.println(map);
	}
	
	// 단어등록
	@Override
	public void insertWord(Scanner scan) {

		System.out.println("단어와 뜻을 입력해주세요 > ");
		
		String name = scan.next();
		String mean = scan.next();
		// 앞의 단어에서 입력한 enter 이 입력버퍼에 남아있어서 다음 nextLine()에 영향을 미침
		scan.nextLine();
		// 뜻에 공백을 같이 포함하려면 nextLine()
		
		map.put(name, mean);
		System.out.println(map.entrySet());
		System.out.println("단어등록완료");
		
		
	}
	
	// 단어검색
	@Override
	public void searchWord(Scanner scan) {
		String word1 = scan.next();
		//System.out.println("검색할 단어를 입력해주세요 > ");
		
		if(map.containsKey(word1)) {
			System.out.println(word1 + ":" + map.get(word1));
		} else {
			System.out.println("검색한 단어가 없습니다.");
		}
		
	}
	
	// 단어수정 
	@Override
	public void modifyWord(Scanner scan) {
		System.out.println("수정할 단어를 입력해주세요 > ");
		String word2 = scan.next();
		if(map.containsKey(word2)) {
			System.out.println("뜻 입력>");
			String mean2 = scan.next();
			//map.put(word2, mean2);
			map.replace(word2, mean2);
		} else {
			System.out.println("수정할 단어가 없습니다.");
		}
	}

	// 전체단어출력
	@Override
	public void printWord() {
		System.out.println(map);
		int cnt = 0;
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt + ". " + s + ":" + map.get(s));
		}
		System.out.println("--------------------------------------");
	}

	// 단어삭제 clear
	@Override
	public void removeWord(Scanner scan) {
		String word3 = scan.next();
		if(map.containsKey(word3)) {
			map.remove(word3);
		} else {
			System.out.println("삭제할 단어가 없습니다");
		}
		
//		if(map.remove(word3) == null) { // 삭제한 단어가 없다면...
//			System.out.println("삭제할 단어가 없습니다.");
//			return;
//		}
//		System.out.println("삭제완료");
		
	}

}

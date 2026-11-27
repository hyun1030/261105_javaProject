package wordPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordController {
	private List<Word> wordBook = new ArrayList<>();
	// 기본단어 추가
	// 1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
	public WordController() {
		
		List<String> list = new ArrayList<>(Arrays.asList("뜻1","뜻2","뜻3"));
		wordBook.add(new Word("강아지", list));
		
		List<String> list2 = new ArrayList<>(Arrays.asList("뜻1","뜻2","뜻3"));
		wordBook.add(new Word("고양이",list2));
		
		List<String> list3 = new ArrayList<>(Arrays.asList("뜻1","뜻2","뜻3"));
		wordBook.add(new Word("호랑이",list3));

	}
	
	// 1. 단어등록
	public void insertWord(Scanner scan) {
		System.out.println("단어를 입력해주세요 > ");
		String name = scan.next();
		List<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("뜻을 입력해주세요 > (종료 = 0번) ");	
			String mean = scan.next();
			scan.nextLine();
			
			if(mean.equals("0")) {
				System.out.println("종료되었습니다.");
				break;
			}
			list.add(mean);
		}
		wordBook.add(new Word(name,list));
	}
	
	// 2. 단어검색
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어를 입력해주세요 >");
		String word2 = scan.next();
		
		int wordIndex = wordBook.indexOf(new Word(word2));
		if(wordIndex == -1) {
			System.out.println("검색할 단어가 없습니다.");
			return;
		}
		wordBook.get(wordIndex).print();
	}
	
	// 4. 전체단어 출력
	public void printWordBook() {
		for(Word w : wordBook) {
			w.print();
		}
	}
	
	// 5. 단어삭제
	public void removeWord(Scanner scan) {
		System.out.println("삭제할 단어를 입력해주세요 > ");
		String word2 = scan.next();
		
		int wordIndex = wordBook.indexOf(new Word(word2));
		if(wordIndex == -1) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		wordBook.remove(wordIndex);
	}
	
	// 3. 단어수정
	public void modifyWord(Scanner scan) {
		System.out.println("수정할 단어를 입력해주세요 >");
		String word2 = scan.next();
		int wordIndex = wordBook.indexOf(new Word(word2));
		System.out.println(wordBook.get(wordIndex).getMean());
		
		System.out.println("수정할 뜻 번호");
		int no = scan.nextInt();
		System.out.println("수정할 내용 > ");
		String mean = scan.next();
		
		wordBook.get(wordIndex).getMean().set(no-1, mean);
		System.out.println(wordBook.get(wordIndex));
		
	}
	
}

package day15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		// 단어 : 뜻 =>  hello : 안녕
		// 1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
		
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		WordController wd= new WordController();
		
		
		//String menu = scan.nextLine();
		
		int menu = 0;
		do {
			System.out.println("1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료");
			System.out.println("메뉴 선택 > ");
			try {
				menu = scan.nextInt();
				
				switch(menu) {
				case 1 : wd.insertWord(scan); break;
				case 2 : wd.searchWord(scan); break;
				case 3 : wd.modifyWord(scan); break;
				case 4 : wd.printWord(); break;
				case 5 : wd.removeWord(scan); break;
				case 6 :
					System.out.println("종료입니다");
					break;
					default : System.out.println("잘못된 메뉴입니다.");
	
				}	
				
			} catch (InputMismatchException e) {
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine(); // 입력 버퍼 지우기
			} catch (Exception e) {
				System.out.println("다시 입력해주세요.");
				scan.nextLine();
			}
			

			
		} while (menu != 6);
		
		
		scan.close();

	}

}

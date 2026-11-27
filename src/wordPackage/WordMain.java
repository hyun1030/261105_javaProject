package wordPackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		// 1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
		Scanner scan = new Scanner(System.in);
		
		WordController wc = new WordController();
		List<String> list = new ArrayList<>();
		
		//wc.printWordBook();
		
		int menu = 0;
		do {
			System.out.println("1. 단어 등록 | 2. 단어검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료");
			System.out.println("메뉴를 선택해 주세요 > ");
			
			try {
				menu = scan.nextInt();
				
				switch(menu) {
				case 1: wc.insertWord(scan); break;
				case 2: wc.searchWord(scan); break;
				case 3: wc.modifyWord(scan); break;
				case 4: wc.printWordBook(); break;
				case 5: wc.removeWord(scan); break;
				case 6: 
					System.out.println("종료입니다.");
					break;
					default : System.out.println("잘못된 메뉴입니다.");
				
				
				}
			} catch (InputMismatchException e) {
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("다시 입력해주세요.");
				scan.nextLine();
				
			}
			
			
		} while(menu !=6);
		
		
		
		
		
		scan.close();
		
		
	}
	
	

}

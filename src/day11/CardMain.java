package day11;

public class CardMain {

	public static void main(String[] args) {
		// Card c = new Card() => ♥A
		/* ex) ♥A, ♥5, ♣11 => ♣J  / !2 => ♥2
		 * 범위에 없는 모양이면 => ♥
		 * 범위에 없는 숫자면 => 1 => A
		 * ♥, ◆, ♣, ♠
		 * */
		// 카드 팩 객체 생성
		CardPack cp =new CardPack();
		//Card play1 = cp.pick();
		
		//cp.getPack()[0].print(); // 출력
		
		System.out.println("딜러가 카드를 섞고 있습니다. ");
		// 섞기 메서드
		cp.CardMix();
		System.out.println(cp);
		
		Card[] play1= new Card[4];
		int play1Index =0;
		
		Card[] play2= new Card[4];
		int play2Index =0;
		
		Card[] play3= new Card[4];
		int play3Index =0;
		
		Card[] play4= new Card[4];
		int play4Index =0;
		
		// player 4명
		System.out.println("딜러가 카드를 나누고 있습니다. ");
		
		cp.pick().print();
		System.out.println();
		System.out.println("player1 카드 pick");
		
		// 메서드 호출
		cp.pick().print();
		System.out.println();
		System.out.println("player2 카드 pick");
		
		// 메서드 호출
		cp.pick().print();
		System.out.println();
		System.out.println("player3 카드 pick");
		
		// 메서드 호출
		cp.pick().print();
		System.out.println();
		System.out.println("player4 카드 pick");
		
		// 메서드 호출
		cp.pick().print();
		System.out.println();
//		System.out.println("player1 Card open!!");
//		
//		// 카드 출력
//		play1.print();
//		System.out.println();
//		System.out.println("player2 Card open!!");
//		// 카드 출력
//		System.out.println("player3 Card open!!");
//		// 카드 출력
//		System.out.println("player4 Card open!!");
		// 카드 출력
		
		// 카드회수
		cp.init();
		System.out.println(cp);
		
		
		
		
//		System.out.println("--------------------");
//		Card c = new Card();
//		//System.out.println(c);
//		c.print();
//		c.setShape("♣");
//		c.setNum(12);
//		c.print();
//		System.out.println();
//		System.out.println("------------------");
//		String shape[] = {"♥", "◆", "♣", "♠"};
//		
//		for(int i=0; i<shape.length; i++) {
//			for(int j=1; j<=13; j++) {
//				Card c1 = new Card();
//				c1.setShape(shape[i]);
//				c1.setNum(j);
//				c1.print();
//			}
//			System.out.println(); // 줄바꿈
//		}
//		
	}

}
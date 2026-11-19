package day11;

import java.util.Arrays;

public class CardPack {
	/* 52장의 Card 객체를 배열로 저장 pack
	 * ♥A~♥K / ◆A~◆K / ♣A~♣K / ♠A~♠K
	 * 
	 * */
	
	/* 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
	 * - 생성자 : pack의 초기값을 52장의 카드로 초기화
	 * - 메서드
	 * 1. 카드를 섞는 기능
	 * 2. 플레이어에게 한장씩 나눠주는 기능
	 * 3. 카드를 초기화 기능 (나눠준 카드 회수)
	 * 
	 * */
	private Card[] pack = new Card[52]; // 초기값 null
	private int packIndex = 0;
	
	
	//생성자
	public CardPack() {
		String shape[] = {"♥", "◆", "♣", "♠"};
		// i = shape 번지 / j => 숫자 1~13
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<=13; j++ ) {
				Card c = new Card();
				c.setShape(shape[i]);
				c.setNum(j);
				pack[packIndex] = c;
				packIndex++;
			}
			
		}
		
	}
	
	// 카드 섞는 메서드 => 배열 안의 값을 랜덤으로 자리 바꾸기
	public void CardMix() {
		
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length); // 교환할 랜덤 번지
			// 교환
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
		
		
	}
	
	// 플레이어에게 한장씩 나눠주는 기능
	// pack 배열에 가장 끝 번지의 카드 1장을 리턴
	// 리턴타입 : 카드 1장 => Card	
	public Card pick() {
		if(packIndex==0) {
			return null;
		}
	    packIndex--;
	    return pack[packIndex];
	    
	}

	// 카드를 초기화 기능 (나눠준 카드 회수)
	// index를 원래대로 회복 =>52
	public void init() {
	    packIndex = 52;
	    CardMix(); // 다시 섞기
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getPackIndex() {
		return packIndex;
	}

	public void setPackIndex(int packIndex) {
		this.packIndex = packIndex;
	}

	@Override
	public String toString() {
		return "[" + Arrays.toString(pack) + "] / packIndex :" +packIndex ;
	}
	
}
	

	

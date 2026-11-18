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
	int packIndex = 0;
	String shape[] = {"♥", "◆", "♣", "♠"};
	
	//생성자
	public CardPack() {
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<=13; j++ ) {
				Card c1 = new Card();
				c1.setShape(shape[i]);
				c1.setNum(j);
				pack[packIndex] = c1;
				packIndex++;
			}
			
		}
		
	}
	
	public void CardMix() {
		
		for(int i=0; i<pack.length; i++) {
			int index = (int)(Math.random()*pack.length);
			Card t = pack[i];
			pack[i] = pack[index];
			pack[index] = t;
		}
		//System.out.println(Arrays.toString(pack));
		
		
	}
	
	public Card CardPick() {
	    packIndex--;
	    Card c = pack[packIndex];
	    return c;
	}

	

	//카드회수
	public void CardReset() {
	    packIndex = 52;
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

	public String[] getShape() {
		return shape;
	}

	public void setShape(String[] shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "CardPack [pack=" + Arrays.toString(pack) + ", packIndex=" + packIndex + ", shape="
				+ Arrays.toString(shape) + "]";
	}
	
	


}

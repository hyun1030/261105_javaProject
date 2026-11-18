package day04;

public class For05 {

	public static void main(String[] args) {
		// 구구단
		
		int dan = 2; // 2~9까지 반복


		for (int i=1; i<=9; i++  ) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		System.out.println("--------------------");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		/* 2*1=2 3*1=3 4*1=4 ... 9*1=9
		 * 2*2=4 3*2=6 4*2=8 ... 9*2=18
		 * 
		 * ...
		 * */
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"  ");
			} 
			System.out.println();
		}

	}

}

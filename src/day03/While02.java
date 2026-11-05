package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~50까지 짝수만 출력하고 싶어요
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * 32 34 36 38 40
		 * 42 44 46 48 50
		 * System.out.print(); : 줄바꿈이 없는 출력
		 * 
		 * */
		// 10 20 30 40 50 => 10의 배수면 enter
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i +" ");
				if(i%10==0) {
					System.out.println();
				}
				
			}
			
		}
		
		int i=0;
		while(i<=50) {
			if(i%2==0) {
			System.out.print(i+ " ");
			if(i%10==0) {
				System.out.println(); // 줄바꿈
			}
		}
		i++;
	}
		System.out.println("------------------");
		
		// 5번 출력 enter => 출력 count 변수가 필요
		i=1;
		int count=0;
		while(i<=50) {
			if(i%2==0) {
				System.out.print(i + " ");
				count++;
			}
			if(count == 5) {
				System.out.println();
				count=0;
			}
			i++;
		}
				

	}

}

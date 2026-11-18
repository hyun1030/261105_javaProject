package day09;

import java.util.Arrays;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV t= new TV("LG");
		t.printInfo();
		System.out.println(t.toString());
		
		t.power();
		t.volumeUp();
		
		
		t.volumeDown();
	
		t.ChannelUp();
		t.ChannelUp();
		
		t.ChannelUp();
		
		t.pick();
		t.pick();
		t.ChannelUp();
		t.pick();
		t.pick();
		t.ChannelUp();
		t.pick();

		t.favorList();
		System.out.println(t.toString());
		

	}

}

class TV {
	// brand, power, ch, vol, favor[]
	// 채널은 계속 업을 누르다가 20번까지 가면 순환으로 다시 0번으로 감(마이너스도 )
	// vol = 10까지만 0이면 계속 0이고 음소거
	// 기본생성자를 3번/볼륨3으로 등록
	
	/* 선호채널 등록
	 * 5개까지만 등록 가능 (배열 만들어야함)
	 * 1. 선호채널 등록 메서드
	 * - 현재 채널 번호를 선호채널 배열에 넣기
	 * 2. 선호채널 리스트 보기
	 * - 등록된 선호채널을 리스트로 출력
	 * 
	 * */
	
	private String brand;
	private int channel;
	private boolean power;
	private int vol;
	private int[] favor;
	private int i;
	private int index;
	private int count;
	
	// tv brand
	public TV() {}
	
	public TV(String brand) {
		this.brand = "LG"; // 중간에 바꿀 수 없는 값 == 상수 ==final =>전부 대문자
		this.channel = 3;
		this.vol = 3;
		this.favor = new int[5]; // 생성자로 객체 생성시 배열의 실 객체를 메모리에 올림
	}
	
	//public void favor() {
	//	favor[i] = channel;
	//	i++;
	//}
	// 선호채널 등록 => 메서드를 한번 호출하면 배열 1개 채워짐
	// 번지로 사용할 변수가 필요함 => 메서드를 호출할 때마다 +1 증가
//	public void pick() {
//		//int index = 0; // 호출할때마다 0번지로 호출
//		boolean check = false;
//		if(power) {
//			if(favor.length == index) {
//				// 더 이상 등록된 자리가 없을때
//				// 1. 0번지로 이동
//				index = 0;
//			}
//			// 채널 중복 방지
//			for(i=0; i<favor.length; i++) {
//				if(favor[i]==channel); {
//					check = true;
//				}
//			}
//			if(!check) {
//				favor[index] = channel;
//				index++; // 선호채널 1개 등록
//				count++; // 선호채널 등록한 횟수
//			}
//			System.out.println(channel+"번 선호채널 등록 완료!");
//			
//		}
//	}
	
	public void pick() {
		//2. 배열을 늘려서 값을 더 추가
		boolean check = false;
		if(power) {
			if(index == favor.length) {
				int[] arr = new int[favor.length+3]; // 현재 배열에 3개 추가
				System.arraycopy(favor, 0, arr, 0, favor.length);
				//배열의 주소변경
				favor = arr;
			}
	
			// 채널 중복 방지
			for(int i=0; i<favor.length; i++) {
				if(favor[i] == channel) {
					check = true;
				}
			}
			if(!check) {
				favor[index] = channel;
				index++;
			}
		}
	}
	
	
	
	// 선호채널 리스트
	public void favorList() {
		// index의 위치에 따라 선호채널 등록 개수 확인
		System.out.println("--선호채널 리스트--");
		if(count == 0) {
			System.out.println("등록된 선호채널이 없습니다.");
			return;
		}
		int cnt= count > index ? favor.length : index;
		
		for(int i=0; i<cnt; i++) {
			System.out.print(favor[i]+"  ");
		}
		System.out.println();
	}
	

	
	
	// 출력메서드
	public void printInfo() {
		System.out.println(brand);
	}
	
	
	
	// 전원켜기(끄기)
	public void power() {
		this.power = !this.power;
        if (this.power) {
            System.out.println("TV 전원이 켜졌습니다.");
        } else {
            System.out.println("TV 전원이 꺼졌습니다.");
        }
        
	}
	
	// vol up
	public void volumeUp() {
		if(!power) {
			System.out.println("TV 전원이 꺼져있습니다.");
			
		} 
		if(vol<10) {
			vol++;
			System.out.println("현재 볼륨 : "+vol);
			
		} else {
			System.out.println("볼륨이 최대치(10) 입니다.");
		}
		
	}
	
	
	// vol down
	public void volumeDown() {
		if(!power) {
			System.out.println("TV 전원이 꺼져있습니다.");
			
		} else if(vol>1) {
			vol--;
			System.out.println("현재 볼륨 : "+vol);
			
		} else{
			System.out.println("음소거 상태입니다.");
			return;
		}
		
	}
	
	// ch up 20번까지 20이 넘어가면 순환
	public void ChannelUp() {
		if(!power) { 
			System.out.println("TV 전원이 꺼졌습니다");
			return;
		}
		if(channel < 20) {
			channel++;
		} else {
			channel=1;
		} 
		System.out.println("현재 채널 : "+channel);

		
	}
	
	// ch down 0~20 순환
	public void ChannelDown() {
		if(!power) { 
			System.out.println("TV 전원이 꺼졌습니다");
			return;
		}
		if(channel > 1) {
			channel--;
		} else {
			channel=20;
		} 
		System.out.println("현재 채널 : "+channel);
		
	}
	
	
	//toString : 멤버변수를 String 리턴
	@Override
	public String toString() {
		return "TV [brand=" + brand + ", channel=" + channel + ", power=" + power + ", vol=" + vol + ", favor="
				+ Arrays.toString(favor) + ", i=" + i + "]";
	}
	
	//getter / setter
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}
	
	
	
	
	
	
	
}
package day16;

public class Generics02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsPrint<powder> powerPrint = new GenericsPrint<>();
		powerPrint.setMeterial(new powder());
		System.out.println(powerPrint);
		
		GenericsPrint<plastic> plasticPrint = new GenericsPrint<>();
		plasticPrint.setMeterial(new plastic());
		System.out.println(plasticPrint);
		
		GenericsPrint print = new GenericsPrint(); // object
		print.setMeterial("아무거나");
		System.out.println(print);
	}

}
class GenericsPrint<T>{
	private T meterial;

	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "GenericsPring [meterial=" + meterial + "]";
	}
	
}

class powder {
	public String toString() {
		return "재료는 파우더 입니다.";
	}
	
}

class plastic{
	public String toString() {
		return "재료는 플라스틱 입니다. ";
	}
}
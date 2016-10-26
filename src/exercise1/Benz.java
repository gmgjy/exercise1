package exercise1;

public class Benz implements Car, Host {	//implements는 다중 상속 가능
	String name = "벤츠";
	String host = "상근";

	@Override
	public void is_ride() {
		System.out.println(name + "가 달립니다.");
	}

	@Override
	public void refueling() {
		System.out.println(host + "이 " + name + "에 주유중입니다.");
	}

	@Override
	public void whos_host() {
		System.out.println(name + "는 " + host + "의 것입니다.");
	}	
}

class ab_Benz extends ab_Car {				// JAVA에서는 추상클래스를 통해서 다중상속이 불가능 하여 implements를 사용한다.
	String name = "벤츠";

	@Override
	public void run() {
		System.out.println(name + "가 달립니다.");
	}

	@Override
	public void refuel(String street) {
		System.out.println(name + "가 " + street + "위를 달립니다.");
	}
}
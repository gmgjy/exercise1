package exercise1;

public class Ford implements Car, Host {	//implements는 다중 상속 가능
	String name = "포드";
	String host = "형준";

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

class ab_Ford extends ab_Car {				//추상클래스를 통해서는 다중상속이 불가
	String name = "포드";

	@Override
	public void run() {
		System.out.println(name + "가 달립니다.");
	}

	@Override
	public void refuel(String street) {
		System.out.println(name + "가 " + street + "위를 달립니다.");
	}

}

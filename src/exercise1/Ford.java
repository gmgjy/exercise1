package exercise1;

public class Ford implements Car, Host {
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
		System.out.println(name + "은 " + host + "의 것입니다.");
	}

}

class ab_Benz extends ab_Car {
	String name = "벤츠";

	@Override
	public void run() {
		System.out.println(name + "이 달립니다.");
	}

	@Override
	public void refuel(String name) {
	}
}

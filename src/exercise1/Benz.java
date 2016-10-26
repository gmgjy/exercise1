package exercise1;

public class Benz implements Car, Host {
	String name = "벤츠";
	String host = "상근";

	@Override
	public void is_ride() {
		System.out.println(name + "가 달립니다.");
	}

	@Override
	public void refueling() {
		System.out.println(host + "가 " + name + "에 주유중입니다.");
	}

	@Override
	public void whos_host() {
		System.out.println(name + "는 " + host + "의 것입니다.");
	}

}

class ab_Ford extends ab_Car {
	String name = "포드";

	@Override
	public void run() {
		System.out.println(name + "가 달립니다.");
	}

	@Override
	public void refuel(String name) {
	}
}


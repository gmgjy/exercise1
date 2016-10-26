package exercise1;

abstract class ab_Car {
	public abstract void run();

	public void refuel(String name) {
		System.out.println(name + "이 주유중입니다.");
	}
}

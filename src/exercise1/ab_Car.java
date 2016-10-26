package exercise1;

abstract class ab_Car {					
	public abstract void run();			// 추상 클래스는 추상 메소드가 하나 이상 있어야 한다.
										// body부분이 없더라도 {}가 존재하면 추상클래스가 아니다.
	public void refuel(String name) {	// 추상클래스에서 추상 메소드가 아닌 일반 메소드도 사용할 수 있다.
		System.out.println(name + "이 주유중입니다.");
	}
}

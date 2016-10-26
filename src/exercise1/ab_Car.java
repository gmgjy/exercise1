package exercise1;

abstract class ab_Car { // 추상 메소드가 없더라도 abstract 키워드를 붙이면 추상 클래스이다.
	public abstract void run(); // 추상 메소드가 있으면 자식 클래스에서 반드시 오버라이딩 해야 한다.
								// body부분이 없더라도 {}가 존재하면 추상클래스가 아니다.

	public void refuel(String name) { // 추상클래스에서 추상 메소드가 아닌 일반 메소드도 사용할 수 있다.
		System.out.println(name + "이 주유중입니다.");
	}

	public void fix() { // 일반 메소드는 반드시 오버라이딩 할 필요는 없다.
	}
}

package exercise1;

public class Benz implements Car, Host {
	String name = "����";
	String host = "���";

	@Override
	public void is_ride() {
		System.out.println(name + "�� �޸��ϴ�.");
	}

	@Override
	public void refueling() {
		System.out.println(host + "�� " + name + "�� �������Դϴ�.");
	}

	@Override
	public void whos_host() {
		System.out.println(name + "�� " + host + "�� ���Դϴ�.");
	}

}

class ab_Ford extends ab_Car {
	String name = "����";

	@Override
	public void run() {
		System.out.println(name + "�� �޸��ϴ�.");
	}

	@Override
	public void refuel(String name) {
	}
}


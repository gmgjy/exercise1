package exercise1;

public class Ford implements Car, Host {	//implements�� ���� ��� ����
	String name = "����";
	String host = "����";

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

class ab_Ford extends ab_Car {				//�߻�Ŭ������ ���ؼ��� ���߻���� �Ұ�
	String name = "����";

	@Override
	public void run() {
		System.out.println(name + "�� �޸��ϴ�.");
	}

	@Override
	public void refuel(String street) {
		System.out.println(name + "�� " + street + "���� �޸��ϴ�.");
	}

}

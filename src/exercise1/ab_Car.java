package exercise1;

abstract class ab_Car { // �߻� �޼ҵ尡 ������ abstract Ű���带 ���̸� �߻� Ŭ�����̴�.
	public abstract void run(); // �߻� �޼ҵ尡 ������ �ڽ� Ŭ�������� �ݵ�� �������̵� �ؾ� �Ѵ�.
								// body�κ��� ������ {}�� �����ϸ� �߻�Ŭ������ �ƴϴ�.

	public void refuel(String name) { // �߻�Ŭ�������� �߻� �޼ҵ尡 �ƴ� �Ϲ� �޼ҵ嵵 ����� �� �ִ�.
		System.out.println(name + "�� �������Դϴ�.");
	}

	public void fix() { // �Ϲ� �޼ҵ�� �ݵ�� �������̵� �� �ʿ�� ����.
	}
}

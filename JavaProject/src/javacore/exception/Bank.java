package javacore.exception;

public class Bank {

	public static void main(String[] args) {
		Checking c = new Checking(10);
		System.out.println("�������: 300 ����� ��������:" + c.getNumber());
		c.deposit(300.00);

		try {
			System.out.println("\n������ 100");
			c.withdraw(100.00);
			System.out.println("������:" + c.getBalance());

			System.out.println("\n������ 100.");
			c.withdraw(100.00);
			System.out.println("������:" + c.getBalance());
		} catch (InsufficientFundsException e) {
			System.out.println("��������, �� ������� " + e.getAmount());
			e.printStackTrace();
		}
	}
}
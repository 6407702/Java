import java.util.Scanner; // ����������� �����

public class Input {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		System.out.print("������� ����� �����: ");
		if (sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� �����
								// ������� ����� �����
			if (sc.nextInt() % 2 == 0) // ��������� ����� ����� � ������ ����� �
			// ��������� � ����������
			{
				System.out.println("������");
			}

			else {
				System.out.println("��������");
			}

		} else {
			System.out.println("�� ����� �� ����� �����");
		}
	}

}

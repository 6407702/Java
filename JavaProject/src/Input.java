import java.util.Scanner; // импортируем класс

public class Input {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно
								// считать целое число
			if (sc.nextInt() % 2 == 0) // считывает целое число с потока ввода и
			// сохраняем в переменную
			{
				System.out.println("Четное");
			}

			else {
				System.out.println("Нечетное");
			}

		} else {
			System.out.println("Вы ввели не целое число");
		}
	}

}

package javacore.cycle;

public class ForEachRunner {
	public static void main(String[] args) {
		String[] arrayofstrings = { "Proselyte", "Java Core", "Tutorial" };

		System.out.println("Array of strings:");
		for (String string : arrayofstrings) {
			System.out.print(string + " ");
		}

		System.out.println("\n============================\n");

		System.out.println("Array of integers:");
		int[] arrayofint = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int element : arrayofint) {
			System.out.print(element + " ");
		}
	}
}
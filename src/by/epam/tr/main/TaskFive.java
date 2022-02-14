package by.epam.tr.main;

public class TaskFive {

	public static void main(String[] args) {
		double[] numbers = new double[]{-22.3,45.8,18.15};
		System.out.println("Исходный массив:");
		for (int i=0; i<numbers.length; i++) {
			System.out.printf("%4.2f \t", numbers[i]);
		}
		System.out.println();
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>=0) {
				numbers[i] = Math.pow(numbers[i], 2);
			} else {
				numbers[i] = Math.pow(numbers[i], 4);
			}
		}
		System.out.println("После возведения в степень:");
		for (int i=0; i<numbers.length; i++) {
			System.out.printf("%4.2f   ", numbers[i]);
		}

	}

}

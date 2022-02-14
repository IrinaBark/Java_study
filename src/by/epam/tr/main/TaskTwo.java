package by.epam.tr.main;

public class TaskTwo {

	public static void main(String[] args) {
		int a = 5;
		int b = -10;
		int c = -4;
		double result;
		result = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a, 3)*c + Math.pow(b,2);
		System.out.printf("%4.2f",result);

	}

}

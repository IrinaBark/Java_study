package by.epam.tr.main;

public class TaskThree {

	public static void main(String[] args) {
		int a = 23;
		int b = 12;
		int hyp = (int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		int P = a + b + hyp;
		double S = 0.5*(a*b);
		System.out.println("Периметр - "+P+", Площадь - "+S);

	}

}

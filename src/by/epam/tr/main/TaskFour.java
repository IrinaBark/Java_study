package by.epam.tr.main;

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите координату по оси абсцисс(целое число) >");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("¬ведите координату по оси абсцисс(целое число) >");
		}
		int x = sc.nextInt();
		System.out.print("¬ведите координату по оси ординат(целое число) >");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("¬ведите координату по оси ординат(целое число) >");
		}
		int y = sc.nextInt();
		if((x>=-2&&x<=2)&&(y>=0&&y<=4)||(x>=-4&&x<=4)&&(y>=-3&&y<=0)) {
			result = true;
			System.out.println(result);
		} else {
			System.out.println(result);
		}
		sc.close();

	}

}

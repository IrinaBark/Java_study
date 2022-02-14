package by.epam.tr.main;
import java.util.Scanner;
public class TaskSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min,max;
		double sum = 0;
		double[] mas = new double[3];
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print("Введите действительное число номер "+(i+1)+" >");
			while(!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Вы ввели что-то другое! Введите, пожалуйста, действительное число номер "+(i+1)+" >");
			}
			
			mas[i] = sc.nextDouble();
			sc.nextLine();
		}
		min = mas[0];
		max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i]<min) {
				min = mas[i];
			}	
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i]>max) {
				max = mas[i];
			}
		}
		sum = min + max;
		System.out.println("Сумма большего и меньшего их трех чисел: "+sum);
		sc.close();
		}

}

package by.epam.tr.main;
import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		int sum1;
		boolean result = false;
		System.out.print("Введите четырехзначное число >");
		for(;;) {
			if (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Вы ввели что-то другое. \nПожалуйста, введите четырехзначное число >");
		    }else if((number=sc.nextInt())>9999||number<1000) {
		    	System.out.print("Пожалуйста, введите четырехзначное число >");
		    	sc.nextLine();
		    }else  break;
			
		}
		for(int i=0;i<2;i++) {
			sum += number%10;
			number /= 10;
		}
        sum1 = number/10 + number%10;
        if (sum == sum1) {
        	result = true;
        	System.out.println(result);
        } else {
        	System.out.println(result);
          }
        sc.close();
	}

}
        /**boolean result;
		int x = 2231;
		int number = x/10;
		int four = x%10;
		int three = number%10;
		number = number/10;
		int two = number%10;
		int one = number/10;
		if((one+two)==(three+four)) {
			result=true;
		} else result = false;
		System.out.println(result);*/

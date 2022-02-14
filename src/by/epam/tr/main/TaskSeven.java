package by.epam.tr.main;

public class TaskSeven {

	public static void main(String[] args) {
		int a = 1;
		int b = 49;
		int h = 3;
		int leng = 0;
		for(int i = a; i <= b; i+=h) {
			leng +=1;
		}
		int[] arg = new int[leng];
		double[] func = new double[leng];  
		for(int i = 0; i < arg.length; i++) {
			arg[i] = a;
			func[i] = Math.pow(Math.sin(arg[i]),2) - Math.cos(2*arg[i]);
			a += h;
		}
		System.out.println("Аргумент \t  Значение функции");
		for(int i = 0; i < arg.length; i++) {
			 System.out.printf("  %d \t\t     %+6.4f \n",arg[i],func[i]);
			 
		}
		
	}

}

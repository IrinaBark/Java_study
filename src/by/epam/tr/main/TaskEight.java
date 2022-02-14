package by.epam.tr.main;

public class TaskEight {

	public static void main(String[] args) {
		 int n = 100;
		 int k = 4;
		 int sum = 0;
		 int[] num = new int[n];
		 for(int i = 1; i <= num.length; i++) {
			 num[i-1] = i;
		 }
		 for(int i = 0; i < num.length; i++) {
			 if(num[i]%k == 0) {
				 sum += num[i];
			 }
		 }
		 System.out.println(sum);

	}

}

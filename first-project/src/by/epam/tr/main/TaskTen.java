package by.epam.tr.main;

public class TaskTen {

	public static void main(String[] args) {
		int n = 10;
		int[][] mas = new int[n][n];
		for(int i = 0;i<mas.length;i += 2) {
			for(int j = 0; j < mas[i].length;j++) {
				mas[i][j] = j+1;
				mas[i+1][j] = mas[i].length - j;
			}
		}
		for(int i = 0;i<mas.length; i++) {
			for(int j = 0; j<mas[i].length;j++) {
				System.out.printf("%d    ",mas[i][j]);
			}
			System.out.println();
		}

	}

}

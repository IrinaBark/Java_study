package by.epam.tr.main;
import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		Random rand = new Random();
		int count = 0;
		int[] array1 = new int[10];
		int[] array2 = new int[15];
		int[] array = new int[array1.length+array2.length];
		int k = 5;
		for(int i = 0; i<array1.length; i++) {
			array1[i] = rand.nextInt(100);
			System.out.printf("%d   ", array1[i]);
		}
		System.out.println();
		for(int i = 0; i<array2.length; i++) {
			array2[i] = rand.nextInt(100);
			System.out.printf("%d   ", array2[i]);
		}
		System.out.println();
		for(int i = 0;i<array.length;i++) {
			if(i<=k) {
			array[i] = array1[i];
			} else if(count<array2.length) {
				array[i] = array2[count];
				count++;
			} else {
				array[i] = array1[k+1];
				k++;
			}
			}
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d  ",array[i]);
		}
		}
		
		
	}



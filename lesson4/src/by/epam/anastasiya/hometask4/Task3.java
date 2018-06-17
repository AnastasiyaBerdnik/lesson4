package by.epam.anastasiya.hometask4;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		int[] numbers = new int [50];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*50);
		
		}
		System.out.println (Arrays.toString(numbers));
		
		boolean flag = true;
		for (int i =1; i<numbers.length; i++) {
			if (numbers[i] < numbers[i-1]) {
				flag = false;
				break;
			}
		}
		if (flag ==true){
			System.out.println ("Массив является возрастающей последовательностью");
		}
			else {
				System.out.println("Массив не является возрастающей последовательностью");
			}
		
	}

}

package by.epam.anastasiya.hometask4;

public class Task2 {
	public static void main(String[] args){
		int sum = 0;
		int[] numbers = {2, 5, 7, 8, 3, 0,8,9,6,7,2,6}; 
	
		for (int i = 0; i <  numbers.length; i++) {
     if (numbers[i] % 6== 0) {  //проверка числа на кратность 3
         sum = sum + numbers[i];
		}
     System.out.println ("сумма кратных = " + sum);
   
	}
	}
}


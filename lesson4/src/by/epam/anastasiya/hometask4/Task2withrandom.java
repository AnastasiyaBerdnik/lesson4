package by.epam.anastasiya.hometask4;

public class Task2withrandom {
		public static void main(String[] args){
			int sum = 0;
			int [] numbers= new int[10];
			
			for (int i = 0; i< numbers.length; i++){
				numbers[i] = (int)(Math.random()* 9) +1;
			}
			
		
			for (int i = 0; i <  numbers.length; i++) {
	     if (numbers[i] % 3== 0) {  //проверка числа на кратность 3
	         sum = sum + numbers[i];
			}
	     System.out.println ("сумма кратных = " + sum);
	   
		}
		}
	}





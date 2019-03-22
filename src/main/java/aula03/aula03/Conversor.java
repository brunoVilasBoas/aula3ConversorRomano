package aula03.aula03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		Integer numero = null;
		
		while(true) {
			try {
				System.out.print("Digite um número de (1 a 3000): ");
		        // String input 
				numero = sc.nextInt();
				break;
				
			} catch (InputMismatchException e) {
				
				System.out.println("Erro! Digite um número!");
			}
		}
    
        
        System.out.print(numero); 
	}

}

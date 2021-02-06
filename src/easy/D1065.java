package easy;

import java.util.Scanner;

public class D1065 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int v, cont = 0; //Declara as Varaiáveis 
		for(int i=0; i<=4; i++) { //Loop 5 vezes
			v = s.nextInt();
			if(v%2==0) { //Se o resto da divisao do numero enviado por 2 for 0 é PAR
				cont++; //Incrementa 1 no contador de numeros pares
			}
 		}
				
			System.out.println(cont + " valores pares");	

	}

}

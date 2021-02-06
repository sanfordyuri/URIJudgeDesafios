package easy;

import java.util.Scanner;

public class D1066 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int v = 0;
		int cont = 0; //Declara as Varaiáveis 
		int conti = 0;
		int p = 0;
		int n = 0;
		
		for(int i=0; i<=4; i++) { //Loop 5 vezes
			v = s.nextInt();
			if(v>0) {
				p++;
			} else if(v<0) {
				n++;
			}
			if(v%2==0) { //Se o resto da divisao do numero enviado por 2 for 0 é PAR
				cont++; //Incrementa 1 no contador de numeros pares
			} else {
				conti++;
			}
 		}
						
		System.out.println(cont + " valor(es) par(es)");	
		System.out.println(conti + " valor(es) impar(es)");
		System.out.println(p + " valor(es) positivo(s)");
		System.out.println(n + " valor(es) negativo(s)");
	}

}

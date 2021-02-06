package easy;

import java.util.Scanner;

public class D1064 {


	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n = 0;
        int cont = 0;
        double v = 0;
        for (int i=0; i <= 5; i++) {
        	n = leitor.nextDouble();
        	if (n > 0) {
        	     cont++;
        	     v+=n;
        	}
        }
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f \n", (v/cont));		
	}

}

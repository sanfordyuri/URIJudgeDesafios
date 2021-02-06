package easy;

import java.util.Scanner;

public class D1071 {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int soma = 0;
		int n =0;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		if(x > y) {
			int sub = x-y;
			y+=1;
			for(int i=0; i<(sub-1); i++) {
				n = y++;
				if(!(n%2==0)) {
					soma += n;
				}
	
			}
		} else if(y > x) {
			int sub = y-x;
			y+=1;
			for(int i=0; i<(sub-1); i++) {
				n = x++;
				if(!(n%2==0)) {
					soma += n;
				}
			}			
		} else if(y==x) {
			soma = 0;
		}
		
		System.out.println(soma);

	}

}

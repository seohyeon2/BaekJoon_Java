/*
import java.util.*;
public class No1110 {
	public static void main(String[] args) {
		int n,t,u,temp,count = 0,sum=0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		temp = n;
		
		while(true) {
			count++;
			t = n / 10;
			u = n % 10;
			sum = t + u ;
			n = (u*10)+(sum%10);

			if(temp == n) {
				System.out.println(count);
				break;
			} 
		}
		
	}

}
*/

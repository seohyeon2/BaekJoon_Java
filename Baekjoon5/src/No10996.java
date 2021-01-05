/*
import java.util.*;
public class No10996 {
	public static void main(String[] args) {
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1; i<=n*2; i++) { // 행 제어
			if(i%2 != 0) {  // 홀수행일 때 
				for(j=1; j<=n; j++) {  
					if(j%2 != 0) { // 홀수열일 때
						System.out.print("*");
					} else { // 짝수열일 때
						System.out.print(" ");
					}
				}
				System.out.println();
			} else { // 짝수행일 때 
				for(j=1; j<=n; j++) {
					if(j%2 != 0) { // 홀수열일 때 
						System.out.print(" ");
					} else { // 짝수열일 때 
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
	}	

}
*/
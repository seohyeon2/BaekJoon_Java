/*
import java.util.*;
public class No2446 {
	public static void main(String[] args) {
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// ¡å»ï°¢Çü 
		for(i=1; i<=n; i++) { // Çà Á¦¾î
			for(j=0; j<i-1; j++) { // ¾ÕÂÊ ºóÄ­ Á¦¾î
				System.out.print(" ");
			}
			for(j=0; j<=n-i; j++) { // Ã¹ ¹øÂ° º°Âï±â 
				System.out.print("*");
			}
			for(j=0; j<n-i; j++) { // µÎ ¹øÂ° º°Âï±â
				System.out.print("*");
			}
			System.out.println();
		}
		// ¡ã»ï°¢Çü
		for(i=1; i<n; i++) { // Çà Á¦¾î
			for(j=1; j<n-i; j++) { // ¾ÕÂÊ ºóÄ­ Á¦¾î
				System.out.print(" ");
			}
			for(j=0; j<i; j++) { // Ã¹ ¹øÂ° º°Âï±â 
				System.out.print("*");
			}
			for(j=0; j<i+1; j++) { // µÎ ¹øÂ° º°Âï±â
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
*/
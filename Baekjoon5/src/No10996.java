/*
import java.util.*;
public class No10996 {
	public static void main(String[] args) {
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1; i<=n*2; i++) { // �� ����
			if(i%2 != 0) {  // Ȧ������ �� 
				for(j=1; j<=n; j++) {  
					if(j%2 != 0) { // Ȧ������ ��
						System.out.print("*");
					} else { // ¦������ ��
						System.out.print(" ");
					}
				}
				System.out.println();
			} else { // ¦������ �� 
				for(j=1; j<=n; j++) {
					if(j%2 != 0) { // Ȧ������ �� 
						System.out.print(" ");
					} else { // ¦������ �� 
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
	}	

}
*/
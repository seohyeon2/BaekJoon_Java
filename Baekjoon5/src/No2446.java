/*
import java.util.*;
public class No2446 {
	public static void main(String[] args) {
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		// ��ﰢ�� 
		for(i=1; i<=n; i++) { // �� ����
			for(j=0; j<i-1; j++) { // ���� ��ĭ ����
				System.out.print(" ");
			}
			for(j=0; j<=n-i; j++) { // ù ��° ����� 
				System.out.print("*");
			}
			for(j=0; j<n-i; j++) { // �� ��° �����
				System.out.print("*");
			}
			System.out.println();
		}
		// ��ﰢ��
		for(i=1; i<n; i++) { // �� ����
			for(j=1; j<n-i; j++) { // ���� ��ĭ ����
				System.out.print(" ");
			}
			for(j=0; j<i; j++) { // ù ��° ����� 
				System.out.print("*");
			}
			for(j=0; j<i+1; j++) { // �� ��° �����
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
*/
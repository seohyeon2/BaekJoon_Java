/*
import java.util.*;
public class No1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// ��������
		int n,i,m=0;
	    double sum=0,avg=0;
	
	    // ���� ���� �Է� ���� ��, ���� ��ŭ�� ũ�⸦ ���� �迭 ����
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0; i<n; i++) {
			//���� ���� �迭�� �ֱ�
			arr[i] = sc.nextInt();
			
			//������ �ִ� ���ϱ�
			if(arr[i]>m) {
				m = arr[i];
			}
			//���� ���� ���ϱ�
			sum += arr[i];
		}
		//���ο� ��� ���ؼ� ���
		avg = ((sum/m)*100)/n;
		System.out.println(avg);

	}	

}
*/
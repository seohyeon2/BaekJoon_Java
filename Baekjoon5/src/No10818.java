/*
import java.util.*;
public class No10818 {
	public static void main(String[] args) {
        //���� ����
		int n,i,min=0,max=0;
		
        //n �Է� ��, n�� ũ�⸦ ���� �迭 ����
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		
        //n�� �Է� ����
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
		}
		
        //�ּ�, �ִ� �⺻ �� ����
		min = arr[0];
		max = arr[0];
		
       //�ּ�, �ִ� ��
		for(i=1;i<n;i++) {
			if(arr[i] >= max) max = arr[i];
			if(arr[i] <= min) min = arr[i];		
		}

		System.out.println(min + " " + max);	
	}	

}
*/
/*
import java.util.*;
public class No8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// ��������
		int n,i,j,count=0;

	    // �׽�Ʈ���̽� ���� �Է� ���� ��, ���� ��ŭ�� ũ�⸦ ���� �迭 ����
		n = sc.nextInt();
		sc.nextLine();
		String[] OX = new String[n];
		int[] score = new int[n];
		
		for(i=0; i<n; i++) {
			//���̽� �� ���ڿ� �Է�
			OX[i] = sc.nextLine();
			
			//���ڿ� �� ���� ���
			for(j=0; j<OX[i].length(); j++) {
				if(OX[i].charAt(j) == 'O') {
				count++;
				score[i] += count;
			    }else {
			    	count = 0;
			    }
		    }	
			count = 0;
		}
		//���̽� �� ���� ���
		for(i=0;i<n;i++) System.out.println(score[i]);
	}

}
*/
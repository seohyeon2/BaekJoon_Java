/*
import java.util.*;
public class No4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// ��������
		int c,n,i,j;
		
	    // �׽�Ʈ ���� �Է� ���� ��, ���� ��ŭ�� ũ�⸦ ���� �迭 ����
		c = sc.nextInt();
		String[] line_avg = new String[c];
		
		for(i=0; i<c; i++) {
			//���� ���� ����
			int sum =0,count=0;
			double avg=0,ratio=0;
			
			// �� ������ n���� �л� �� ���� �Է� ��, �л� ���� ���� ���ϱ�  
			n = sc.nextInt();
			int[] student_score = new int[n];
			for(j=0;j<n;j++) {
				student_score[j] = sc.nextInt();
				sum += student_score[j];
			}
			
			//�л� ��� ���ϰ� ��� �Ѵ� �л� �� ���ϱ� 
			avg = sum/n;
			for(j=0;j<n;j++) {
				if(student_score[j]>avg) count++;
			}
			
			//��� �Ѵ� �л� ���� ���ϰ� �迭�� �ֱ� 
			ratio = (double)count/n*100;
			line_avg[i] = String.format("%.3f", ratio);
		}

		//���� ���
		for(i=0; i<c; i++) {
			System.out.println(line_avg[i]+"%");
		}
	}

}
*/
/*
import java.util.*;
public class No10039 {
	public static void main(String[] args) {
	     
        //���� ����
		int[] students = new int[5];
		int i,avg=0;
		
		Scanner sc = new Scanner(System.in);
		
       //�л����� ������ �Է¹ް� students �迭�� �ִ� �ڵ�
		for(i = 0; i<students.length; i++) {
			students[i] = sc.nextInt();
			if(students[i]<40) { //�Է¹��� �л� ������ 40�� �Ʒ��� 40������ �����ϴ� �ڵ�
				students[i] = 40;
			}
			avg += students[i]; // �л����� ������ avg�� �־� ������ ���ϴ� �ڵ�
		}
		
        //��� ���ؼ� ���
		System.out.println(avg/5);
		
	}

}
*/
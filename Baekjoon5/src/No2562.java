/*
import java.util.*;
public class No2562 {
	public static void main(String[] args) {
        //���� ����
		int i, max=0, count=1;
		
        //�ڿ��� ���� �迭 ����
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
        //�ڿ��� 9�� �Է� ����
		for(i=0;i<9;i++) {
			arr[i]=sc.nextInt();			
		}
		
        //�ִ� �⺻ �� ����
		max = arr[0];
		
        //�ִ밪 ���ϰ�, ���° �ִ��� ī��Ʈ �ϱ� 
		for(i=1;i<9;i++) {
			if(arr[i] >= max) {
				max = arr[i];
				count = i+1 ;
			}
		}

		System.out.println(max);
		System.out.println(count);
	}	

}
*/
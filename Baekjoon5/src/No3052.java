/*
import java.util.*;
public class No3052 {
	public static void main(String[] args) {
		// ����, �迭 ����
		int i,j,cnt=0;
		int[] arr = new int[10]; 
		
		// ���� 10�� �Է��� ���� 42�� ���� ��, ������ ���� �迭�� ���� 
		Scanner sc = new Scanner (System.in);
		for(i=0; i<10; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		//������ ���� ����, �ߺ��� �ִٸ� �ϳ��� �� �� �ְ� �ϱ�
		for(i=0; i<10; i++) {
			cnt++;
			for(j=i+1; j<10; j++) {
				if(arr[i] == arr[j]) {
					cnt--;
					break;
				}
			}		
		}	
		System.out.println(cnt);
	}	

}
*/
/*
import java.util.*;

public class No5543 {
	public static void main(String[] args) {
        //���� ����
		int[] hamburger = new int[3];
		int[] beverage = new int[2];
		
		int i,cheap_h=0,cheap_b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<3; i++) { //�ܹ��� �� �Է¹ޱ�
			hamburger[i] = sc.nextInt(); 
			if(i==0) { //���� �� ���
				cheap_h = hamburger[0]; 
			}else { //[0]~[2]���� ���ϸ� ������ ���� ���� cheap_h�� �ֱ�
				if(hamburger[i]<cheap_h) cheap_h = hamburger[i];
			}
		}
		
		for(i=0; i<2; i++) { //����� �� �Է¹ޱ�
			beverage[i] = sc.nextInt();
			if(i==0) { //���� �� ���
				cheap_b = beverage[0]; 
			}else { //[0]~[2]���� ���ϸ� ������ ���� ���� cheap_b�� �ֱ�
				if(beverage[i]<cheap_b) cheap_b = beverage[i];
			}
		}
	
        //���� �� ������ �ܹ��ſ� ����� ���ݿ� 50�� �������༭ ���
		System.out.println(cheap_h + cheap_b - 50);
		
	}

}
*/
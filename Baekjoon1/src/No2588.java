/*
import java.util.*;
public class No2588 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1, n2;
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
    //(n1 x n2�� '���� �ڸ�'�� ��)�� r1�� �ִ� �ڵ�
	int r1 = n1*(n2%10);
	System.out.println(r1);
	
    //(n1 x n2�� '���� �ڸ�'�� ��)�� r2�� �ִ� �ڵ�
	int r2 = n1*((n2%100)/10);
	System.out.println(r2);

    //(n1 x n2�� '���� �ڸ�'�� ��)�� r3�� �ִ� �ڵ�
	int r3 = n1*(n2/100);
	System.out.println(r3);
	
    //�� �ڸ��� �ش��ϴ� ���� ���� ���ؼ� ���� ���� ���ϴ� �ڵ�
	int r4 = r1+(r2*10)+(r3*100);
	System.out.println(r4);
	}
}
*/
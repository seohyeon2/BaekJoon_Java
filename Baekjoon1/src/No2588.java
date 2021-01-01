/*
import java.util.*;
public class No2588 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1, n2;
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	
    //(n1 x n2의 '일의 자리'의 값)을 r1에 넣는 코드
	int r1 = n1*(n2%10);
	System.out.println(r1);
	
    //(n1 x n2의 '십의 자리'의 값)을 r2에 넣는 코드
	int r2 = n1*((n2%100)/10);
	System.out.println(r2);

    //(n1 x n2의 '백의 자리'의 값)을 r3에 넣는 코드
	int r3 = n1*(n2/100);
	System.out.println(r3);
	
    //각 자리에 해당하는 원래 값을 더해서 최종 값을 구하는 코드
	int r4 = r1+(r2*10)+(r3*100);
	System.out.println(r4);
	}
}
*/
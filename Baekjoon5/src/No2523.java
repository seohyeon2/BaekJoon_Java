/*
import java.util.*;
public class No2523 {
	public static void main(String[] args) {
		int n,i,j;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
       //1번째 부터 N번째까지 1씩 증가하는 코드
		for(i=1;i<=n;i++) { //행 제어
			for(j=0;j<i;j++) { //별 제어
				System.out.print("*");
			}
			System.out.println();
		}

        //N번째 이후부터 1씩 감소하는 코드
		for(i=1;i<n;i++) {
			for(j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
*/
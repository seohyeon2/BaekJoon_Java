/*
import java.util.*;
public class No2577 {
	public static void main(String[] args) {
		// 변수 선언
		int a,b,c,i,mul,mul_len,len=0;
		
		// a,b,c 입력
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		mul = a*b*c;
		mul_len = mul;
		
		// mul 자리수 구하기
		while (mul_len>0) {
			mul_len /= 10;
			len++;
		}
		
		// 배열 선언
		int[] abc_mul = new int[len];
		int[] number = new int[10];
		
		// abc_mul 배열에 mul 1의 자리부터 값 넣고 switch문 사용해서 숫자 갯수 세기
		for(i=0; i<len; i++) {
			abc_mul[i] = mul % 10;
			mul /=10;
			
			switch(abc_mul[i]) {
			case 0: number[0]++; break;
			case 1: number[1]++; break;
			case 2: number[2]++; break;
			case 3: number[3]++; break;
			case 4: number[4]++; break;
			case 5: number[5]++; break;
			case 6: number[6]++; break;
			case 7: number[7]++; break;
			case 8: number[8]++; break;
			case 9: number[9]++; break;
			}
		}
		
		// 0~9까지 갯수 출력
		for(i=0; i<10; i++) {
			System.out.println(number[i]);
		}

	}

}
*/
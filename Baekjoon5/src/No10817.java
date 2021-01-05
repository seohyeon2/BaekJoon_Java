/*
import java.util.*;
public class No10817 {
	public static void main(String[] args) {
		int a,b,c,result=0;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
       //삼항연산자 사용해서 경우의 수 나눠주기
		if(a>=b) {
			result = (c>a)? a : ((c>b)? c:b); 
		} else if(b>=c) {
			result = (a>b)? b : ((a>c)? a:c); 
		}else if(c>=a){
			result = (b>c)? c : ((b>a)? b:a); 
		}

		System.out.println(result);
		
	}

}
*/
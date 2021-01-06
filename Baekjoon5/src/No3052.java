/*
import java.util.*;
public class No3052 {
	public static void main(String[] args) {
		// 변수, 배열 선언
		int i,j,cnt=0;
		int[] arr = new int[10]; 
		
		// 숫자 10개 입력한 값을 42로 나눈 후, 나머지 값을 배열에 저장 
		Scanner sc = new Scanner (System.in);
		for(i=0; i<10; i++) {
			arr[i] = sc.nextInt() % 42;
		}

		//나머지 갯수 세기, 중복이 있다면 하나만 셀 수 있게 하기
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
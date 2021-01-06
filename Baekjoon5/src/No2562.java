/*
import java.util.*;
public class No2562 {
	public static void main(String[] args) {
        //변수 선언
		int i, max=0, count=1;
		
        //자연수 담을 배열 선언
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
        //자연수 9개 입력 받음
		for(i=0;i<9;i++) {
			arr[i]=sc.nextInt();			
		}
		
        //최대 기본 값 설정
		max = arr[0];
		
        //최대값 비교하고, 몇번째 있는지 카운트 하기 
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
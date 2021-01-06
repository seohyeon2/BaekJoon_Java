/*
import java.util.*;
public class No10818 {
	public static void main(String[] args) {
        //변수 선언
		int n,i,min=0,max=0;
		
        //n 입력 후, n의 크기를 갖는 배열 선언
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		
        //n개 입력 받음
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
		}
		
        //최소, 최대 기본 값 설정
		min = arr[0];
		max = arr[0];
		
       //최소, 최대 비교
		for(i=1;i<n;i++) {
			if(arr[i] >= max) max = arr[i];
			if(arr[i] <= min) min = arr[i];		
		}

		System.out.println(min + " " + max);	
	}	

}
*/
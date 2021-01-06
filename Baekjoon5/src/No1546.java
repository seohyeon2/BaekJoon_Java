/*
import java.util.*;
public class No1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 변수선언
		int n,i,m=0;
	    double sum=0,avg=0;
	
	    // 과목 갯수 입력 받은 후, 갯수 만큼의 크기를 갖는 배열 선언
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0; i<n; i++) {
			//현재 성적 배열에 넣기
			arr[i] = sc.nextInt();
			
			//성적의 최댓값 구하기
			if(arr[i]>m) {
				m = arr[i];
			}
			//성적 총합 구하기
			sum += arr[i];
		}
		//새로운 평균 구해서 출력
		avg = ((sum/m)*100)/n;
		System.out.println(avg);

	}	

}
*/
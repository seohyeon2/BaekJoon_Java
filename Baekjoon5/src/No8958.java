/*
import java.util.*;
public class No8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 변수선언
		int n,i,j,count=0;

	    // 테스트케이스 갯수 입력 받은 후, 갯수 만큼의 크기를 갖는 배열 선언
		n = sc.nextInt();
		sc.nextLine();
		String[] OX = new String[n];
		int[] score = new int[n];
		
		for(i=0; i<n; i++) {
			//케이스 별 문자열 입력
			OX[i] = sc.nextLine();
			
			//문자열 별 점수 계산
			for(j=0; j<OX[i].length(); j++) {
				if(OX[i].charAt(j) == 'O') {
				count++;
				score[i] += count;
			    }else {
			    	count = 0;
			    }
		    }	
			count = 0;
		}
		//케이스 별 점수 출력
		for(i=0;i<n;i++) System.out.println(score[i]);
	}

}
*/
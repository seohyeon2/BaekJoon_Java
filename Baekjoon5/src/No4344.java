/*
import java.util.*;
public class No4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 변수선언
		int c,n,i,j;
		
	    // 테스트 갯수 입력 받은 후, 갯수 만큼의 크기를 갖는 배열 선언
		c = sc.nextInt();
		String[] line_avg = new String[c];
		
		for(i=0; i<c; i++) {
			//리셋 변수 선언
			int sum =0,count=0;
			double avg=0,ratio=0;
			
			// 각 라인의 n명의 학생 별 점수 입력 후, 학생 점수 총합 구하기  
			n = sc.nextInt();
			int[] student_score = new int[n];
			for(j=0;j<n;j++) {
				student_score[j] = sc.nextInt();
				sum += student_score[j];
			}
			
			//학생 평균 구하고 평균 넘는 학생 수 구하기 
			avg = sum/n;
			for(j=0;j<n;j++) {
				if(student_score[j]>avg) count++;
			}
			
			//평균 넘는 학생 비율 구하고 배열에 넣기 
			ratio = (double)count/n*100;
			line_avg[i] = String.format("%.3f", ratio);
		}

		//비율 출력
		for(i=0; i<c; i++) {
			System.out.println(line_avg[i]+"%");
		}
	}

}
*/
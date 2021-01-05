/*
import java.util.*;
public class No10039 {
	public static void main(String[] args) {
	     
        //변수 선언
		int[] students = new int[5];
		int i,avg=0;
		
		Scanner sc = new Scanner(System.in);
		
       //학생들의 점수를 입력받고 students 배열에 넣는 코드
		for(i = 0; i<students.length; i++) {
			students[i] = sc.nextInt();
			if(students[i]<40) { //입력받은 학생 점수가 40점 아래면 40점으로 수정하는 코드
				students[i] = 40;
			}
			avg += students[i]; // 학생들의 점수를 avg에 넣어 총점을 구하는 코드
		}
		
        //평균 구해서 출력
		System.out.println(avg/5);
		
	}

}
*/
/*
import java.util.*;

public class No5543 {
	public static void main(String[] args) {
        //변수 선언
		int[] hamburger = new int[3];
		int[] beverage = new int[2];
		
		int i,cheap_h=0,cheap_b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<3; i++) { //햄버거 값 입력받기
			hamburger[i] = sc.nextInt(); 
			if(i==0) { //기준 값 잡기
				cheap_h = hamburger[0]; 
			}else { //[0]~[2]까지 비교하며 가격이 작은 값을 cheap_h에 넣기
				if(hamburger[i]<cheap_h) cheap_h = hamburger[i];
			}
		}
		
		for(i=0; i<2; i++) { //음료수 값 입력받기
			beverage[i] = sc.nextInt();
			if(i==0) { //기준 값 잡기
				cheap_b = beverage[0]; 
			}else { //[0]~[2]까지 비교하며 가격이 작은 값을 cheap_b에 넣기
				if(beverage[i]<cheap_b) cheap_b = beverage[i];
			}
		}
	
        //가장 싼 가격의 햄버거와 음료수 가격에 50을 할인해줘서 출력
		System.out.println(cheap_h + cheap_b - 50);
		
	}

}
*/
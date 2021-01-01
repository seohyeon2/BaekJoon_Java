/*
import java.util.*;
public class No2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H,M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(H>0 && M-45<0) {
			H -= 1;
			M += (60-45);
			System.out.println(H + " " + M);
		} else if(H==0 && M-45<0) {
			H = 24-1;
			M += (60-45);
			System.out.println(H + " " + M);
		}  else {
			M -= 45;
			System.out.println(H + " " + M);
		}

		}
}
*/
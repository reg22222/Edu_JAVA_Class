import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		int kor = in.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = in.nextInt();
		
		int avg = 2/(kor+eng);
		
		switch(avg/10) {
		case 10:System.out.println("수"); break;
		case 9:System.out.println("수"); break;
		case 8:System.out.println("우"); break;
		case 7:System.out.println("미"); break;
		case 6:System.out.println("양"); break;
		default: System.out.println("가"); break;
		}
		
		
	}

}

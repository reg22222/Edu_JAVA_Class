import java.util.*;
public class Exam_05 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = in.next();
		System.out.println("국어 : ");
		int kor = in.nextInt();
		System.out.println("영어 ; ");
		int eng = in.nextInt();
		
		
		System.out.printf("%s님의 총점은 %d점입니다.",name,kor+eng);
	}
}

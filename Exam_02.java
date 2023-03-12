import java.util.*;
public class Exam_02 {
	public static void main(String[] args) {
		//예제1
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		int kor = in.nextInt();
		
		if (kor >= 60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
	}
		
}

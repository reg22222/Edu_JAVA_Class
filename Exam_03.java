import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		//예제2
		Scanner in = new Scanner(System.in);
		
		System.out.println("임의의 정수 입력 :");
		int num = in.nextInt();
		
		if (num == 0)
		{
			System.out.println("0");
		}
		else if (num%2 != 0)
		{
			System.out.println("홀수");
		}
		else
		{
			System.out.println("짝수");
			
		}
		
	}
}

import java.util.*;
public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 수 입력 : ");
		
		int n1 = in.nextInt();
		System.out.println("두번째 수 입력 :");
		int n2 = in.nextInt();
		
		if (n1 < n2)
		{
			System.out.printf("%d가 더 크다",n2);
		}
		else if (n1>n2)
		{
			System.out.printf("%d이 더 크다",n1);
		}
		else
		{
			System.out.println("같다");
		}
	}
}

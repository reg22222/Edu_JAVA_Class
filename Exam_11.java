import java.util.*;
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է� :");
		int n = in.nextInt();
		int sum=0;
		
		for(int i = 1 ; i <= n ; ++i)
		{
			sum += i;
			
		}
		
		System.out.printf("1����  %d������ �� : %d",n,sum);
	}

}

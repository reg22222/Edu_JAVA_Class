import java.util.*;
public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int n = in.nextInt();
		
		for(int i = 1; i <= n ; ++i)
		{
			if (n % i == 0)
			{
				System.out.println(i);
				
			}
		}
	}

}

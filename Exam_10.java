import java.util.*;

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("단수를 입력 : ");
		int dan = in.nextInt();
		
		for(int i = 1 ; i <= 9 ; i++)
		{
			System.out.printf("%d X %d = %d\n",dan,i,dan*i);
		}
	}
}

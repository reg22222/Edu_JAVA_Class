import java.util.*;
public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int n = (int)(Math.random()*100)+1;

		int co = 0;
		
		while(true)
		{
			System.out.println("수를 입력  : ");
			int a = in.nextInt();
			if(a < n)
			{
				System.out.println("UP");
				++co;
				continue;
			}
			else if(a > n)
			{
				System.out.println("DOWN");
				++co;
				continue;
			}
			else
			{
				System.out.println(co+"번만에 맞추셨습니다.");
				break;
			}
		}
	}
	
}

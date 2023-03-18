import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = 0;
		int a = 0;
		while(true)
		{
			System.out.println("분을 입력 : ");
			int n = in.nextInt();
			if(n >0)
			{
				if(n>= 0 && n < 60)
				{
					System.out.println("0시간 "+n+"분입니다.");
					continue;
				}
				else if(n >= 60)
				{
					s = n / 60;
					a = n % 60;
					System.out.println(s + "시간"+a+"분입니다.");
					continue;
				}
			}
			else if(n < 0)
			{
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			else
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}

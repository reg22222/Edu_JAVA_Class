import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("임의의 수 입력 : ");
		int n = in.nextInt();
		
		int jujang[] = new int[n];
		
		for(int i = 2 ; i <= n ; ++i)
		{
			for(int j = 2; j <=i ; ++j)
			{
				if(i%j==0) // i를j로 나누었을때 나머지가 0이면 J는 나누어 진 수
				{
					if(i == j) //나누어진 J와 현재 비교대상인 I가 같은 수라면 솟수, 아니면 솟수아님
					{
						System.out.print(j+" ");
					}
					break;
				}
			}
		}
		
		
	}
}

import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("인원수 입력 : ");
		int inwon = in.nextInt();
		
		String name1[] = new String[inwon];
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int tot[] = new int[inwon];
		int rank[] = new int[inwon];
		//배열은 초기값을 지정하지 않아도 알아서 초기값이 지정된다.
		//정수형은 0, 실수형은 0.0, 논리형은  false로 초기값이 부여된다
		
		for(int i = 0 ; i < inwon ; ++i)
		{
			
			System.out.println(i+1+"번째 이름 입력 : ");
			name1[i] = in.next();
			 
			System.out.println(i+1+"번째 국어점수 입력 : ");
			kor[i] = in.nextInt();
			
			System.out.println(i+1+"번째 영어점수 입력 : ");
			eng[i] = in.nextInt();
			tot[i] = kor[i] + eng[i];
			
		}
		//순위 구하기
		for(int i=0 ; i<inwon; ++i)
		{
			rank[i] = 1;
			for(int j = 0; j<inwon; ++j)
			{
				if(tot[i] < tot[j])
				{
					++rank[i];
				}
			}
		}
		
		for(int i = 0; i <= inwon ; ++i)
		{
			System.out.println(name1[i] + "의  총점 :"+tot[i]+"이고 순위는 :"+rank[i] + "등입니다.");
			
			
		}
		
	}

}

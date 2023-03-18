import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수 입력 : ");
		int n1 = in.nextInt();
		System.out.println("수 입력 : ");
		int n2 = in.nextInt();
		
		//작은 수 찾기 : 작은수보다 큰 수는 절때 공약수가 될 수 없다.
		if(n1 < n2)
		{
			int a = n1;
			n1 = n2;
			n2 = a;
		}
		
		int gcd = 0;
		if(n2%n1 == 0)
		{
			gcd = n1;
		}
		else
		{
			for(int i = 1 ; i<= n1/2; ++i)
			{
				if(n1 % i == 0) //i값이 작은수의 약수라면
				{
					if(n2 % i == 0)//i값이 큰수의 약수인지도 물어본다.
					{
						gcd = i;//둘다 약수라면 gcd를 i값으로 바꾸어 준다
					}
				}
			}
		System.out.println(gcd);
		}
				
		
		
	}

}

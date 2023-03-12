import java.util.*;
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력 : ");
		int n1 = in.nextInt();
		System.out.println("두 번쨰 정수 입력 :");
		int n2 = in.nextInt();
		System.out.println("세 번쨰 정수 입력 :");
		int n3 = in.nextInt();
		
		
		
		
		//n1에 큰수 넣기
		if (n2 > n1 && n2 >= n3)
		{
			int imsi = n1;
			n1 = n2;
			n2 = imsi;
			
		}
		else if(n3 > n1 && n3 > n2)
		{
			int imsi = n1;
			n1 = n3;
			n3 = imsi;
		}
		//n1에 제일 큰 수가 넣어졌다
		
		
		//n2에 두번째 큰수 넣기
		if(n3 > n2)
		{
			int imsi = n2;
			n2 = n3;
			n3 = imsi;
		}
		//su2에 두번째 큰 수가 넣어졌다
		System.out.printf("%d >= %d >= %d",n1,n2,n3);
		//입력받은 값이 어떠하든, 제일 큰수를  n1에 넣고
		//두번째 큰수를 n2에 넣고, 세번째 큰수를  n3에 넣는다
		
		
	}
}

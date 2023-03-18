import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		int count = 0;
		while(true)
		{
			System.out.println("임의의 수를 입력 : ");
			int n = in.nextInt();
			
			if(n <1) break;
			sum += n;
			++count;
		}
		System.out.printf("합 : %d 평균 : %d",sum+sum/count);
	}

}

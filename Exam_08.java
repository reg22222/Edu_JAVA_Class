import java.util.*;
public class Exam_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		int count = 0;
		while(true)
		{
			System.out.println("������ ���� �Է� : ");
			int n = in.nextInt();
			
			if(n <1) break;
			sum += n;
			++count;
		}
		System.out.printf("�� : %d ��� : %d",sum+sum/count);
	}

}

import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ �� �Է� : ");
		int n = in.nextInt();
		
		int jujang[] = new int[n];
		
		for(int i = 2 ; i <= n ; ++i)
		{
			for(int j = 2; j <=i ; ++j)
			{
				if(i%j==0) // i��j�� ���������� �������� 0�̸� J�� ������ �� ��
				{
					if(i == j) //�������� J�� ���� �񱳴���� I�� ���� ����� �ڼ�, �ƴϸ� �ڼ��ƴ�
					{
						System.out.print(j+" ");
					}
					break;
				}
			}
		}
		
		
	}
}

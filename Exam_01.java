import java.util.*;
public class Exam_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�ο��� �Է� : ");
		int inwon = in.nextInt();
		
		String name1[] = new String[inwon];
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int tot[] = new int[inwon];
		int rank[] = new int[inwon];
		//�迭�� �ʱⰪ�� �������� �ʾƵ� �˾Ƽ� �ʱⰪ�� �����ȴ�.
		//�������� 0, �Ǽ����� 0.0, ������  false�� �ʱⰪ�� �ο��ȴ�
		
		for(int i = 0 ; i < inwon ; ++i)
		{
			
			System.out.println(i+1+"��° �̸� �Է� : ");
			name1[i] = in.next();
			 
			System.out.println(i+1+"��° �������� �Է� : ");
			kor[i] = in.nextInt();
			
			System.out.println(i+1+"��° �������� �Է� : ");
			eng[i] = in.nextInt();
			tot[i] = kor[i] + eng[i];
			
		}
		//���� ���ϱ�
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
			System.out.println(name1[i] + "��  ���� :"+tot[i]+"�̰� ������ :"+rank[i] + "���Դϴ�.");
			
			
		}
		
	}

}

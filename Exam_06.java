import java.util.*;
public class Exam_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�� �Է� : ");
		int n1 = in.nextInt();
		System.out.println("�� �Է� : ");
		int n2 = in.nextInt();
		
		//���� �� ã�� : ���������� ū ���� ���� ������� �� �� ����.
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
				if(n1 % i == 0) //i���� �������� ������
				{
					if(n2 % i == 0)//i���� ū���� ��������� �����.
					{
						gcd = i;//�Ѵ� ������ gcd�� i������ �ٲپ� �ش�
					}
				}
			}
		System.out.println(gcd);
		}
				
		
		
	}

}

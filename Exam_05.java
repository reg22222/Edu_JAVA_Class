import java.util.*;
public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է� : ");
		int n1 = in.nextInt();
		System.out.println("�� ���� ���� �Է� :");
		int n2 = in.nextInt();
		System.out.println("�� ���� ���� �Է� :");
		int n3 = in.nextInt();
		
		
		
		
		//n1�� ū�� �ֱ�
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
		//n1�� ���� ū ���� �־�����
		
		
		//n2�� �ι�° ū�� �ֱ�
		if(n3 > n2)
		{
			int imsi = n2;
			n2 = n3;
			n3 = imsi;
		}
		//su2�� �ι�° ū ���� �־�����
		System.out.printf("%d >= %d >= %d",n1,n2,n3);
		//�Է¹��� ���� ��ϵ�, ���� ū����  n1�� �ְ�
		//�ι�° ū���� n2�� �ְ�, ����° ū����  n3�� �ִ´�
		
		
	}
}

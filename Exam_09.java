import java.util.*;
public class Exam_09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = 0;
		int a = 0;
		while(true)
		{
			System.out.println("���� �Է� : ");
			int n = in.nextInt();
			if(n >0)
			{
				if(n>= 0 && n < 60)
				{
					System.out.println("0�ð� "+n+"���Դϴ�.");
					continue;
				}
				else if(n >= 60)
				{
					s = n / 60;
					a = n % 60;
					System.out.println(s + "�ð�"+a+"���Դϴ�.");
					continue;
				}
			}
			else if(n < 0)
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			else
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	}

}

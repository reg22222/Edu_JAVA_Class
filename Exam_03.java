import java.util.*;
public class Exam_03 {
	public static void main(String[] args) {
		//����2
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ ���� �Է� :");
		int num = in.nextInt();
		
		if (num == 0)
		{
			System.out.println("0");
		}
		else if (num%2 != 0)
		{
			System.out.println("Ȧ��");
		}
		else
		{
			System.out.println("¦��");
			
		}
		
	}
}
